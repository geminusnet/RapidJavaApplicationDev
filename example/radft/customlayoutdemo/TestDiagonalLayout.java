package customlayoutdemo;

import java.awt.*;

public class TestDiagonalLayout extends javax.swing.JApplet {
  private FlowLayout flowLayout = new FlowLayout();
  private GridLayout gridLayout = new GridLayout(2, 2);
  private DiagonalLayout diagonalLayout = new DiagonalLayout();
  
  /** Creates new form TestDiagonalLayout */
  public TestDiagonalLayout() {
    initComponents();
    
    // Set default layout in jPanel2
    jPanel2.setLayout(diagonalLayout);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
      buttonGroup1 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jrbFlowLayout = new javax.swing.JRadioButton();
      jrbGridLayout = new javax.swing.JRadioButton();
      jrbDiagonalLayout = new javax.swing.JRadioButton();
      jPanel2 = new javax.swing.JPanel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jButton4 = new javax.swing.JButton();
      
      
      jPanel1.setBorder(new javax.swing.border.TitledBorder("Select a Layout Manager"));
      jrbFlowLayout.setText("FlowLayout");
      buttonGroup1.add(jrbFlowLayout);
      jrbFlowLayout.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jrbFlowLayoutActionPerformed(evt);
        }
      });
      
      jPanel1.add(jrbFlowLayout);
      
      jrbGridLayout.setText("GridLayout");
      buttonGroup1.add(jrbGridLayout);
      jrbGridLayout.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jrbGridLayoutActionPerformed(evt);
        }
      });
      
      jPanel1.add(jrbGridLayout);
      
      jrbDiagonalLayout.setSelected(true);
      jrbDiagonalLayout.setText("DiagonalLayout");
      buttonGroup1.add(jrbDiagonalLayout);
      jrbDiagonalLayout.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jrbDiagonalLayoutActionPerformed(evt);
        }
      });
      
      jPanel1.add(jrbDiagonalLayout);
      
      getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);
      
      jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black));
      jButton1.setText("jButton1");
      jPanel2.add(jButton1);
      
      jButton2.setText("jButton2");
      jPanel2.add(jButton2);
      
      jButton3.setText("jButton3");
      jPanel2.add(jButton3);
      
      jButton4.setText("jButton4");
      jPanel2.add(jButton4);
      
      getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
  private void jrbDiagonalLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDiagonalLayoutActionPerformed
    jPanel2.setLayout(diagonalLayout);
    jPanel2.validate();
  }//GEN-LAST:event_jrbDiagonalLayoutActionPerformed
  
    private void jrbGridLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbGridLayoutActionPerformed
      jPanel2.setLayout(gridLayout);
      jPanel2.validate();
    }//GEN-LAST:event_jrbGridLayoutActionPerformed
    
    private void jrbFlowLayoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFlowLayoutActionPerformed
      jPanel2.setLayout(flowLayout);
      jPanel2.validate();
    }//GEN-LAST:event_jrbFlowLayoutActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbFlowLayout;
    private javax.swing.JRadioButton jrbGridLayout;
    private javax.swing.JRadioButton jrbDiagonalLayout;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}