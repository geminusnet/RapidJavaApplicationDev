package eventdemo;

import java.util.*;
import java.awt.event.*;

public class TickUsingActionEvent 
  implements java.io.Serializable, Runnable {
  /** A thread to control tick */
  protected Thread thread = null;

  /** Whether the thread is suspended */
  private boolean suspended = true;

  /** Store Tick listeners in a vector */
  private Vector tickListenerList;

  /** tickCount */
  private long tickCount = 0;

  /** tickInterval */
  private long tickInterval = 1000;

  /** Default constructor */
  public TickUsingActionEvent() {
    // Create and start the thread
    thread = new Thread(this);
    thread.start();
  }

  /** Return tickInterval */
  public long getTickInterval() {
    return tickInterval;
  }

  /** Return tickCount */
  public long getTickCount() {
    return tickCount;
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

      // Increase the tick count
      tickCount++;

      // Fire ActionEvent
      processEvent(new ActionEvent(this,
        ActionEvent.ACTION_PERFORMED, null));
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

  /** Register an action event listener */
  public synchronized void addActionListener(ActionListener l) {
    Vector v = tickListenerList == null ?
      new Vector(2) : (Vector)tickListenerList.clone();
    if (!v.contains(l)) {
      v.addElement(l);
      tickListenerList = v;
    }
  }

  /** Remove an action event listener */
  public synchronized void removeActionListener(ActionListener l) {
    if (tickListenerList != null && tickListenerList.contains(l)) {
      tickListenerList.removeElement(l);
    }
  }

  /** Fire TickEvent */
  public void processEvent(ActionEvent e) {
    Vector v;

    synchronized (this) {
      v = (Vector)tickListenerList.clone();
    }

    for (int i=0; i < v.size(); i++) {
      ActionListener listener = (ActionListener)v.elementAt(i);
      listener.actionPerformed(e);
    }
  }
}