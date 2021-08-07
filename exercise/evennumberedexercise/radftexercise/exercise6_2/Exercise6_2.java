/*
 * Exercise6_2.java
 *
 * Created on April 18, 2002, 6:40 AM
 */

package exercise6_2;

import java.awt.*;
import javax.swing.*;

public class Exercise6_2 extends javax.swing.JApplet {

  GridLayout gridLayout;
  
  /** Creates new form Exercise6_2 */
  public Exercise6_2() {
    initComponents();

    // Add 15 buttons to jpComponents
    for (int i = 0; i < 15; i++)
      jpComponents.add(new JButton("Component " + i));

    gridLayout = (GridLayout)(jpComponents.getLayout());
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jtfRows = new javax.swing.JTextField();
    jtfColumns = new javax.swing.JTextField();
    jPanel21 = new javax.swing.JPanel();
    jPanel31 = new javax.swing.JPanel();
    jLabel11 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jPanel41 = new javax.swing.JPanel();
    jtfHGap = new javax.swing.JTextField();
    jtfVGap = new javax.swing.JTextField();
    jpComponents = new javax.swing.JPanel();

    jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

    jPanel1.setBorder(new javax.swing.border.TitledBorder("GridLayout Properties"));
    jPanel2.setLayout(new java.awt.BorderLayout());

    jPanel3.setLayout(new java.awt.GridLayout(2, 0));

    jLabel1.setText("Rows");
    jPanel3.add(jLabel1);

    jLabel2.setText("Columns");
    jPanel3.add(jLabel2);

    jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

    jPanel4.setLayout(new java.awt.GridLayout(2, 0));

    jtfRows.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfRowsActionPerformed(evt);
      }
    });

    jPanel4.add(jtfRows);

    jtfColumns.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfColumnsActionPerformed(evt);
      }
    });

    jPanel4.add(jtfColumns);

    jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

    jPanel1.add(jPanel2);

    jPanel21.setLayout(new java.awt.BorderLayout());

    jPanel31.setLayout(new java.awt.GridLayout(2, 0));

    jLabel11.setText("HGap");
    jPanel31.add(jLabel11);

    jLabel21.setText("VGap");
    jPanel31.add(jLabel21);

    jPanel21.add(jPanel31, java.awt.BorderLayout.WEST);

    jPanel41.setLayout(new java.awt.GridLayout(2, 0));

    jtfHGap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfHGapActionPerformed(evt);
      }
    });

    jPanel41.add(jtfHGap);

    jtfVGap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfVGapActionPerformed(evt);
      }
    });

    jPanel41.add(jtfVGap);

    jPanel21.add(jPanel41, java.awt.BorderLayout.CENTER);

    jPanel1.add(jPanel21);

    getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

    jpComponents.setLayout(new java.awt.GridLayout());

    jpComponents.setBorder(new javax.swing.border.TitledBorder("Container of GridLayout"));
    getContentPane().add(jpComponents, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents

  private void jtfRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRowsActionPerformed
    int rows = new Integer(jtfRows.getText()).intValue();
    gridLayout.setRows(rows);
    jpComponents.doLayout();
  }//GEN-LAST:event_jtfRowsActionPerformed

  private void jtfColumnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfColumnsActionPerformed
    int columns = new Integer(jtfColumns.getText()).intValue();
    gridLayout.setColumns(columns);
    jpComponents.doLayout();
  }//GEN-LAST:event_jtfColumnsActionPerformed

  private void jtfHGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHGapActionPerformed
    int hgap = new Integer(jtfHGap.getText()).intValue();
    gridLayout.setHgap(hgap);
    jpComponents.doLayout();
  }//GEN-LAST:event_jtfHGapActionPerformed

  private void jtfVGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVGapActionPerformed
    int vgap = new Integer(jtfVGap.getText()).intValue();
    gridLayout.setHgap(vgap);
    jpComponents.doLayout();
  }//GEN-LAST:event_jtfVGapActionPerformed
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpComponents;
  private javax.swing.JTextField jtfVGap;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel21;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel41;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JTextField jtfColumns;
  private javax.swing.JPanel jPanel31;
  private javax.swing.JTextField jtfRows;
  private javax.swing.JTextField jtfHGap;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
  
}
