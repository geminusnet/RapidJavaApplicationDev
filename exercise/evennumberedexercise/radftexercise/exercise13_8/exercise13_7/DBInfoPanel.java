package exercise13_7;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.StringTokenizer;
import java.sql.*;

public class DBInfoPanel extends JPanel {
  BorderLayout borderLayout1 = new BorderLayout();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JScrollPane jScrollPane1 = new JScrollPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JTabbedPane jTabbedPane2 = new JTabbedPane();
  JScrollPane jScrollPane4 = new JScrollPane();
  JScrollPane jScrollPane5 = new JScrollPane();
  JTable jTable1 = new JTable();
  JTable jTable2 = new JTable();
  JTable jTable3 = new JTable();
  JTable jTable4 = new JTable();
  JTable jTable5 = new JTable();
  private java.sql.Connection connection;
  DatabaseMetaData dbMetaData;

  // Table models for the five tables
  DefaultTableModel model1 = new DefaultTableModel();
  MyTableModel model2 = new MyTableModel();
  DefaultTableModel model3 = new DefaultTableModel();
  DefaultTableModel model4 = new DefaultTableModel();
  DefaultTableModel model5 = new DefaultTableModel();
  JScrollPane jScrollPane3 = new JScrollPane();
  JScrollPane jScrollPane6 = new JScrollPane();
  JScrollPane jScrollPane7 = new JScrollPane();
  JScrollPane jScrollPane8 = new JScrollPane();
  JTable jTable6 = new JTable();
  JTable jTable7 = new JTable();
  JTable jTable8 = new JTable();
  JTable jTable9 = new JTable();

  public DBInfoPanel() {
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
    jTable3.setModel(model3);
    jTable4.setModel(model4);
    jTable5.setModel(model5);
    this.add(jTabbedPane1, BorderLayout.CENTER);
    jTabbedPane1.add(jScrollPane1, "General");
    jScrollPane1.getViewport().add(jTable1, null);
    jTabbedPane1.add(jScrollPane2, "Capabilities");
    jScrollPane2.getViewport().add(jTable2, null);
    jTabbedPane1.add(jTabbedPane2, "Functions");
    jTabbedPane2.add(jScrollPane3, "Numeric");
    jScrollPane3.getViewport().add(jTable6, null);
    jTabbedPane2.add(jScrollPane6, "String");
    jScrollPane6.getViewport().add(jTable7, null);
    jTabbedPane2.add(jScrollPane7, "System");
    jScrollPane7.getViewport().add(jTable8, null);
    jTabbedPane2.add(jScrollPane8, "Date and Time");
    jScrollPane8.getViewport().add(jTable9, null);
    jTabbedPane1.add(jScrollPane4, "Data Types");
    jScrollPane4.getViewport().add(jTable4, null);
    jTabbedPane1.add(jScrollPane5, "Table Types");
    jScrollPane5.getViewport().add(jTable5, null);
  }

