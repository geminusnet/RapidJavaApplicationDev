package jdbcdemo;

import java.sql.*;

public class DBConnectDialog extends javax.swing.JDialog {
  private java.sql.Connection connection;
  
  /** Creates new form DBConnectDialog */
  public DBConnectDialog() {
    this(null, true);
  }
  
  /** Creates new form DBConnectDialog */
  public DBConnectDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    
    // Add items to the combo boxes
    jcboDriver.addItem("sun.jdbc.odbc.JdbcOdbcDriver");
    jcboURL.addItem("jdbc:odbc:LiangBookDB_MDB");
    jcboDriver.addItem("oracle.jdbc.driver.OracleDriver");
    jcboURL.addItem
    ("jdbc:oracle:thin:@liang.armstrong.edu:1521:test");
    // Oracle Type 2 JDBC Connection
    jcboURL.addItem("jdbc:oracle:oci8:@liang");
    // Pointbase driver and url
    jcboDriver.addItem("com.pointbase.jdbc.jdbcUniversalDriver");
    jcboURL.addItem
    ("jdbc:pointbase://localhost:9092/sample");
    // Interbase driver and url
    jcboDriver.addItem("interbase.interclient.Driver");
    jcboURL.addItem
    ("jdbc:interbase://localhost/C:/LiangBook/LiangBookDB.gdb");
    // Username and password for Oracle scott/tiger
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
      jPanel1 = new javax.swing.JPanel();
      jbtConnect = new javax.swing.JButton();
      jbtCancel = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jcboDriver = new javax.swing.JComboBox();
      jcboURL = new javax.swing.JComboBox();
      jtfUsername = new javax.swing.JTextField();
      jpfPassword = new javax.swing.JPasswordField();
      
      setTitle("Connect to a database");
      setModal(true);
      addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
          closeDialog(evt);
        }
      });
      
      jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
      
      jbtConnect.setText("Connect");
      jbtConnect.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtConnectActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtConnect);
      
      jbtCancel.setText("Cancel");
      jbtCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtCancelActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtCancel);
      
      getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);
        
        jPanel2.setLayout(new java.awt.BorderLayout());
        
        jPanel2.setBorder(new javax.swing.border.TitledBorder("Enter database information"));
        jPanel3.setLayout(new java.awt.GridLayout(4, 0));
        
        jLabel1.setText("JDBC Driver");
        jPanel3.add(jLabel1);
        
        jLabel2.setText("Database URL");
        jPanel3.add(jLabel2);
        
        jLabel3.setText("Username");
        jPanel3.add(jLabel3);
        
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        
        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);
      
      jPanel4.setLayout(new java.awt.GridLayout(4, 0));
        
        jcboDriver.setEditable(true);
        jPanel4.add(jcboDriver);
        
        jcboURL.setEditable(true);
        jPanel4.add(jcboURL);
        
        jPanel4.add(jtfUsername);
        
        jPanel4.add(jpfPassword);
        
        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents
  
  private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
    // Close the dialog box
    setVisible(false);
  }//GEN-LAST:event_jbtCancelActionPerformed
  
  private void jbtConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConnectActionPerformed
    // Get database information from the user input
    String driver = (String)jcboDriver.getSelectedItem();
    String url = (String)jcboURL.getSelectedItem();
    String username = jtfUsername.getText().trim();
    String password = new String(jpfPassword.getPassword());
    
    // Connection to the database
    try {
      Class.forName(driver);
      System.out.println("Driver " + driver + "loaded\n");
      connection = DriverManager.getConnection(
      url, username, password);
      System.out.println("Connected to " + url + '\n');
      setVisible(false);
    }
    catch (java.lang.Exception ex) {
      ex.printStackTrace();
    }
  }//GEN-LAST:event_jbtConnectActionPerformed
  
  /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
      setVisible(false);
      dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      new DBConnectDialog(new javax.swing.JFrame(), true).show();
    }
    
    /** Return connection */
    public java.sql.Connection getConnection() {
      return connection;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtConnect;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox jcboDriver;
    private javax.swing.JComboBox jcboURL;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JPasswordField jpfPassword;
    // End of variables declaration//GEN-END:variables
}