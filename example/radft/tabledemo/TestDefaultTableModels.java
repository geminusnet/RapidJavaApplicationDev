package tabledemo;

import java.util.*;
import java.io.*;
import javax.swing.table.*;
import javax.swing.*;

public class TestDefaultTableModels extends javax.swing.JApplet {
  // Create table column names
  String[] columnNames =
  {"Title", "Author", "Publisher", "In-stock"};
  
  // Create table data
  Object[][] data = {
    {"Introduction to Java Programming", "Y. Daniel Liang",
     "Que Education & Training", new Boolean(false)},
     {"Introduction to Java Programming, Second Edition",
      "Y. Daniel Liang", "Que Education & Training",
      new Boolean(true)},
      {"Introduction to Java Programming, Third Edition",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
       {"Introduction to Java Programming With Visual J++ 6",
        "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
        {"Introduction to Java Programming with JBuilder 3",
         "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
         {"Rapid Java Application Development Using JBuilder 3",
          "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
          {"Rapid Java Application Development Using JBuilder 4 and 5",
           "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
           {" Introduction to Java Programming with JBuilder 4",
            "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
  };
  
  // Create table model
  DefaultTableModel tableModel =
  new DefaultTableModel(data, columnNames);
  
  // Create a file chooser
  JFileChooser jFileChooser1 = new JFileChooser();
  
  /** Creates new form TestDefaultTableModels */
  public TestDefaultTableModels() {
    initComponents();
    // Add selection modes to jcboSelectionMode
    jcboSelectionMode.addItem("SINGLE_SELECTION");
    jcboSelectionMode.addItem("SINGLE_INTERVAL_SELECTION");
    jcboSelectionMode.addItem("MULTIPLE_INTERVAL_SELECTION");
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jpOperations = new javax.swing.JPanel();
        jpAddRemove = new javax.swing.JPanel();
        jbtAddRow = new javax.swing.JButton();
        jbtAddColumn = new javax.swing.JButton();
        jbtDeleteRow = new javax.swing.JButton();
        jbtDeleteColumn = new javax.swing.JButton();
        jpSelections = new javax.swing.JPanel();
        jpSelectionMode = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcboSelectionMode = new javax.swing.JComboBox();
        jpSelectionType = new javax.swing.JPanel();
        jchkCells = new javax.swing.JCheckBox();
        jchkColumns = new javax.swing.JCheckBox();
        jchkRows = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(tableModel);
        jpSaveToFile = new javax.swing.JPanel();
        jbtSaveToFile = new javax.swing.JButton();
        
        jpOperations.setLayout(new java.awt.BorderLayout());
        
        jpAddRemove.setLayout(new java.awt.GridLayout(2, 2));
        
        jbtAddRow.setText("Add Row");
        jbtAddRow.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtAddRowActionPerformed(evt);
          }
        });
        
        jpAddRemove.add(jbtAddRow);
        
        jbtAddColumn.setText("Add Column");
        jbtAddColumn.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtAddColumnActionPerformed(evt);
          }
        });
        
        jpAddRemove.add(jbtAddColumn);
        
        jbtDeleteRow.setText("Delete Row");
        jbtDeleteRow.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtDeleteRowActionPerformed(evt);
          }
        });
        
        jpAddRemove.add(jbtDeleteRow);
        
        jbtDeleteColumn.setText("Delete Column");
        jbtDeleteColumn.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtDeleteColumnActionPerformed(evt);
          }
        });
        
        jpAddRemove.add(jbtDeleteColumn);
        
        jpOperations.add(jpAddRemove, java.awt.BorderLayout.EAST);
      
      jpSelections.setLayout(new java.awt.BorderLayout());
          
          jpSelectionMode.setLayout(new java.awt.BorderLayout());
          
          jLabel1.setText("Selection Mode");
          jpSelectionMode.add(jLabel1, java.awt.BorderLayout.WEST);
          
          jcboSelectionMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jcboSelectionModeActionPerformed(evt);
            }
          });
          
          jpSelectionMode.add(jcboSelectionMode, java.awt.BorderLayout.CENTER);
          
          jpSelections.add(jpSelectionMode, java.awt.BorderLayout.NORTH);
        
        jpSelectionType.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
          
          jchkCells.setText("Cells");
          jchkCells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jchkCellsActionPerformed(evt);
            }
          });
          
          jpSelectionType.add(jchkCells);
          
          jchkColumns.setText("Columns");
          jchkColumns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jchkColumnsActionPerformed(evt);
            }
          });
          
          jpSelectionType.add(jchkColumns);
          
          jchkRows.setText("Rows");
          jchkRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              jchkRowsActionPerformed(evt);
            }
          });
          
          jpSelectionType.add(jchkRows);
          
          jpSelections.add(jpSelectionType, java.awt.BorderLayout.SOUTH);
        
        jpOperations.add(jpSelections, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(jpOperations, java.awt.BorderLayout.NORTH);
      
      jScrollPane1.setViewportView(jTable1);
      
      getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
      
      jbtSaveToFile.setText("Save Table to a File");
      jbtSaveToFile.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtSaveToFileActionPerformed(evt);
        }
      });
      
      jpSaveToFile.add(jbtSaveToFile);
      
      getContentPane().add(jpSaveToFile, java.awt.BorderLayout.SOUTH);
    
  }//GEN-END:initComponents
  
  private void jbtDeleteColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteColumnActionPerformed
    DefaultTableColumnModel tableColumnModel =
    (DefaultTableColumnModel)jTable1.getColumnModel();
    int selectedColumn = jTable1.getSelectedColumn();
    tableColumnModel.removeColumn(
    tableColumnModel.getColumn(selectedColumn));
  }//GEN-LAST:event_jbtDeleteColumnActionPerformed
  
  private void jbtDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDeleteRowActionPerformed
    tableModel.removeRow(jTable1.getSelectedRow());
  }//GEN-LAST:event_jbtDeleteRowActionPerformed
  
  private void jbtAddColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddColumnActionPerformed
    tableModel.addColumn(new String("New Column"),
    new Object[] {"1", "2", "3", "4", "5", "6", "7"});
  }//GEN-LAST:event_jbtAddColumnActionPerformed
  
  private void jbtAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddRowActionPerformed
    tableModel.addRow(new Object[]{
      " ", " ", " ", new Boolean(false)});
  }//GEN-LAST:event_jbtAddRowActionPerformed
  
  private void jchkRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkRowsActionPerformed
    jTable1.setRowSelectionAllowed(
    jchkRows.isSelected());
  }//GEN-LAST:event_jchkRowsActionPerformed
  
  private void jchkColumnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkColumnsActionPerformed
    jTable1.setColumnSelectionAllowed(
    jchkColumns.isSelected());
  }//GEN-LAST:event_jchkColumnsActionPerformed
  
  private void jchkCellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkCellsActionPerformed
    jTable1.setCellSelectionEnabled(
    jchkCells.isSelected());
  }//GEN-LAST:event_jchkCellsActionPerformed
  
  private void jcboSelectionModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboSelectionModeActionPerformed
    String selectedItem =
    (String)jcboSelectionMode.getSelectedItem();
    
    if (selectedItem.equals("SINGLE_SELECTION"))
      jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    else if (selectedItem.equals("SINGLE_INTERVAL_SELECTION"))
      jTable1.setSelectionMode(
      ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    else if (selectedItem.equals("MULTIPLE_INTERVAL_SELECTION"))
      jTable1.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
  }//GEN-LAST:event_jcboSelectionModeActionPerformed
  
    private void jbtSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSaveToFileActionPerformed
      if (jFileChooser1.showSaveDialog(this) ==
      JFileChooser.APPROVE_OPTION) {
        save(jFileChooser1.getSelectedFile());
      }
    }//GEN-LAST:event_jbtSaveToFileActionPerformed
  /** Save file with specified File instance */
  private void save(File file) {
    try {
      // Write table to the specified file
      BufferedWriter out = new BufferedWriter(new FileWriter(file));
      String header = "";

      // Write header to the file
      for (int i=0; i<jTable1.getColumnCount(); i++)
        header += jTable1.getColumnName(i) + '\t';
      out.write(header);
      out.newLine();

      // Write rows to the file
      for (int i=0; i<jTable1.getRowCount(); i++) {
        for (int j=0; j<jTable1.getColumnCount(); j++) {
          out.write(jTable1.getValueAt(i, j).toString() + '\t');
        }
        out.newLine();
      }

      out.close();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  /** Main method */
  public static void main(String[] args) {
    TestDefaultTableModels applet = new TestDefaultTableModels();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setTitle("TestDefaultTableModels");
    frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
    frame.setSize(400,320);
    java.awt.Dimension d = 
      java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, 
      (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpOperations;
    private javax.swing.JPanel jpAddRemove;
    private javax.swing.JButton jbtAddRow;
    private javax.swing.JButton jbtAddColumn;
    private javax.swing.JButton jbtDeleteRow;
    private javax.swing.JButton jbtDeleteColumn;
    private javax.swing.JPanel jpSelections;
    private javax.swing.JPanel jpSelectionMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox jcboSelectionMode;
    private javax.swing.JPanel jpSelectionType;
    private javax.swing.JCheckBox jchkCells;
    private javax.swing.JCheckBox jchkColumns;
    private javax.swing.JCheckBox jchkRows;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpSaveToFile;
    private javax.swing.JButton jbtSaveToFile;
    // End of variables declaration//GEN-END:variables
}