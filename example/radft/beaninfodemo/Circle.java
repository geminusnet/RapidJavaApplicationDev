package beaninfodemo;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
  private int radius = 30;
  private boolean filled;

  public Circle() {
  }

  public int readRadius() {
    return radius;
  }

  public void writeRadius(int radius) {
    this.radius = radius;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getSize().width/2;
    int yCenter = getSize().height/2;

    if (filled)
      g.fillOval(xCenter - radius, yCenter - radius,
        2*radius, 2*radius);
    else
      g.drawOval(xCenter - radius, yCenter - radius,
        2*radius, 2*radius);
  }
}