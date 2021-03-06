package modelviewdemo;

import java.awt.event.*;

public class CircleEditor extends javax.swing.JPanel
implements ActionListener {
  private modelviewdemo.CircleModel model;
  
  /** Creates new form CircleEditor */
  public CircleEditor() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    jLabel1 = new javax.swing.JLabel();
    jtfRadius = new javax.swing.JTextField();
    
    setLayout(new java.awt.BorderLayout());
    
    jLabel1.setText("Radius");
    add(jLabel1, java.awt.BorderLayout.WEST);
    
    jtfRadius.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfRadiusActionPerformed(evt);
      }
    });
    
    add(jtfRadius, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
    private void jtfRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRadiusActionPerformed
      model.setRadius(
      new Double(jtfRadius.getText()).doubleValue());
    }//GEN-LAST:event_jtfRadiusActionPerformed
    
    public void actionPerformed(ActionEvent e) {
      if (model != null)
        if (e.getActionCommand().equals("radius"))
          jtfRadius.setText(
          new Double(model.getRadius()).toString());
    }
    
    public void setModel(modelviewdemo.CircleModel newModel) {
      model = newModel;
      
      if (model != null) {
        // Register the view as listener for the model
        model.addActionListener(this);
      }
      else {
        model.removeActionListener(this);
      }
    }
    
    public modelviewdemo.CircleModel getModel() {
      return model;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtfRadius;
    // End of variables declaration//GEN-END:variables
}