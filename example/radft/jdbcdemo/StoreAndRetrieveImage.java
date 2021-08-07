package jdbcdemo;

import java.sql.*;
import java.io.*;
import javax.swing.*;

public class StoreAndRetrieveImage extends javax.swing.JFrame {
  // Connection to the database
  Connection connection;
  
  // Statement for static SQL statements
  Statement stmt;
  
  // Prepared statement
  PreparedStatement pstmt = null;
  
  /** Creates new form StoreAndRetrieveImage */
  public StoreAndRetrieveImage() {
    initComponents();
    
    try {
      connectDB(); // Connect to DB
      storeDataToTable(); // Store data to the table (including image)
      fillDataInComboBox(); // Fill in combo box
      retrieveFlagInfo((String)(jComboBox1.getSelectedItem()));
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    jComboBox1 = new javax.swing.JComboBox();
    descriptionPanel1 = new jdbcdemo.DescriptionPanel();
    
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        exitForm(evt);
      }
    });
    
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jComboBox1ItemStateChanged(evt);
      }
    });
    
    getContentPane().add(jComboBox1, java.awt.BorderLayout.NORTH);
    
    getContentPane().add(descriptionPanel1, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents
  
  private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    retrieveFlagInfo((String)(evt.getItem()));
  }//GEN-LAST:event_jComboBox1ItemStateChanged
  
  /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      new StoreAndRetrieveImage().show();
    }
    
    private void connectDB() throws Exception {
      // Load the driver
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver loaded");
      
      // Establish connection
      connection = DriverManager.getConnection
      ("jdbc:oracle:thin:@liang.armstrong.edu:1521:test",
      "scott", "tiger");
      System.out.println("Database connected");
      
      // Create a statement for static SQL
      stmt = connection.createStatement();
      
      // Create a prepared statement to retrieve flag and description
      pstmt = connection.prepareStatement("select flag, description " +
      "from Country where name = ?");
    }
    
    private void storeDataToTable() {
      String[] countries = {"Canada", "UK", "USA", "Germany",
      "Indian", "China"};
      
      String[] imageFilenames = {"c:\\radft\\image\\ca.gif",
      "c:\\radft\\image\\uk.gif", "c:\\radft\\image\\us.gif",
      "c:\\radft\\image\\germany.gif", "c:\\radft\\image\\india.gif",
      "c:\\radft\\image\\china.gif"};
      
      String[] descriptions = {"A text to describe Canadian " +
      "flag is omitted", "British flag ...", "American flag ...",
      "German flag ...", "Indian flag ...", "Chinese flag ..."};
      
      try {
        stmt.executeUpdate("drop table Country" );
        System.out.println("Table Country removed.");
      }
      catch (Exception ex) {
        System.out.println(ex);
      }
      
      try {
        // Create the Country table
        stmt.executeUpdate("create table Country(" +
        "name varchar(30) not null, " +
        "flag blob, description varchar(1000), " +
        "primary key(name))");
        System.out.println("Table Country created");
        
        // Create a prepared statement to insert records
        PreparedStatement pstmt = connection.prepareStatement(
        "insert into Country values(?, ?, ?)");
        
        // Store all predefined records
        for (int i=0; i<countries.length; i++) {
          pstmt.setString(1, countries[i]);
          
          // Store image to the table cell
          File file = new File(imageFilenames[i]);
          InputStream inputImage = new FileInputStream(file);
          pstmt.setBinaryStream(2, inputImage, (int)(file.length()));
          
          pstmt.setString(3, descriptions[i]);
          pstmt.executeUpdate();
        }
        
        System.out.println("Table Country populated");
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    
    private void fillDataInComboBox() throws Exception {
      ResultSet rs = stmt.executeQuery("select name from Country");
      while (rs.next()) {
        jComboBox1.addItem(rs.getString(1));
      }
    }
    
    void jComboBox1_itemStateChanged(java.awt.event.ItemEvent e) {
      retrieveFlagInfo((String)(e.getItem()));
    }
    
    private void retrieveFlagInfo(String name) {
      try {
        pstmt.setString(1, name);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
          Blob blob = rs.getBlob(1);
          ImageIcon imageIcon = new ImageIcon(
          blob.getBytes(1, (int)blob.length()));
          descriptionPanel1.setImageIcon(imageIcon);
          descriptionPanel1.setName(name);
          String description = rs.getString(2);
          descriptionPanel1.setDescription(description);
        }
      }
      catch (Exception ex) {
        System.err.println(ex);
      }
    }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox jComboBox1;
  private jdbcdemo.DescriptionPanel descriptionPanel1;
  // End of variables declaration//GEN-END:variables
}