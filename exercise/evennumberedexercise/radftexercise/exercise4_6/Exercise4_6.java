/*
 * Exercise4_6.java
 *
 * Created on April 17, 2002, 3:05 PM
 */

package exercise4_6;

import java.util.*;
import java.text.*;

public class Exercise4_6 extends javax.swing.JApplet {
  Locale locales[];
  
  /** Creates new form Exercise4_6 */
  public Exercise4_6() {
    initComponents();

    //add locale to the choice list
    locales = DateFormat.getAvailableLocales();
    for (int i=0; i<locales.length; i++)
      jComboBox1.addItem(locales[i].getDisplayName());
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    jPanel1 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jComboBox1 = new javax.swing.JComboBox();
    jButton2 = new javax.swing.JButton();
    calendarPanel1 = new exercise4_6.CalendarPanel();

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/prior.GIF")));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jPanel1.add(jButton1);

    jComboBox1.setBorder(new javax.swing.border.TitledBorder("Choose a Locale"));
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jComboBox1ItemStateChanged(evt);
      }
    });

    jPanel1.add(jComboBox1);

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next.GIF")));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jPanel1.add(jButton2);

    getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

    getContentPane().add(calendarPanel1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int currentMonth = calendarPanel1.getMonth();
    if (currentMonth == 12) { 
      calendarPanel1.setMonth(1);
      calendarPanel1.setYear(calendarPanel1.getYear() + 1);
    }
    else
      calendarPanel1.setMonth(currentMonth + 1);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int currentMonth = calendarPanel1.getMonth();
    if (currentMonth == 1) { 
      calendarPanel1.setMonth(12);
      calendarPanel1.setYear(calendarPanel1.getYear() - 1);
    }
    else
      calendarPanel1.setMonth(currentMonth - 1);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    calendarPanel1.setLocale(
      locales[jComboBox1.getSelectedIndex()]);
  }//GEN-LAST:event_jComboBox1ItemStateChanged
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton1;
  private javax.swing.JComboBox jComboBox1;
  private exercise4_6.CalendarPanel calendarPanel1;
  // End of variables declaration//GEN-END:variables
}