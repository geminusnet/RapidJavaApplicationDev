
//Title:        Your Product Name
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Y. Daniel Liang
//Company:      IPFW
//Description:  Your description

package exercise3_2;

import java.util.*;

public class MemoryWatch implements Runnable {
  private int highLimit = 700000;
  private int lowLimit = 200000;

  private Runtime runtime = Runtime.getRuntime();

  private Thread thread;
  private transient Vector memoryListeners;

  public MemoryWatch() {
    thread = new Thread(this);
    thread.start();
  }

  public void run() {
    while (true) {
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {  }

      System.out.println("Total Memory " + runtime.totalMemory());
      System.out.println("Free Memory " + runtime.freeMemory());

      if (runtime.freeMemory() > highLimit) {
        MemoryEvent e = new MemoryEvent(this);
        fireSufficientMemory(e);
      }

      if (runtime.freeMemory() < lowLimit) {
        MemoryEvent e = new MemoryEvent(this);
        fireInsufficientMemory(e);
      }
    }
  }

  public static void main(String[] args) {
    MemoryWatch memoryWatch1 = new MemoryWatch();
  }

  public void setHighLimit(int newHighLimit) {
    highLimit = newHighLimit;
  }

  public int getHighLimit() {
    return highLimit;
  }

  public void setLowLimit(int newLowLimit) {
    lowLimit = newLowLimit;
  }

  public int getLowLimit() {
    return lowLimit;
  }

  public synchronized void removeMemoryListener(MemoryListener l) {
    if(memoryListeners != null && memoryListeners.contains(l)) {
      Vector v = (Vector) memoryListeners.clone();
      v.removeElement(l);
      memoryListeners = v;
    }
  }

  public synchronized void addMemoryListener(MemoryListener l) {
    Vector v = memoryListeners == null ? new Vector(2) : (Vector) memoryListeners.clone();
    if(!v.contains(l)) {
      v.addElement(l);
      memoryListeners = v;
    }
  }

  protected void fireSufficientMemory(MemoryEvent e) {
    if(memoryListeners != null) {
      Vector listeners = memoryListeners;
      int count = listeners.size();
      for (int i = 0; i < count; i++) {
        ((MemoryListener) listeners.elementAt(i)).sufficientMemory(e);
      }
    }
  }

  protected void fireInsufficientMemory(MemoryEvent e) {
    if(memoryListeners != null) {
      Vector listeners = memoryListeners;
      int count = listeners.size();
      for (int i = 0; i < count; i++) {
        ((MemoryListener) listeners.elementAt(i)).insufficientMemory(e);
      }
    }
  }
}