  public void setConnection(java.sql.Connection newConnection) {
    connection = newConnection;

    try {
      showMetaData();
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  /**Show database meta data*/
  private void showMetaData() throws SQLException {
    dbMetaData = connection.getMetaData();
    showGeneralInfo();
    showCapability();
    showFunctions();
    showDataTypes();
    showTableTypes();
  }

  /**Find general database information*/
  private void  showGeneralInfo() throws SQLException {
    Object[][] data = new Object[][] {
      {"database URL", dbMetaData.getURL()},
      {"database username", dbMetaData.getUserName()},
      {"database product name", dbMetaData.getDatabaseProductName()},
      {"database product version", dbMetaData.getDatabaseProductVersion()},
      {"JDBC driver name", dbMetaData.getDriverName()},
      {"JDBC driver version", dbMetaData.getDriverVersion()},
      {"JDBC driver major version",
          new Integer( dbMetaData.getDriverMajorVersion()) },
      {"JDBC driver minor version",
        new Integer(dbMetaData.getDriverMinorVersion())},
      {"Max number of connections",
        new Integer(dbMetaData.getMaxConnections())},
      {"MaxTableNameLentgh",
        new Integer(dbMetaData.getMaxTableNameLength())},
      {"MaxColumnsInTable",
        new Integer(dbMetaData.getMaxColumnsInTable())},
      {"MaxStatements",
        new Integer(dbMetaData.getMaxStatements())},
      {"MaxColumnsInSelect",
        new Integer(dbMetaData.getMaxColumnsInSelect())}};

    Object[] columnNames = new Object[]{"Feature", "Information"};

    // Set new data to the table model
    model1.setDataVector(data, columnNames);
  }

  /**Find database capability*/
  private void showCapability() throws SQLException {
    Object[][] data2 = new Object[][] {
      {"Use Local Files?",
        new Boolean(dbMetaData.usesLocalFiles())},
      {"Use Local File per Table?",
        new Boolean(dbMetaData.usesLocalFilePerTable())},
      {"supportsMixedCaseIdentifiers?",
        new Boolean(dbMetaData.supportsMixedCaseIdentifiers())},
      {"storesUpperCaseIdentifiers?",
        new Boolean(dbMetaData.storesUpperCaseIdentifiers())},
      {"storesMixedCaseIdentifiers?",
        new Boolean(dbMetaData.storesMixedCaseIdentifiers())},
      {"supportsGroupBy?",
        new Boolean(dbMetaData.supportsGroupBy())},
      {"supportsANSI92EntryLevelSQL?",
        new Boolean(dbMetaData.supportsANSI92EntryLevelSQL())},
      {"supportsOuterJoins?",
        new Boolean(dbMetaData.supportsOuterJoins())},
      {"supportsAlterTableWithAddColumn?",
        new Boolean(dbMetaData.supportsAlterTableWithAddColumn())},
      {"supportsAlterTableWithDropColumn?",
        new Boolean(dbMetaData.supportsAlterTableWithDropColumn())},
      {"supportsSelectForUpdate?",
        new Boolean(dbMetaData.supportsSelectForUpdate())},
      {"supportsStoredProcedures?",
        new Boolean(dbMetaData.supportsStoredProcedures())},
      {"supportsUnion?",
        new Boolean(dbMetaData.supportsUnion())},
      {"supportsTransactions?",
        new Boolean(dbMetaData.supportsTransactions())},
      {"supportsDataDefinitionAndDataManipulationTransactions? ",
        new Boolean(dbMetaData.
          supportsDataDefinitionAndDataManipulationTransactions())}};

    Object[] columnNames2 = new Object[]{"Feature", "Capability"};
    model2.setDataVector(data2, columnNames2);
  }

  /**Find functions available in the database*/
  private void showFunctions() throws SQLException {
    addFunctions(dbMetaData.getNumericFunctions(), jTable6);
    addFunctions(dbMetaData.getStringFunctions(), jTable7);
    addFunctions(dbMetaData.getSystemFunctions(), jTable8);
   addFunctions(dbMetaData.getTimeDateFunctions(), jTable9);
  }

  private void addFunctions(String s, JTable jtb) {
    StringTokenizer st = new StringTokenizer(s, ",");

    model3 = new DefaultTableModel();
    model3.setColumnCount(1); // Set column count
    jtb.removeAll(); // Clear the table

    model3.setColumnIdentifiers(new Object[]{" "}); // No column name

    while (st.hasMoreTokens())
      model3.addRow(new Object[]{st.nextToken()});

    jtb.setModel(model3);
  }

  /**Show available data types*/
  private void showDataTypes() throws SQLException {
    model4.setColumnCount(1); // Set column count
    model4.setColumnIdentifiers(new Object[]{" "}); // No column name

    jTable4.removeAll(); // Clear the table

    ResultSet rs = dbMetaData.getTypeInfo();
    while (rs.next())
      model4.addRow(new Object[]{rs.getString("TYPE_NAME")});
  }

  /**Show available table types*/
  private void showTableTypes() throws SQLException {
    model5.setColumnCount(1); // Set column count
    model5.setColumnIdentifiers(new Object[]{" "}); // No column name

    jTable5.removeAll(); // Clear the table

    ResultSet rs = dbMetaData.getTableTypes();
    while (rs.next())
      model5.addRow(new Object[]{rs.getString("TABLE_TYPE")});
  }
}

class MyTableModel extends DefaultTableModel {
  /**Override this method to return a class for the column*/
  public Class getColumnClass(int column) {
    return getValueAt(0, column).getClass();
  }

  /**Override this method to return true if cell is editable*/
  public boolean isCellEditable(int row, int column) {
    return true;
  }
}