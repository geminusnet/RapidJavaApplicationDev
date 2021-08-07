package boundconstraintpropertydemo;

import java.awt.*;
import javax.swing.*;
import java.beans.*;
import java.awt.event.*;

public class ClockEditorUsingSupportClass extends javax.swing.JPanel {
  /** Holds value of property hourHandColor. */
  private java.awt.Color hourHandColor;
  
  /** Utility field used by bound properties. */
  private java.beans.PropertyChangeSupport propertyChangeSupport =
  new java.beans.PropertyChangeSupport(this);
  
  /** Holds value of property showingDigitalDateTime. */
  private boolean showingDigitalDateTime;
  
  /** Holds value of property timeZoneID. */
  private String timeZoneID;
  
  /** Holds value of property timeZoneOffset. */
  private int timeZoneOffset;
  
  /** Holds value of property usingTimeZoneID. */
  private boolean usingTimeZoneID;
  
  private JColorChooser jColorChooser1 = new JColorChooser();
  
  /** Creates new form ClockEditorUsingSupportClass */
  public ClockEditorUsingSupportClass() {
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
    if (jcboUsingTimeZoneID.getSelectedItem().equals("True"))
      setUsingTimeZoneID(true);
    else
      setUsingTimeZoneID(false);
  }//GEN-LAST:event_jcboUsingTimeZoneIDActionPerformed
  
  private void jtfTimeZoneOffsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimeZoneOffsetActionPerformed
    setTimeZoneOffset(
    new Integer(jtfTimeZoneOffset.getText().trim()).intValue());
  }//GEN-LAST:event_jtfTimeZoneOffsetActionPerformed
  
  private void jtfTimeZoneIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimeZoneIDActionPerformed
    setTimeZoneID(jtfTimeZoneID.getText().trim());
  }//GEN-LAST:event_jtfTimeZoneIDActionPerformed
  
  private void jcboShowingDigitalDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboShowingDigitalDateTimeActionPerformed
    if (jcboShowingDigitalDateTime.getSelectedItem().equals("True"))
      setShowingDigitalDateTime(true);
    else
      setShowingDigitalDateTime(false);
  }//GEN-LAST:event_jcboShowingDigitalDateTimeActionPerformed
  
  private void jbtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColorActionPerformed
    jColorChooser1.setColor(jlblColor.getBackground());
    
    Color selectedColor =
    JColorChooser.showDialog(this, "Choose Color",
    jlblColor.getBackground());
    
    if (selectedColor != null) {
      setHourHandColor(selectedColor);
      jlblColor.setBackground(selectedColor);
    }
  }//GEN-LAST:event_jbtColorActionPerformed
  
  /** Add a PropertyChangeListener to the listener list.
   * @param l The listener to add.
   */
  public void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
    propertyChangeSupport.addPropertyChangeListener(l);
  }
  
  /** Removes a PropertyChangeListener from the listener list.
   * @param l The listener to remove.
   */
  public void removePropertyChangeListener(java.beans.PropertyChangeListener l) {
    propertyChangeSupport.removePropertyChangeListener(l);
  }
  
  /** Getter for property hourHandColor.
   * @return Value of property hourHandColor.
   */
  public java.awt.Color getHourHandColor() {
    return hourHandColor;
  }
  
  /** Setter for property hourHandColor.
   * @param hourHandColor New value of property hourHandColor.
   */
  public void setHourHandColor(java.awt.Color hourHandColor) {
    java.awt.Color oldHourHandColor = this.hourHandColor;
    this.hourHandColor = hourHandColor;
    propertyChangeSupport.firePropertyChange("hourHandColor",
    oldHourHandColor, hourHandColor);
  }
  /** Getter for property showingDigitalDateTime.
   * @return Value of property showingDigitalDateTime.
   */
  public boolean isShowingDigitalDateTime() {
    return showingDigitalDateTime;
  }
  
  /** Setter for property showingDigitalDateTime.
   * @param showingDigitalDateTime New value of property showingDigitalDateTime.
   */
  public void setShowingDigitalDateTime(boolean showingDigitalDateTime) {
    boolean oldShowingDigitalDateTime = this.showingDigitalDateTime;
    this.showingDigitalDateTime = showingDigitalDateTime;
    propertyChangeSupport.firePropertyChange("showingDigitalDateTime",
    new Boolean(oldShowingDigitalDateTime),
    new Boolean(showingDigitalDateTime));
  }
  
  /** Getter for property timeZoneID.
   * @return Value of property timeZoneID.
   */
  public String getTimeZoneID() {
    return timeZoneID;
  }
  
  /** Setter for property timeZoneID.
   * @param timeZoneID New value of property timeZoneID.
   */
  public void setTimeZoneID(String timeZoneID) {
    String oldTimeZoneID = this.timeZoneID;
    this.timeZoneID = timeZoneID;
    propertyChangeSupport.firePropertyChange("timeZoneID", oldTimeZoneID, timeZoneID);
  }
  
  /** Getter for property timeZoneOffset.
   * @return Value of property timeZoneOffset.
   */
  public int getTimeZoneOffset() {
    return timeZoneOffset;
  }
  
  /** Setter for property timeZoneOffset.
   * @param timeZoneOffset New value of property timeZoneOffset.
   */
  public void setTimeZoneOffset(int timeZoneOffset) {
    int oldTimeZoneOffset = this.timeZoneOffset;
    this.timeZoneOffset = timeZoneOffset;
    propertyChangeSupport.firePropertyChange("timeZoneOffset",
    new Integer(oldTimeZoneOffset), new Integer(timeZoneOffset));
  }
  
  /** Getter for property usingTimeZoneID.
   * @return Value of property usingTimeZoneID.
   */
  public boolean isUsingTimeZoneID() {
    return usingTimeZoneID;
  }
  
  /** Setter for property usingTimeZoneID.
   * @param usingTimeZoneID New value of property usingTimeZoneID.
   */
  public void setUsingTimeZoneID(boolean usingTimeZoneID) {
    boolean oldUsingTimeZoneID = this.usingTimeZoneID;
    this.usingTimeZoneID = usingTimeZoneID;
    propertyChangeSupport.firePropertyChange("usingTimeZoneID", 
      new Boolean(oldUsingTimeZoneID), new Boolean(usingTimeZoneID));
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