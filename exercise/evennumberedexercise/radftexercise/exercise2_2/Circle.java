package exercise2_2;

import java.awt.*;
import javax.swing.JPanel;

public class Circle extends JPanel {

  private double radius = 20;

  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  public double getRadius() {
    return radius;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getSize().width / 2;
    int yCenter = getSize().height / 2;
    int radius = (int)getRadius();

    g.drawOval(xCenter - radius, yCenter - radius,
      2 * radius, 2 * radius);
  }

  public double findArea() {
    return radius * radius * Math.PI;
  }
}