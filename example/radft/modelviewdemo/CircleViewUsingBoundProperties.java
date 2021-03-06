package modelviewdemo;

import javax.swing.*;
import java.beans.*;
import java.awt.*;

public class CircleViewUsingBoundProperties
extends JPanel implements PropertyChangeListener {
  /** Holds value of property model. */
  private CircleModelUsingBoundProperties model;
  
  /** Creates new form CircleViewUsingBoundProperties */
  public CircleViewUsingBoundProperties() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    
    setLayout(new java.awt.BorderLayout());
    
    addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        formMouseClicked(evt);
      }
    });
    
  }//GEN-END:initComponents
  
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      if (model == null) return;
      
      if (evt.isMetaDown())
        model.setRadius(model.getRadius()-5);
      else
        model.setRadius(model.getRadius()+5);
    }//GEN-LAST:event_formMouseClicked
    
    public void propertyChange(PropertyChangeEvent evt) {
      // TODO: implement this java.beans.PropertyChangeListener method;
      repaint();
    }
    
    public void setModel(CircleModelUsingBoundProperties newModel) {
      model = newModel;
      
      // Register listener
      if (model != null) {
        model.addPropertyChangeListener(this);
      }
      else {
        model.removePropertyChangeListener(this);
      }
    }
    
    public CircleModelUsingBoundProperties getModel() {
      return model;
    }
    
    /** Paint the circle */
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      if (model == null) return;
      
      g.setColor(model.getColor());
      
      int xCenter = getSize().width/2;
      int yCenter = getSize().height/2;
      int radius = (int)model.getRadius();
      
      if (model.isFilled()) {
        g.fillOval(xCenter - radius, yCenter - radius,
        2*radius, 2*radius);
      }
      else {
        g.drawOval(xCenter - radius, yCenter - radius,
        2*radius, 2*radius);
      }
    }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  // End of variables declaration//GEN-END:variables
}