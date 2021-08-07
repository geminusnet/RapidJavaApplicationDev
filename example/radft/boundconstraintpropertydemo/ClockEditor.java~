package boundconstraintpropertydemo;

import java.awt.*;
import javax.swing.*;
import java.beans.*;
import java.awt.event.*;

public class ClockEditor extends javax.swing.JPanel {
  private JColorChooser jColorChooser1 = new JColorChooser();
  
  // The ClockEditor component is the source of PropertyChangeEvent
  private PropertyChangeListener listener;
  
  // Track the previous property values
  private String oldShowingDigitalDateTime = new String();
  private String oldUsingTimeZoneID = new String();
  private String oldTimeZoneID = new String();
  private int oldTimeZoneOffset = 0;
  
  /** Creates new form ClockEditor */
  public ClockEditor() {
    initComponents();
    
    // Initialize combo boxes
    jcboShowingDigitalDateTime.addItem("True");
    jcboShowingDigitalDateTime.addItem("False");
    jcboUsingTimeZoneID.addItem("True");
    jcboUsingTimeZoneID.addItem("False");
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
      jpLabels = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jpProperties = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jbtColor = new javax.swing.JButton();
      jlblColor = new javax.swing.JLabel();
      jcboShowingDigitalDateTime = new javax.swing.JComboBox();
      jtfTimeZoneID = new javax.swing.JTextField();
      jtfTimeZoneOffset = new javax.swing.JTextField();
      jcboUsingTimeZoneID = new javax.swing.JComboBox();
      
      setLayout(new java.awt.BorderLayout());
      
      jpLabels.setLayout(new java.awt.GridLayout(5, 0));
      
      jLabel1.setText("hourHandColor");
      jpLabels.add(jLabel1);
      
      jLabel2.setText("showingDigitalDateTime");
      jpLabels.add(jLabel2);
      
      jLabel3.setText("timeZoneID");
      jpLabels.add(jLabel3);
      
      jLabel4.setText("timeZoneOffset");
      jpLabels.add(jLabel4);
      
      jLabel5.setText("usingTimeZoneID");
      jpLabels.add(jLabel5);
      
      add(jpLabels, java.awt.BorderLayout.WEST);
        
        jpProperties.setLayout(new java.awt.GridLayout(5, 0));
        
        jPanel3.setLayout(new java.awt.BorderLayout());
        
        jbtColor.setText("...");
        jbtColor.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtColorActionPerformed(evt);
          }
        });
        
        jPanel3.add(jbtColor, java.awt.BorderLayout.EAST);
        
        jlblColor.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black));
        jlblColor.setOpaque(true);
        jPanel3.add(jlblColor, java.awt.BorderLayout.CENTER);
        
        jpProperties.add(jPanel3);
      
      jcboShowingDigitalDateTime.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jcboShowingDigitalDateTimeActionPerformed(evt);
        }
      });
      
      jpProperties.add(jcboShowingDigitalDateTime);
      
      jtfTimeZoneID.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jtfTimeZoneIDActionPerformed(evt);
        }
      });
      
      jpProperties.add(jtfTimeZoneID);
      
      jtfTimeZoneOffset.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jtfTimeZoneOffsetActionPerformed(evt);
        }
      });
      
      jpProperties.add(jtfTimeZoneOffset);
      
      jcboUsingTimeZoneID.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jcboUsingTimeZoneIDActionPerformed(evt);
        }
      });
      
      jpProperties.add(jcboUsingTimeZoneID);
      
      add(jpProperties, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
  private void jcboUsingTimeZoneIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboUsingTimeZoneIDActionPerformed
    if (!(oldUsingTimeZoneID.equals
    (jcboUsingTimeZoneID.getSelectedItem()))) {
      if (jcboUsingTimeZoneID.getSelectedItem().equals("True"))
        fire("usingTimeZoneID", new Boolean(true));
      else
        fire("usingTimeZoneID", new Boolean(false));
      oldUsingTimeZoneID =
      (String)jcboUsingTimeZoneID.getSelectedItem();
    }
  }//GEN-LAST:event_jcboUsingTimeZoneIDActionPerformed
  
  private void jtfTimeZoneOffsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimeZoneOffsetActionPerformed
    int newTimeZoneOffset =
    new Integer(jtfTimeZoneOffset.getText().trim()).intValue();
    if (!(oldTimeZoneOffset == newTimeZoneOffset)) {
      fire("timeZoneOffset", new Integer(newTimeZoneOffset));
      oldTimeZoneOffset = newTimeZoneOffset;
    }
  }//GEN-LAST:event_jtfTimeZoneOffsetActionPerformed
  
  private void jtfTimeZoneIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimeZoneIDActionPerformed
    if (!(oldTimeZoneID.equals(jtfTimeZoneID.getText().trim()))) {
      fire("timeZoneID", jtfTimeZoneID.getText().trim());
      oldTimeZoneID = jtfTimeZoneID.getText().trim();
    }
  }//GEN-LAST:event_jtfTimeZoneIDActionPerformed
  
  private void jcboShowingDigitalDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboShowingDigitalDateTimeActionPerformed
    if (!(oldShowingDigitalDateTime.equals
    (jcboShowingDigitalDateTime.getSelectedItem()))) {
      if (jcboShowingDigitalDateTime.getSelectedItem().equals(
      "True"))
        fire("showingDigitalDateTime", new Boolean(true));
      else
        fire("showingDigitalDateTime", new Boolean(false));
      
      oldShowingDigitalDateTime =
      (String)jcboShowingDigitalDateTime.getSelectedItem();
    }
  }//GEN-LAST:event_jcboShowingDigitalDateTimeActionPerformed
  
  private void jbtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColorActionPerformed
    Color oldColor = jlblColor.getBackground();
    jColorChooser1.setColor(oldColor);
    
    Color selectedColor =
    JColorChooser.showDialog(this, "Choose Color",
    jlblColor.getBackground());
    
    if ((selectedColor != null) &&
    !(oldColor.equals(selectedColor))) {
      jlblColor.setBackground(selectedColor);
      fire("hourHandColor", selectedColor);
      oldColor = jlblColor.getBackground();
    }
    
    if (selectedColor != null)
      jlblColor.setBackground(selectedColor);
  }//GEN-LAST:event_jbtColorActionPerformed
  
  /** Add property change listener */
  public void addPropertyChangeListener(PropertyChangeListener l) {
    if (listener == null)
      listener = l;
  }
  
  /** Remove property change listener */
  public void removePropertyChangeListener(
  PropertyChangeListener l) {
    listener = null;
  }
  
  /** Fire property change event */
  private void fire(String propertyName, Object newValue) {
    if (listener != null)
      listener.propertyChange(
      new PropertyChangeEvent(this, propertyName, null, newValue));
    
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpLabels;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jpProperties;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JButton jbtColor;
  private javax.swing.JLabel jlblColor;
  private javax.swing.JComboBox jcboShowingDigitalDateTime;
  private javax.swing.JTextField jtfTimeZoneID;
  private javax.swing.JTextField jtfTimeZoneOffset;
  private javax.swing.JComboBox jcboUsingTimeZoneID;
  // End of variables declaration//GEN-END:variables
}