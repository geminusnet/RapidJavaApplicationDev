package exercise13_6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.*;
import javax.swing.event.*;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class TableEditor extends JPanel {
  BorderLayout borderLayout1 = new BorderLayout();
  JButton jbtNext = new JButton();
  JButton jbtLast = new JButton();
  JPanel jPanel1 = new JPanel();
  JButton jbtInsert = new JButton();
  JButton jbtPrior = new JButton();
  JButton jbtDelete = new JButton();
  JButton jbtUpdate = new JButton();
  JButton jbtFirst = new JButton();
  JScrollPane jScrollPane1 = new JScrollPane();
  JTable jTable1 = new JTable();
  JLabel jlblStatus = new JLabel();

  // Dialog box for inserting a new record
  NewRecordDialog newRecordDialog1 = new NewRecordDialog();

  // JDBC Connection
  Connection connection;

  // Table name
  String tableName;

  // JDBC Statement
  Statement statement;

  // Result set for the table
  ResultSet resultSet;

  // Table model
  DefaultTableModel tableModel = new DefaultTableModel();

  // Table selection model
  DefaultListSelectionModel listSelectionModel =
    new DefaultListSelectionModel();

  // New row vector
  Vector rowVectors = new Vector();

  // columnHeaderVector to hold column names
  Vector columnHeaderVector = new Vector();

  // Column count
  int columnCount;

  public TableEditor() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jbtLast.setText("Last");
    jbtLast.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtLast_actionPerformed(e);
      }
    });
    jbtNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtNext_actionPerformed(e);
      }
    });
    jbtNext.setText("Next");
    this.setLayout(borderLayout1);
    jbtInsert.setText("Insert");
    jbtInsert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtInsert_actionPerformed(e);
      }
    });
    jbtPrior.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtPrior_actionPerformed(e);
      }
    });
    jbtPrior.setText("Prior");
    jbtDelete.setText("Delete");
    jbtDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtDelete_actionPerformed(e);
      }
    });
    jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtUpdate_actionPerformed(e);
      }
    });
    jbtUpdate.setText("Update");
    jbtFirst.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtFirst_actionPerformed(e);
      }
    });
    jbtFirst.setText("First");
    jlblStatus.setText("Status label");
    this.add(jPanel1, BorderLayout.NORTH);
    jPanel1.add(jbtFirst, null);
    jPanel1.add(jbtNext, null);
    jPanel1.add(jbtPrior, null);
    jPanel1.add(jbtLast, null);
    jPanel1.add(jbtInsert, null);
    jPanel1.add(jbtDelete, null);
    jPanel1.add(jbtUpdate, null);
    this.add(jScrollPane1, BorderLayout.CENTER);
    this.add(jlblStatus, BorderLayout.SOUTH);
    jScrollPane1.getViewport().add(jTable1, null);
    jTable1.setModel(tableModel);
    jTable1.setSelectionModel(listSelectionModel);
    listSelectionModel.addListSelectionListener(
      new javax.swing.event.ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        listSelectionModel_valueChanged(e);
      }
    });
  }

  /**Handle the Update button*/
  void jbtUpdate_actionPerformed(ActionEvent e) {
    try {
      // Get the current row
      int row = jTable1.getSelectedRow();

      // Gather data from the UI and update the database fields
      for (int i=1;
        i<=resultSet.getMetaData().getColumnCount(); i++) {
        resultSet.updateObject(i, tableModel.getValueAt(row, i-1));
      }

      // Inovke the update method in the result set
      resultSet.updateRow();
      refreshResultSet();
    }
    catch (Exception ex) {
      jlblStatus.setText(ex.toString());
    }
  }

  /**Handle the First button*/
  void jbtFirst_actionPerformed(ActionEvent e) {
    moveCursor("first");
  }

  /**Set cursor in the table and set the row number in the status*/
  private void setTableCursor() throws Exception {
    int row = resultSet.getRow();
    listSelectionModel.setSelectionInterval(row-1, row-1);
    jlblStatus.setText("Current row number: " + row);
  }

  /**Handle the Last button*/
  void jbtLast_actionPerformed(ActionEvent e) {
    moveCursor("last");
  }

  /**Handle the Prior button*/
  void jbtPrior_actionPerformed(ActionEvent e) {
    moveCursor("previous");
  }

  /**Handle the Next button*/
  void jbtNext_actionPerformed(ActionEvent e) {
    moveCursor("next");
  }

  /**Move cursor to the next record*/
  private void moveCursor(String whereToMove) {
    try {
      if (whereToMove.equals("first"))
        resultSet.first();
      else if (whereToMove.equals("next"))
        resultSet.next();
      else if (whereToMove.equals("previous"))
        resultSet.previous();
      else if (whereToMove.equals("last"))
        resultSet.last();
      setTableCursor();
    }
    catch (Exception ex) {
      jlblStatus.setText(ex.toString());
    }
  }

  /**Handle the Insert button*/
  void jbtInsert_actionPerformed(ActionEvent e) {
    // Display the dialog box
    newRecordDialog1.displayTable(columnHeaderVector);
    Vector newRecord = newRecordDialog1.getNewRecord();

    if (newRecord == null) return;

    // Insert the record to the Swing table
    tableModel.addRow(newRecord);

    // Insert the record to the database table
    try {
      for (int i=1; i<=columnCount; i++) {
        resultSet.updateObject(i, newRecord.elementAt(i-1));
      }

      resultSet.insertRow();
      refreshResultSet();
    }
    catch (Exception ex) {
      jlblStatus.setText(ex.toString());
    }
  }

  void jbtDelete_actionPerformed(ActionEvent e) {
    try {
      // Delete the record from the database
      resultSet.deleteRow();
      refreshResultSet();

      // Remove the row in the table
      tableModel.removeRow(
        listSelectionModel.getLeadSelectionIndex());
    }
    catch (Exception ex) {
      jlblStatus.setText(ex.toString());
    }
  }

  /**Refresh the result set*/
  private void refreshResultSet() {
    try {
      resultSet = statement.executeQuery(
        "SELECT * FROM " + tableName);
      // Set the cursor to the first record in the table
      moveCursor("first");
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  /**Set database connection and table name in the TableEditor*/
  public void setConnectionAndTable(Connection newConnection,
    String newTableName) {
    connection = newConnection;
    tableName = newTableName;
    try {
      statement = connection.createStatement(ResultSet.
        TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      showTable();
      moveCursor("first");
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  /**Display database table to a Swing table*/
  private void showTable() throws SQLException {
    // Clear vectors to store data for a new table
    rowVectors.clear();
    columnHeaderVector.clear();

    // Obtain table contents
    resultSet = statement.executeQuery(
      "select * from " + tableName + ";");

    // Get column count
    columnCount = resultSet.getMetaData().getColumnCount();

    // Store rows to rowVectors
    while (resultSet.next()) {
      Vector singleRow = new Vector();
      for (int i=0; i<columnCount; i++)
        // Store cells to a row
        singleRow.addElement(resultSet.getObject(i+1));
      rowVectors.addElement(singleRow);
    }

    // Get column name and add to columnHeaderVector
    ResultSet rsColumns = connection.getMetaData().getColumns(
      null, null, tableName, null);
    while (rsColumns.next()) {
      columnHeaderVector.addElement(
        rsColumns.getString("COLUMN_NAME"));
    }

    // Set new data to the table model
    tableModel.setDataVector(rowVectors, columnHeaderVector);
  }

  /**Handle the selection in the table*/
  void listSelectionModel_valueChanged(ListSelectionEvent e) {
    int selectedRow = jTable1.getSelectedRow();

    try {
      resultSet.absolute(selectedRow+1);
      setTableCursor();
    }
    catch (Exception ex) {
      jlblStatus.setText(ex.toString());
    }
  }
}