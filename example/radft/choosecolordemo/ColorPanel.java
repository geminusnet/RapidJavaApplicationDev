package choosecolordemo;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.*;

public class ColorPanel extends javax.swing.JPanel {
  private String buttonType = "RGB";
  
  /** Holds value of property colorType. */
  private String colorType = "Red";
  
  /** Holds value of property currentValue. */
  private int colorValue = 0;
  
  /** Utility field used by event firing mechanism. */
  private javax.swing.event.EventListenerList listenerList =  null;
  
  /** Creates new form ColorPanel */
  public ColorPanel() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    jlblColorValue = new javax.swing.JLabel();
    jslColor = new javax.swing.JSlider();
    jtfColor = new javax.swing.JTextArea();
    
    setLayout(new java.awt.BorderLayout());
    
    jlblColorValue.setText("jLabel1");
    add(jlblColorValue, java.awt.BorderLayout.NORTH);
    
    jslColor.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        jslColorStateChanged(evt);
      }
    });
    
    add(jslColor, java.awt.BorderLayout.SOUTH);
    
    add(jtfColor, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
  private void jslColorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslColorStateChanged
    colorValue = jslColor.getValue();
    jlblColorValue.setText(colorValue+"");
    
    if (buttonType.equals("RGB")) {
      if (colorType.equals("Red"))
        jtfColor.setBackground(new Color(colorValue, 0, 0));
      else if (colorType.equals("Green"))
        jtfColor.setBackground(new Color(0, colorValue, 0));
      else if (colorType.equals("Blue"))
        jtfColor.setBackground(new Color(0, 0, colorValue));
      
      jtfColor.repaint();
    }
    
    fireActionListenerActionPerformed(
    new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
  }//GEN-LAST:event_jslColorStateChanged
  
  public void switchButton(String buttonType) {
    if (buttonType.equals("RGB"))
      jslColor.setMaximum(255);
    else if (buttonType.equals("HSB"))
      jslColor.setMaximum(100);
    
    jtfColor.setBackground(Color.white);
    jtfColor.repaint();
    jslColor.setValue(0);
    
    this.repaint();
    
    this.buttonType = buttonType;
  }
  
  public String getColorType() {
    return colorType;
  }
  
  public void setColorType(String colorType) {
    this.colorType = colorType;
  }
  
  public int getColorValue() {
    return colorValue;
  }
  
  public void setColorValue(int colorValue) {
    this.colorValue = colorValue;
  }
  
  public String getTitle() {
    return ((TitledBorder)this.getBorder()).getTitle();
  }
  
  public void setTitle(String title) {
    this.setBorder(new TitledBorder(title));
  }
  
  public synchronized void addActionListener(
    java.awt.event.ActionListener listener) {
    if (listenerList == null ) {
      listenerList = new javax.swing.event.EventListenerList();
    }
    listenerList.add(java.awt.event.ActionListener.class, listener);
  }
  
  public synchronized void removeActionListener(
    java.awt.event.ActionListener listener) {
    listenerList.remove(java.awt.event.ActionListener.class, listener);
  }
  
  private void fireActionListenerActionPerformed(
    java.awt.event.ActionEvent event) {
    if (listenerList == null) return;
    Object[] listeners = listenerList.getListenerList();
    for (int i = listeners.length-2; i>=0; i-=2) {
      if (listeners[i]==java.awt.event.ActionListener.class) {
        ((java.awt.event.ActionListener)listeners[i+1]).
          actionPerformed(event);
      }
    }
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblColorValue;
    private javax.swing.JSlider jslColor;
    private javax.swing.JTextArea jtfColor;
    // End of variables declaration//GEN-END:variables
}