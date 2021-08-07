package jdbcdemo;

import javax.swing.table.*;
import java.util.*;
import java.sql.*;

public class TableInfoPanel extends javax.swing.JPanel {
  // Create data model for jtbData and jtbDef
  DefaultTableModel model1 = new DefaultTableModel();
  DefaultTableModel model2 = new DefaultTableModel();
  
  private java.sql.Connection connection;
  private String tableName;
  
  /** Creates new form TableInfoPanel */
  public TableInfoPanel() {
    initComponents();
    
    jTable1.setModel(model1);
    jTable2.setModel(model2);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        
        setLayout(new java.awt.BorderLayout());
        
        jScrollPane1.setViewportView(jTable1);
        
        jTabbedPane1.addTab("Data", jScrollPane1);
      
      jScrollPane2.setViewportView(jTable2);
        
        jTabbedPane1.addTab("Definition", jScrollPane2);
      
      add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
    
    public void setConnectionAndTable(Connection newConnection,
    String newTableName) {
      connection = newConnection;
      tableName = newTableName;
      showData();
      showTableDef();
    }
    
    private void showData() {
      try {
        Statement statement = connection.createStatement();
        
        // Vector to store rows
        Vector rowData = new Vector();
        
        ResultSet rs = statement.executeQuery(
        "select * from " + tableName + ";");
        
        // Get column count
        int columnCount = rs.getMetaData().getColumnCount();
        
        // Store rows to rowData
        while (rs.next()) {
          Vector singleRow = new Vector();
          for (int i=0; i<columnCount; i++)
            // Store cells to a row
            singleRow.addElement(rs.getObject(i+1));
          rowData.addElement(singleRow);
        }
        
        // Vector to store column names
        Vector columnNames = new Vector();
        
        // Column name result set
        ResultSet rsColumns = connection.getMetaData().getColumns(
        null, null, tableName, null);
        
        // Add column names to the table
        while (rsColumns.next()) {
          columnNames.addElement(rsColumns.getString("COLUMN_NAME"));
        }
        
        // Set new data to the table model
        model1.setDataVector(rowData, columnNames);
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    
    private void showTableDef() {
      try {
        // Vector to store rows
        Vector rowData = new Vector();
        
        // Column name result set
        ResultSet rsColumns = connection.getMetaData().getColumns(
        null, null, tableName, null);
        
        // Store rows to rowData
        while (rsColumns.next()) {
          Vector singleRow = new Vector();
          // Store cells to a row
          singleRow.addElement(rsColumns.getObject("COLUMN_NAME"));
          singleRow.addElement(rsColumns.getObject("TYPE_NAME"));
          singleRow.addElement(rsColumns.getObject("COLUMN_SIZE"));
          rowData.addElement(singleRow);
        }
        
        // Vector to store column names
        Vector columnNames = new Vector();
        columnNames.addElement("COLUMN_NAME");
        columnNames.addElement("TYPE_NAME");
        columnNames.addElement("COLUMN_SIZE");
        
        // Set new data to the table model
        model2.setDataVector(rowData, columnNames);
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}