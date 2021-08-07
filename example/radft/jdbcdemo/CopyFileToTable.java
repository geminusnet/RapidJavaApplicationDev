package jdbcdemo;

import java.io.*;
import java.sql.*;

public class CopyFileToTable extends javax.swing.JFrame {
  /** Creates new form CopyFileToTable */
  public CopyFileToTable() {
    initComponents();
    
    // Add items to the combo boxes
    jcboDriver.addItem("sun.jdbc.odbc.JdbcOdbcDriver");
    jcboDriver.addItem("interbase.interclient.Driver");
    jcboDriver.addItem("oracle.jdbc.driver.OracleDriver");
    jcboURL.addItem("jdbc:odbc:LiangBookDB_MDB");
    jcboURL.addItem(
    "jdbc:interbase://localhost/C:/LiangBook/LiangBookDB.gdb");
    jcboURL.addItem("jdbc:oracle:thin:@sesrv00.ipfw.edu:1521:test");
    
    // Interbase login SYSDBA/masterkey and Oracle login scott/tiger
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
          jlblStatus = new javax.swing.JLabel();
          jSplitPane1 = new javax.swing.JSplitPane();
          jPanel1 = new javax.swing.JPanel();
          jPanel3 = new javax.swing.JPanel();
          jLabel2 = new javax.swing.JLabel();
          jbtViewFile = new javax.swing.JButton();
          jtfFilename = new javax.swing.JTextField();
          jScrollPane1 = new javax.swing.JScrollPane();
          jtaFile = new javax.swing.JTextArea();
          jPanel2 = new javax.swing.JPanel();
          jbtCopy = new javax.swing.JButton();
          jPanel4 = new javax.swing.JPanel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          jPanel5 = new javax.swing.JPanel();
          jcboDriver = new javax.swing.JComboBox();
          jcboURL = new javax.swing.JComboBox();
          jtfUsername = new javax.swing.JTextField();
          jtfPassword = new javax.swing.JPasswordField();
          jtfTableName = new javax.swing.JTextField();
          
          addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
              exitForm(evt);
            }
          });
          
          getContentPane().add(jlblStatus, java.awt.BorderLayout.SOUTH);
          
          jPanel1.setLayout(new java.awt.BorderLayout());
          
          jPanel1.setBorder(new javax.swing.border.TitledBorder("Source Text File"));
          jPanel3.setLayout(new java.awt.BorderLayout());
          
          jLabel2.setText("Filename");
          jPanel3.add(jLabel2, java.awt.BorderLayout.WEST);
          
          jbtViewFile.setText("View File");
          jbtViewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jbtViewFileActionPerformed(evt);
            }
          });
          
          jPanel3.add(jbtViewFile, java.awt.BorderLayout.EAST);
          
          jPanel3.add(jtfFilename, java.awt.BorderLayout.CENTER);
          
          jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);
        
        jScrollPane1.setViewportView(jtaFile);
          
          jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        
        jSplitPane1.setLeftComponent(jPanel1);
      
      jPanel2.setLayout(new java.awt.BorderLayout());
        
        jPanel2.setBorder(new javax.swing.border.TitledBorder("Target Database Table"));
        jbtCopy.setText("Copy");
        jbtCopy.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtCopyActionPerformed(evt);
          }
        });
        
        jPanel2.add(jbtCopy, java.awt.BorderLayout.SOUTH);
        
        jPanel4.setLayout(new java.awt.GridLayout(5, 0));
          
          jLabel3.setText("JDBC Driver");
          jPanel4.add(jLabel3);
          
          jLabel4.setText("Database URL");
          jPanel4.add(jLabel4);
          
          jLabel5.setText("Username");
          jPanel4.add(jLabel5);
          
          jLabel6.setText("Password");
          jPanel4.add(jLabel6);
          
          jLabel7.setText("Table Name");
          jPanel4.add(jLabel7);
          
          jPanel2.add(jPanel4, java.awt.BorderLayout.WEST);
        
        jPanel5.setLayout(new java.awt.GridLayout(5, 0));
          
          jcboDriver.setEditable(true);
          jPanel5.add(jcboDriver);
          
          jcboURL.setEditable(true);
          jPanel5.add(jcboURL);
          
          jPanel5.add(jtfUsername);
          
          jPanel5.add(jtfPassword);
          
          jPanel5.add(jtfTableName);
          
          jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);
        
        jSplitPane1.setRightComponent(jPanel2);
      
      getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents
  
    private void jbtCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCopyActionPerformed
      try {
        copyFile();
      }
      catch (Exception ex) {
        jlblStatus.setText(ex.toString());
      }
    }//GEN-LAST:event_jbtCopyActionPerformed
    
    private void jbtViewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtViewFileActionPerformed
      showFile();
    }//GEN-LAST:event_jbtViewFileActionPerformed
    
    /** Display the file in the text area */
    private void showFile() {
      // Use a BufferedReader to read text from the file
      BufferedReader infile = null;
      
      // Get file name from the text field
      String filename = jtfFilename.getText().trim();
      
      String inLine;
      
      try {
        // Create a buffered stream
        infile = new BufferedReader(new FileReader(filename));
        
        // Read a line and append the line to the text area
        while ((inLine = infile.readLine()) != null) {
          jtaFile.append(inLine + '\n');
        }
      }
      catch (FileNotFoundException ex) {
        System.out.println("File not found: " + filename);
      }
      catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
      finally {
        try {
          if (infile != null) infile.close();
        }
        catch (IOException ex) {
          System.out.println(ex.getMessage());
        }
      }
    }
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      new CopyFileToTable().show();
    }
    
    private void copyFile() throws Exception {
      // Load the JDBC driver
      System.out.println((String)jcboDriver.getSelectedItem());
      Class.forName(((String)jcboDriver.getSelectedItem()).trim());
      System.out.println("Driver loaded");
      
      // Establish a connection
      Connection conn = DriverManager.getConnection
      (((String)jcboURL.getSelectedItem()).trim(),
      jtfUsername.getText().trim(),
      jtfPassword.getText().trim());
      System.out.println("Database connected");
      
      // Read each line from the text file and insert it to the table
      insertRows(conn);
    }
    
    private void insertRows(Connection connection) {
      // Build the INSERT statement
      String sqlInsert = "insert into " + jtfTableName.getText()
      + " values (";
      
      // Use a BufferedReader to read text from the file
      BufferedReader infile = null;
      
      // Get file name from the text field
      String filename = jtfFilename.getText().trim();
      
      String inLine;
      
      try {
        // Create a buffered stream
        infile = new BufferedReader(new FileReader(filename));
        
        // Create a statement
        Statement statement = connection.createStatement();
        
        System.out.println("Driver major version? " +
        connection.getMetaData().getDriverMajorVersion());
        
        // Determine if the supportsBatchUpdates method supported in
        // DatabaseMetadata
        boolean batchUpdatesSupported = false;
        
        try {
          if (connection.getMetaData().supportsBatchUpdates()) {
            batchUpdatesSupported = true;
            System.out.println("batch updates supported");
          }
          else {
            System.out.println("The driver is of JDBC 2 type, but " +
            "does not support batch updates");
          }
        }
        catch (Exception ex) {
          System.out.println("The driver does not support JDBC 2");
        }
        
        // Determine if the driver is capable of batch updates
        if (batchUpdatesSupported) {
          // Read a line and add the insert table command to the batch
          while ((inLine = infile.readLine()) != null) {
            statement.addBatch(sqlInsert + inLine + ")");
          }
          
          statement.executeBatch();
          
          jlblStatus.setText("Batch updates completed");
        }
        else {
          // Read a line and execute insert table command
          while ((inLine = infile.readLine()) != null) {
            statement.executeUpdate(sqlInsert + inLine + ")");
          }
          
          jlblStatus.setText("Single row update completed");
        }
      }
      catch (SQLException ex) {
        System.out.println(ex);
      }
      catch (FileNotFoundException ex) {
        System.out.println("File not found: " + filename);
      }
      catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
      finally {
        try {
          if (infile != null) infile.close();
        }
        catch (IOException ex) {
          System.out.println(ex.getMessage());
        }
      }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtViewFile;
    private javax.swing.JTextField jtfFilename;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaFile;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtCopy;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox jcboDriver;
    private javax.swing.JComboBox jcboURL;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfTableName;
    // End of variables declaration//GEN-END:variables
}