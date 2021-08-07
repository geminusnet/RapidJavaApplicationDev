package exercise13_7;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;

public class TableInfoPanel extends JPanel {
  BorderLayout borderLayout1 = new BorderLayout();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JScrollPane jScrollPane1 = new JScrollPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JTable jTable1 = new JTable();
  JTable jTable2 = new JTable();

  // Create data model for jtbData and jtbDef
  DefaultTableModel model1 = new DefaultTableModel();
  DefaultTableModel model2 = new DefaultTableModel();

  private java.sql.Connection connection;
  private String tableName;

  public TableInfoPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    this.setLayout(borderLayout1);
    jTable1.setModel(model1);
    jTable2.setModel(model2);
    this.add(jTabbedPane1, BorderLayout.CENTER);
    jTabbedPane1.add(jScrollPane1, "Data");
    jScrollPane1.getViewport().add(jTable1, null);
    jTabbedPane1.add(jScrollPane2, "Definition");
    jScrollPane2.getViewport().add(jTable2, null);
  }

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
}