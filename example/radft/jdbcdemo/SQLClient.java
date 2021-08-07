package jdbcdemo;

import java.sql.*;

public class SQLClient extends javax.swing.JApplet {
  // Connection to the database
  Connection connection;
  
  // Statement to execute SQL commands
  Statement statement;
  
  DBConnectDialog dBConnectDialog1 = new DBConnectDialog();
  
  /** Creates new form SQLClient */
  public SQLClient() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblConnectionStatus = new javax.swing.JLabel();
        jbtConnect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaSQLCommand = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jbtExecuteSQL = new javax.swing.JButton();
        jlblExecutionStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSQLResult = new javax.swing.JTextArea();
        
        jPanel1.setLayout(new java.awt.BorderLayout());
        
        jPanel2.setLayout(new java.awt.BorderLayout());
        
        jPanel2.add(jlblConnectionStatus, java.awt.BorderLayout.CENTER);
        
        jbtConnect.setText("Connect");
        jbtConnect.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtConnectActionPerformed(evt);
          }
        });
        
        jPanel2.add(jbtConnect, java.awt.BorderLayout.EAST);
        
        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);
      
      jScrollPane2.setBorder(new javax.swing.border.TitledBorder("Enter a SQL Command"));
        jScrollPane2.setViewportView(jtaSQLCommand);
        
        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);
      
      jPanel3.setLayout(new java.awt.BorderLayout());
        
        jbtExecuteSQL.setText("Execute SQL Command");
        jbtExecuteSQL.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtExecuteSQLActionPerformed(evt);
          }
        });
        
        jPanel3.add(jbtExecuteSQL, java.awt.BorderLayout.EAST);
        
        jPanel3.add(jlblExecutionStatus, java.awt.BorderLayout.CENTER);
        
        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);
      
      getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);
      
      jScrollPane1.setBorder(new javax.swing.border.TitledBorder("SQL Execution Result"));
      jScrollPane1.setViewportView(jtaSQLResult);
      
      getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
    private void jbtExecuteSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExecuteSQLActionPerformed
      if (connection == null) {
        jtaSQLResult.setText("Please connect to a database first");
        return;
      }
      else {
        String sqlCommand = jtaSQLCommand.getText().trim();
        if (sqlCommand.toUpperCase().startsWith("SELECT")) {
          processSQLSelect(sqlCommand);
        }
        else {
          processSQLNonSelect(sqlCommand);
        }
      }
    }//GEN-LAST:event_jbtExecuteSQLActionPerformed
    
    private void jbtConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConnectActionPerformed
      dBConnectDialog1.setVisible(true);
      connection = dBConnectDialog1.getConnection();
      if (connection != null) {
        jlblConnectionStatus.setText("Connected to " + connection);
      }
    }//GEN-LAST:event_jbtConnectActionPerformed
    
    /** Execute SQL SELECT commands */
    private void processSQLSelect(String sqlCommand) {
      try {
        // Get a new statement for the current connection
        statement = connection.createStatement();
        
        // Execute a SELECT SQL command
        ResultSet resultSet = statement.executeQuery(sqlCommand);
        
        // Find the number of columns in the result set
        int columnCount = resultSet.getMetaData().getColumnCount();
        String row = "";
        
        while (resultSet.next()) {
          for (int i=1; i<=columnCount; i++) {
            row += resultSet.getString(i) + " ";
          }
          
          jtaSQLResult.append(row + '\n');
          
          // Reset row to empty
          row = "";
        }
      }
      catch (SQLException ex) {
        jlblExecutionStatus.setText(ex.toString());
      }
    }
    
    /** Execute SQL DDL, and modification commands */
    private void processSQLNonSelect(String sqlCommand) {
      try {
        // Get a new statement for the current connection
        statement = connection.createStatement();
        
        // Execute a non-SELECT SQL command
        statement.executeUpdate(sqlCommand);
        
        jlblExecutionStatus.setText("SQL command executed");
      }
      catch (SQLException ex) {
        jlblExecutionStatus.setText(ex.toString());
      }
    }
    
    /** Main method */
    public static void main(String[] args) {
      SQLClient applet = new SQLClient();
      javax.swing.JFrame frame = new javax.swing.JFrame();
      frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      frame.setTitle("SQLClient");
      frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
      frame.setSize(400,320);
      java.awt.Dimension d =
      java.awt.Toolkit.getDefaultToolkit().getScreenSize();
      frame.setLocation((d.width - frame.getSize().width) / 2,
      (d.height - frame.getSize().height) / 2);
      frame.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblConnectionStatus;
    private javax.swing.JButton jbtConnect;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaSQLCommand;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtExecuteSQL;
    private javax.swing.JLabel jlblExecutionStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaSQLResult;
    // End of variables declaration//GEN-END:variables
}