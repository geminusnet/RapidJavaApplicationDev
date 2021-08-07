package exercise4_4;

import java.awt.event.*;
import java.util.*;

public class RectangleModel {

  public RectangleModel() {
  }
  
  private java.awt.Color color;
  private boolean filled;
  private transient Vector actionListeners;
  private double height;
  private double width;

  public double getWidth() {
    return width;
  }

  public void setWidth(double newWidth) {
    width = newWidth;

    // Notify the listener for the change on width
    fireActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "width"));
  }

  public void setHeight(double newHeight) {
    height = newHeight;

    // Notify the listener for the change on height
    fireActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "height"));
  }

  public double getHeight() {
    System.out.println("my height " + height);
    return height;
  }

  public void setColor(java.awt.Color newColor) {
    color = newColor;

    // Notify the listener for the change on color
    fireActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "color"));
  }

  public java.awt.Color getColor() {
    return color;
  }

  public void setFilled(boolean newFilled) {
    filled = newFilled;

    // Notify the listener for the change on filled
    fireActionPerformed(
      new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "filled"));
  }

  public boolean isFilled() {
    return filled;
  }

  public synchronized void removeActionListener(ActionListener l) {
    if(actionListeners != null && actionListeners.contains(l)) {
      Vector v = (Vector) actionListeners.clone();
      v.removeElement(l);
      actionListeners = v;
    }
  }

  public synchronized void addActionListener(ActionListener l) {
    Vector v = actionListeners == null ? new Vector(2) : (Vector) actionListeners.clone();
    if(!v.contains(l)) {
      v.addElement(l);
      actionListeners = v;
    }
  }

  protected void fireActionPerformed(ActionEvent e) {
    if(actionListeners != null) {
      Vector listeners = actionListeners;
      int count = listeners.size();
      for (int i = 0; i < count; i++) {
        ((ActionListener) listeners.elementAt(i)).actionPerformed(e);
      }
    }
  }

  public double findArea() {
    return width * height;
  }

  public double findPerimeter() {
    return 2 * (width + height);
  }
}