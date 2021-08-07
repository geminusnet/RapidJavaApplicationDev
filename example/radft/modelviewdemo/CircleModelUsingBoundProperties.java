package modelviewdemo;

public class CircleModelUsingBoundProperties {
  /** Holds value of property radius. */
  private double radius;
  
  /** Utility field used by bound properties. */
  private java.beans.PropertyChangeSupport propertyChangeSupport =  
    new java.beans.PropertyChangeSupport(this);
  
  /** Holds value of property filled. */
  private boolean filled;
  
  /** Holds value of property color. */
  private java.awt.Color color;
  
  /** Creates new CircleModelUsingBoundProperties */
  public CircleModelUsingBoundProperties() {
  }
  
  public void addPropertyChangeListener(
    java.beans.PropertyChangeListener l) {
    propertyChangeSupport.addPropertyChangeListener(l);
  }
  
  public void removePropertyChangeListener(
    java.beans.PropertyChangeListener l) {
    propertyChangeSupport.removePropertyChangeListener(l);
  }
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    double oldRadius = this.radius;
    this.radius = radius;
    propertyChangeSupport.firePropertyChange("radius", 
      new Double(oldRadius), new Double(radius));
  }
  
  public boolean isFilled() {
    return filled;
  }
  
  public void setFilled(boolean filled) {
    boolean oldFilled = this.filled;
    this.filled = filled;
    propertyChangeSupport.firePropertyChange("filled", 
      new Boolean(oldFilled), new Boolean(filled));
  }
  
  public java.awt.Color getColor() {
    return color;
  }
  
  public void setColor(java.awt.Color color) {
    java.awt.Color oldColor = this.color;
    this.color = color;
    propertyChangeSupport.firePropertyChange(
      "color", oldColor, color);
  } 
}