package modelviewdemo;

import javax.swing.*;
import java.beans.*;
import java.awt.*;

public class CircleEditorUsingBoundProperties
  extends javax.swing.JPanel implements PropertyChangeListener {
  JColorChooser jColorChooser = new JColorChooser();
  CircleModelUsingBoundProperties model;
  
  /** Creates new form CircleEditorUsingBoundProperties */
  public CircleEditorUsingBoundProperties() {
    initComponents();

    // Add items True and False in the combo box
    jcboFilled.addItem("True");
    jcboFilled.addItem("False");
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
      jpLabels = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jpProperties = new javax.swing.JPanel();
      jtfRadius = new javax.swing.JTextField();
      jcboFilled = new javax.swing.JComboBox();
      jpColor = new javax.swing.JPanel();
      jbtColor = new javax.swing.JButton();
      jlblColor = new javax.swing.JLabel();
      
      setLayout(new java.awt.BorderLayout());
      
      jpLabels.setLayout(new java.awt.GridLayout(3, 0));
      
      jLabel1.setText("Radius");
      jpLabels.add(jLabel1);
      
      jLabel2.setText("Filled");
      jpLabels.add(jLabel2);
      
      jLabel3.setText("Color");
      jpLabels.add(jLabel3);
      
      add(jpLabels, java.awt.BorderLayout.WEST);
      
      jpProperties.setLayout(new java.awt.GridLayout(3, 0));
      
      jtfRadius.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jtfRadiusActionPerformed(evt);
        }
      });
      
      jpProperties.add(jtfRadius);
      
      jcboFilled.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jcboFilledActionPerformed(evt);
        }
      });
      
      jpProperties.add(jcboFilled);
      
      jpColor.setLayout(new java.awt.BorderLayout());
        
        jbtColor.setText("...");
        jbtColor.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtColorActionPerformed(evt);
          }
        });
        
        jpColor.add(jbtColor, java.awt.BorderLayout.EAST);
        
        jlblColor.setOpaque(true);
        jpColor.add(jlblColor, java.awt.BorderLayout.CENTER);
        
        jpProperties.add(jpColor);
      
      add(jpProperties, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents

  private void jbtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColorActionPerformed
    Color selectedColor =
      JColorChooser.showDialog(this, "Choose Color",
        jlblColor.getBackground());

    if (selectedColor != null) {
      model.setColor(selectedColor);
      jlblColor.setBackground(selectedColor);
    }
  }//GEN-LAST:event_jbtColorActionPerformed

  private void jcboFilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboFilledActionPerformed
    if (((String)jcboFilled.getSelectedItem()).equals("True")) {
      if (model != null) model.setFilled(true);
    }
    else {
      if (model != null) model.setFilled(false);
    }
  }//GEN-LAST:event_jcboFilledActionPerformed

  private void jtfRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRadiusActionPerformed
    model.setRadius(
      new Double(jtfRadius.getText()).doubleValue());
  }//GEN-LAST:event_jtfRadiusActionPerformed

  /** Getter for property model.
   * @return Value of property model.
   */
  public CircleModelUsingBoundProperties getModel() {
    return model;
  }  
    
  /** Setter for property model.
   * @param model New value of property model.
   */
  public void setModel(CircleModelUsingBoundProperties model) {
    this.model = model;
    
    // Register listener
    if (model != null) {
      model.addPropertyChangeListener(this);
      updateEditor();
    }
    else {
      model.removePropertyChangeListener(this);
    }
  }
  
  public void propertyChange(PropertyChangeEvent e) {
    // TODO: implement this java.beans.PropertyChangeListener method;
    updateEditor();
  }

  /** Update property values in the editor */
  private void updateEditor() {
    // Update radius
    jtfRadius.setText(new Double(model.getRadius()).toString());

    // Update filled
    if (model.isFilled()) {
      jcboFilled.setSelectedIndex(0);
    }
    else {
      jcboFilled.setSelectedIndex(1);
    }

    // Update color
    jlblColor.setBackground(model.getColor());
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpLabels;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jpProperties;
  private javax.swing.JTextField jtfRadius;
  private javax.swing.JComboBox jcboFilled;
  private javax.swing.JPanel jpColor;
  private javax.swing.JButton jbtColor;
  private javax.swing.JLabel jlblColor;
  // End of variables declaration//GEN-END:variables
}