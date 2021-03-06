package eventdemo;

import eventdemo.*;
import java.util.Vector;

public class Tick implements java.io.Serializable, Runnable {
  /** A thread to control tick */
  protected Thread thread = null;

  /** Whether the thread is suspended */
  private boolean suspended = true;

  /** Store Tick listeners in a vector */
  private Vector tickListenerList;

  /** Tick event e */
  private TickEvent e;

  /**  Tick count and Tick interval */
  private long tickCount = 0;
  private long tickInterval = 1000;

  /** Default constructor */
  public Tick() {
    // Create a TickEvent
    e = new TickEvent(this);

    // Create and start the thread
    thread = new Thread(this);
    thread.start();
  }

  /** Return tickInterval */
  public long getTickInterval() {
    return tickInterval;
  }

  /** Set a tickInterval */
  public void setTickInterval(long interval) {
    tickInterval = interval;
  }

  /** Run the thread */
  public void run() {
    while (true) {
      try {
        Thread.sleep(tickInterval);
        synchronized (this) {
          while (suspended)
            wait();
        }
      }
      catch (InterruptedException e) {  }

      // Adjust Tick count and interval
      e.setTickCount(tickCount++);
      e.setTickInterval(tickInterval);

      // Fire TickEvent
      processEvent(e);
    }
  }

  /** Resume the thread */
  public synchronized void start() {
    if (suspended) {
      suspended = false;
      notify();
    }
  }
  
  /** Suspend the thread */
  public synchronized void stop() {
    suspended = true;
  }

  /** Register a tick event listener */
  public synchronized void addTickListener(TickListener l) {
    Vector v = tickListenerList == null ?
      new Vector(2) : (Vector)tickListenerList.clone();
    if (!v.contains(l)) {
      v.addElement(l);
      tickListenerList = v;
    }
  }

  /** Remove a tick event listener */
  public synchronized void removeTickListener(TickListener l) {
    if (tickListenerList != null && tickListenerList.contains(l)) {
      tickListenerList.removeElement(l);
    }
  }

  /** Fire TickEvent */
  public void processEvent(TickEvent e) {
    Vector v;

    synchronized (this) {
      v = (Vector)tickListenerList.clone();
    }

    for (int i=0; i < v.size(); i++) {
      TickListener listener = (TickListener)v.elementAt(i);
      listener.handleTick(e);
    }
  }
}