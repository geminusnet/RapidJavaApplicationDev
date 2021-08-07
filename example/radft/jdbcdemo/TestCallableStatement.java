package jdbcdemo;

import java.awt.*;

public class TestCallableStatement extends javax.swing.JApplet {
  DBConnectDialog dBConnectDialog1 = new DBConnectDialog();
  
  /** Creates new form TestCallableStatement */
  public TestCallableStatement() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiConnect = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jmiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiStaticSQL = new javax.swing.JMenuItem();
        jmiDynamicSQL = new javax.swing.JMenuItem();
        jmiStoredProc = new javax.swing.JMenuItem();
        
        jMenu1.setText("File");
        jmiConnect.setText("Connect to Database");
        jmiConnect.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiConnectActionPerformed(evt);
          }
        });
        
        jMenu1.add(jmiConnect);
        jMenu1.add(jSeparator1);
        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiExitActionPerformed(evt);
          }
        });
        
        jMenu1.add(jmiExit);
        jMenuBar1.add(jMenu1);
      jMenu2.setText("Operation");
        jmiStaticSQL.setText("Using Static SQL Statements");
        jmiStaticSQL.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiStaticSQLActionPerformed(evt);
          }
        });
        
        jMenu2.add(jmiStaticSQL);
        jmiDynamicSQL.setText("Using Dynamic SQL Statements");
        jmiDynamicSQL.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiDynamicSQLActionPerformed(evt);
          }
        });
        
        jMenu2.add(jmiDynamicSQL);
        jmiStoredProc.setText("Using Callable Statements");
        jmiStoredProc.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jmiStoredProcActionPerformed(evt);
          }
        });
        
        jMenu2.add(jmiStoredProc);
        jMenuBar1.add(jMenu2);
      
    setJMenuBar(jMenuBar1);
  }//GEN-END:initComponents

  private void jmiStoredProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStoredProcActionPerformed
    addAddressPanel(
      new AddressPanelUsingStoredProc(
        dBConnectDialog1.getConnection()));
  }//GEN-LAST:event_jmiStoredProcActionPerformed

  private void jmiDynamicSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDynamicSQLActionPerformed
    addAddressPanel(
      new AddressPanelUsingDynamicSQL(
            dBConnectDialog1.getConnection()));
  }//GEN-LAST:event_jmiDynamicSQLActionPerformed
  
  private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
    System.exit(0);
  }//GEN-LAST:event_jmiExitActionPerformed
  
    private void jmiStaticSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStaticSQLActionPerformed
      addAddressPanel(new AddressPanel(
      dBConnectDialog1.getConnection()));
    }//GEN-LAST:event_jmiStaticSQLActionPerformed
    
    private void jmiConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConnectActionPerformed
      dBConnectDialog1.setVisible(true);
    }//GEN-LAST:event_jmiConnectActionPerformed
    
    /** Add an address panel to the center of applet */
    void addAddressPanel(AddressPanel addressPanel) {
      if (dBConnectDialog1.getConnection() != null) {
        // Remove UI components from the applet
        this.getContentPane().removeAll();
        
        // Add AddressPanel panel to the applet
        this.getContentPane().add(addressPanel,
        BorderLayout.CENTER);
        
        this.validate();
      }
      else
        System.out.println("Database not connected");
    }
    
    /** Main method */
    public static void main(String[] args) {
      TestCallableStatement applet = new TestCallableStatement();
      javax.swing.JFrame frame = new javax.swing.JFrame();
      frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      frame.setTitle("TestCallableStatement");
      frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
      frame.setSize(400,320);
      java.awt.Dimension d =
      java.awt.Toolkit.getDefaultToolkit().getScreenSize();
      frame.setLocation((d.width - frame.getSize().width) / 2,
      (d.height - frame.getSize().height) / 2);
      frame.setVisible(true);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jmiConnect;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jmiStaticSQL;
    private javax.swing.JMenuItem jmiDynamicSQL;
    private javax.swing.JMenuItem jmiStoredProc;
    // End of variables declaration//GEN-END:variables
}