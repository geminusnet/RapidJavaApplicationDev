package exercise13_6;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.event.*;

public class NewRecordDialog extends JDialog {
  // Table model
  DefaultTableModel tableModel = new DefaultTableModel();

  JPanel panel1 = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  JScrollPane jScrollPane1 = new JScrollPane();
  JPanel jPanel1 = new JPanel();
  JButton jbtOK = new JButton();
  JButton jbtCancel = new JButton();
  JTable jTable1 = new JTable();
  private Vector newRecord;

  public NewRecordDialog(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public NewRecordDialog() {
    this(null, "", false);
  }

  void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    jbtOK.setText("OK");
    jbtOK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtOK_actionPerformed(e);
      }
    });
    jbtCancel.setText("Cancel");
    jbtCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtCancel_actionPerformed(e);
      }
    });
    this.setSize(new Dimension(400, 100));
    this.setTitle("Insert a New Record");
    this.setModal(true);
    jTable1.setModel(tableModel);
    getContentPane().add(panel1);
    panel1.add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jTable1, null);
    panel1.add(jPanel1, BorderLayout.SOUTH);
    jPanel1.add(jbtOK, null);
    jPanel1.add(jbtCancel, null);
  }

  public java.util.Vector getNewRecord() {
    return newRecord;
  }

  /**Display the table*/
  void displayTable(Vector columnHeaderVector) {
    this.setSize(new Dimension(400, 100));

    tableModel.setDataVector(new Vector(),
      columnHeaderVector);

    // Must create a new vector for a new record
    newRecord = new Vector();
    tableModel.addRow(newRecord);

    setVisible(true);
  }

  void jbtOK_actionPerformed(ActionEvent e) {
    setVisible(false);
  }

  void jbtCancel_actionPerformed(ActionEvent e) {
    newRecord = null;
    setVisible(false);
  }
}