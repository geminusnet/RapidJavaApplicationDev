/*
 * Exercise2_2.java
 *
 * Created on April 16, 2002, 8:10 PM
 */

package exercise2_2;

/**
 *
 * @author  administrator
 */
public class Exercise2_2 extends javax.swing.JApplet {
  
  /** Creates new form Exercise2_2 */
  public Exercise2_2() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jtfRadius = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jtfArea = new javax.swing.JTextField();
    circle1 = new exercise2_2.Circle();

    jPanel1.setLayout(new java.awt.GridLayout(2, 2));

    jLabel1.setText("Radius");
    jPanel1.add(jLabel1);

    jtfRadius.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfRadiusActionPerformed(evt);
      }
    });

    jPanel1.add(jtfRadius);

    jLabel2.setText("Area");
    jPanel1.add(jLabel2);

    jPanel1.add(jtfArea);

    getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

    getContentPane().add(circle1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents

  private void jtfRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRadiusActionPerformed
    int radius = new Integer(jtfRadius.getText()).intValue();
    circle1.setRadius(radius);
    circle1.repaint();

    jtfArea.setText(new Double(circle1.findArea()).toString());
  }//GEN-LAST:event_jtfRadiusActionPerformed
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jPanel1;
  private exercise2_2.Circle circle1;
  private javax.swing.JTextField jtfRadius;
  private javax.swing.JTextField jtfArea;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
  
}