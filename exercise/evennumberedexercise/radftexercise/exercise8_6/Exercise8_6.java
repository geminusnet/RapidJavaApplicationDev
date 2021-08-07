package exercise8_6;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import javax.swing.event.*;
import imageviewerdemo.ImageViewer;

public class Exercise8_6 extends javax.swing.JApplet {
  // Table column model
  TableColumnModel tableColumnModel;

  // Table selection model
  ListSelectionModel selectionModel;
  
    // Create table column names
    String[] columnNames =
      {"Title", "Author", "Publisher", "Date Published", "In-stock",
        "Book Cover"};

    // Create images
    ImageIcon intro1eImageIcon = ImageViewer.createImageIcon(
      "../image/intro1e.gif", this);
    ImageIcon intro2eImageIcon = ImageViewer.createImageIcon(
      "../image/intro2e.gif", this);
    ImageIcon intro3eImageIcon = ImageViewer.createImageIcon(
      "../image/intro3e.jpg", this);
    ImageIcon introjb3ImageIcon = ImageViewer.createImageIcon(
      "../image/introjb3.jpg", this);
    ImageIcon introvj6ImageIcon = ImageViewer.createImageIcon(
      "../image/introvj6.jpg", this);
    ImageIcon introjb4ImageIcon = ImageViewer.createImageIcon(
      "../image/introjb4.jpg", this);
    ImageIcon radjb3ImageIcon = ImageViewer.createImageIcon(
      "../image/radjb3.jpg", this);
    ImageIcon radjb5ImageIcon = ImageViewer.createImageIcon(
      "../image/radjb5.gif", this);

    // Create table data
    Object[][] data = {
      {"Introduction to Java Programming", "Y. Daniel Liang",
       "Que Eduction & Training",
        new GregorianCalendar(1998, 1-1, 6).getTime(),
        new Boolean(false), intro1eImageIcon},
      {"Introduction to Java Programming, Second Edition",
       "Y. Daniel Liang",
        "Que Eduction & Training",
        new GregorianCalendar(1999, 1-1, 6).getTime(),
        new Boolean(true), intro2eImageIcon},
      {"Introduction to Java Programming, Thrid Edition",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2000, 1-1, 6).getTime(),
        new Boolean(true), intro3eImageIcon},
      {"Introduction to Java Programming With Visual J++ 6",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2000, 1-1, 6).getTime(),
        new Boolean(true), introvj6ImageIcon},
      {"Introduction to Java Programming with JBuilder 3",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2000, 1-1, 6).getTime(),
        new Boolean(true), introjb3ImageIcon},
      {"Rapid Java Application Development Using JBuilder 3",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2000, 1-1, 6).getTime(),
        new Boolean(true), radjb3ImageIcon},
      {" Introduction to Java Programming with JBuilder 4",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2001, 7-1, 22).getTime(),
        new Boolean(true), introjb4ImageIcon},
      {"Rapid Java Application Development Using JBuilder 4 and 5",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2001, 12-1, 16).getTime(),
        new Boolean(true), radjb5ImageIcon},
    };
    
  /** Creates new form Exercise8_6 */
  public Exercise8_6() {
    initComponents();

    // Create table column model
    tableColumnModel = jTable1.getColumnModel();

    // Create table selection model
    ListSelectionModel selectionModel = jTable1.getSelectionModel();

    selectionModel.addListSelectionListener(
      new javax.swing.event.ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        selectionModel_valueChanged(e);
      }
    });
    
    tableColumnModel.addColumnModelListener(
      new javax.swing.event.TableColumnModelListener() {
      public void columnAdded(TableColumnModelEvent e) {
      }

      public void columnMarginChanged(ChangeEvent e) {
      }

      public void columnMoved(TableColumnModelEvent e) {
      }

      public void columnRemoved(TableColumnModelEvent e) {
        tableColumnModel_columnRemoved(e);
      }

      public void columnSelectionChanged(ListSelectionEvent e) {
      }
    });
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    tableModel = new MyTableModel(data, columnNames);
    jbtDeleteColumn = new javax.swing.JButton();
    jSplitPane1 = new javax.swing.JSplitPane();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable(tableModel);
    jScrollPane2 = new javax.swing.JScrollPane();
    jtaMessage = new javax.swing.JTextArea();

    tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {
      public void tableChanged(javax.swing.event.TableModelEvent evt) {
        tableModelTableChanged(evt);
      }
    });

    jbtDeleteColumn.setText("Delete Selected Column");
    jbtDeleteColumn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtDeleteColumnActionPerformed(evt);
      }
    });

    getContentPane().add(jbtDeleteColumn, java.awt.BorderLayout.NORTH);

    jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
    jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jTable1KeyPressed(evt);
      }
    });

    jScrollPane1.setViewportView(jTable1);

    jSplitPane1.setLeftComponent(jScrollPane1);

    jScrollPane2.setViewportView(jtaMessage);

    jSplitPane1.setRightComponent(jScrollPane2);

    getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents

  private void tableModelTableChanged(javax.swing.event.TableModelEvent evt) {//GEN-FIRST:event_tableModelTableChanged
    jtaMessage.append("Table changed: First row " + evt.getFirstRow() +
      " and last row " + evt.getLastRow() + " Type " +
      evt.getType() + '\n');
  }//GEN-LAST:event_tableModelTableChanged

  private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
    if (evt.getKeyCode() == 127) deleteSelectedRow();
  }//GEN-LAST:event_jTable1KeyPressed

  private void deleteSelectedRow() {
    int row = jTable1.getSelectedRow();
    tableModel.removeRow(row);
  }

  private void jbtDeleteColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteColumnActionPerformed
    int selectedColumn = jTable1.getSelectedColumn();
    tableColumnModel.removeColumn(
      tableColumnModel.getColumn(selectedColumn));
  }//GEN-LAST:event_jbtDeleteColumnActionPerformed
  
  /**Handle column removed event*/
  void tableColumnModel_columnRemoved(TableColumnModelEvent e) {
    jtaMessage.append("Column " + jTable1.getSelectedColumn() +
      " removed " + '\n');
  }

  /**Handle selection events*/
  void selectionModel_valueChanged(ListSelectionEvent e) {
    jtaMessage.append("Selected column " +
      jTable1.getSelectedColumn() + " and row " +
      jTable1.getSelectedRow() + '\n');
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jbtDeleteColumn;
  private exercise8_6.MyTableModel tableModel;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jtaMessage;
  private javax.swing.JTable jTable1;
  private javax.swing.JSplitPane jSplitPane1;
  // End of variables declaration//GEN-END:variables
  
}
