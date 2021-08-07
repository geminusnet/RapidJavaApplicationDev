package modelviewdemo;

import java.awt.event.*;
import java.util.*;

public class CircleModel {
  /** Holds value of property radius. */
  private double radius = 20;
  
  /** Holds value of property filled. */
  private boolean filled;
  
  /** Holds value of property color. */
  private java.awt.Color color;
  
  /** Utility field used by event firing mechanism. */
  private javax.swing.event.EventListenerList listenerList =  null;
  
  public CircleModel() {
  }
  
  public double getRadius() {
    return radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
    
    // Notify the listener for the change on radius
    fireActionListenerActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "radius"));
  }
  
  public boolean isFilled() {
    return filled;
  }
  
  public void setFilled(boolean filled) {
    this.filled = filled;
    
    // Notify the listener for the change on filled
    fireActionListenerActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "filled"));
  }

  public java.awt.Color getColor() {
    return color;
  }
  
  public void setColor(java.awt.Color color) {
    this.color = color;
    
    // Notify the listener for the change on color
    fireActionListenerActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "color"));
  }
  
  public synchronized void addActionListener(
    java.awt.event.ActionListener listener) {
    if (listenerList == null ) {
      listenerList = new javax.swing.event.EventListenerList();
    }
    listenerList.add(java.awt.event.ActionListener.class, listener);
  }
  
  public synchronized void removeActionListener(
    java.awt.event.ActionListener listener) {
    listenerList.remove(
      java.awt.event.ActionListener.class, listener);
  }
  
  private void fireActionListenerActionPerformed(
    java.awt.event.ActionEvent event) {
    if (listenerList == null) return;
    Object[] listeners = listenerList.getListenerList();
    for (int i = listeners.length-2; i>=0; i-=2) {
      if (listeners[i]==java.awt.event.ActionListener.class) {
        ((java.awt.event.ActionListener)listeners[i+1]).
          actionPerformed(event);
      }
    }
  } 
}