package jdbcdemo;

import java.util.*;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.event.*;
import javax.swing.*;

public class TableEditor extends javax.swing.JPanel {
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
  
  /** Creates new form TableEditor */
  public TableEditor() {
    initComponents();
    
    jTable1.setModel(tableModel);
    jTable1.setSelectionModel(listSelectionModel);
    
    listSelectionModel.addListSelectionListener(
    new javax.swing.event.ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        listSelectionModel_valueChanged(e);
      }
    });
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
      jPanel1 = new javax.swing.JPanel();
      jbtFirst = new javax.swing.JButton();
      jbtNext = new javax.swing.JButton();
      jbtPrior = new javax.swing.JButton();
      jbtLast = new javax.swing.JButton();
      jbtInsert = new javax.swing.JButton();
      jbtDelete = new javax.swing.JButton();
      jbtUpdate = new javax.swing.JButton();
      jlblStatus = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      
      setLayout(new java.awt.BorderLayout());
      
      jbtFirst.setText("First");
      jbtFirst.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtFirstActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtFirst);
      
      jbtNext.setText("Next");
      jbtNext.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtNextActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtNext);
      
      jbtPrior.setText("Prior");
      jbtPrior.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtPriorActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtPrior);
      
      jbtLast.setText("Last");
      jbtLast.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtLastActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtLast);
      
      jbtInsert.setText("Insert");
      jbtInsert.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtInsertActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtInsert);
      
      jbtDelete.setText("Delete");
      jbtDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtDeleteActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtDelete);
      
      jbtUpdate.setText("Update");
      jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtUpdateActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtUpdate);
      
      add(jPanel1, java.awt.BorderLayout.NORTH);
      
      add(jlblStatus, java.awt.BorderLayout.SOUTH);
      
      jScrollPane1.setViewportView(jTable1);
      
      add(jScrollPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
  private void jbtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteActionPerformed
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
  }//GEN-LAST:event_jbtDeleteActionPerformed
  
  private void jbtInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInsertActionPerformed
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
  }//GEN-LAST:event_jbtInsertActionPerformed
  
  private void jbtNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNextActionPerformed
    moveCursor("next");
  }//GEN-LAST:event_jbtNextActionPerformed
  
  private void jbtPriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPriorActionPerformed
    moveCursor("previous");
  }//GEN-LAST:event_jbtPriorActionPerformed
  
  private void jbtLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLastActionPerformed
    moveCursor("last");
  }//GEN-LAST:event_jbtLastActionPerformed
  
  private void jbtFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFirstActionPerformed
    moveCursor("first");
  }//GEN-LAST:event_jbtFirstActionPerformed
  
  /** Set cursor in the table and set the row number in the status */
  private void setTableCursor() throws Exception {
    int row = resultSet.getRow();
    listSelectionModel.setSelectionInterval(row-1, row-1);
    jlblStatus.setText("Current row number: " + row);
  }
  
    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
      try {
        // Get the current row
        int row = jTable1.getSelectedRow();
        
        // Gather data from the UI and update the database fields
        for (int i=1;
        i<=resultSet.getMetaData().getColumnCount(); i++) {
          resultSet.updateObject(i, tableModel.getValueAt(row, i-1));
        }
        
        // Invoke the update method in the result set
        resultSet.updateRow();
        refreshResultSet();
      }
      catch (Exception ex) {
        jlblStatus.setText(ex.toString());
      }
    }//GEN-LAST:event_jbtUpdateActionPerformed
    
    /** Move cursor to the next record */
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
    
    /** Refresh the result set */
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
    
    /** Set database connection and table name in the TableEditor */
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
    
    /** Display database table to a Swing table */
    private void showTable() throws SQLException {
      // Clear vectors to store data for a new table
      rowVectors.clear();
      columnHeaderVector.clear();
      
      // Obtain table contents
      resultSet = statement.executeQuery(
      "select * from " + tableName);
      
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
      null, null, tableName.toUpperCase(), null);
      while (rsColumns.next()) {
        columnHeaderVector.addElement(
        rsColumns.getString("COLUMN_NAME"));
      }
      
      // Set new data to the table model
      tableModel.setDataVector(rowVectors, columnHeaderVector);
    }
    
    /** Handle the selection in the table */
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtFirst;
    private javax.swing.JButton jbtNext;
    private javax.swing.JButton jbtPrior;
    private javax.swing.JButton jbtLast;
    private javax.swing.JButton jbtInsert;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}