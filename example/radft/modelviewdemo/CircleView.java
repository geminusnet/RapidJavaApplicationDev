package modelviewdemo;

import java.awt.*;
import java.awt.event.*;

public class CircleView extends javax.swing.JPanel
  implements ActionListener {  
  private modelviewdemo.CircleModel model;
  
  /** Creates new form CircleView */
  public CircleView() {
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
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
      repaint();
    }
    
    /** Set a model */
    public void setModel(modelviewdemo.CircleModel newModel) {
      model = newModel;
      
      if (model != null) {
        // Register the view as listener for the model
        model.addActionListener(this);
      }
      else {
        model.removeActionListener(this);
      }
      
      repaint();
    }
    
    public modelviewdemo.CircleModel getModel() {
      return model;
    }
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      if (model == null) return;
      
      g.setColor(model.getColor());
      
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;
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
    
    void this_mouseClicked(MouseEvent e) {
      if (model == null) return;
      
      if (e.isMetaDown())
        model.setRadius(model.getRadius()-5);
      else
        model.setRadius(model.getRadius()+5);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}