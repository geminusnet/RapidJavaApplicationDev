package tabledemo;

import javax.swing.*;

public class TestTable extends javax.swing.JApplet {
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
  
  /** Creates new form TestTable */
  public TestTable() {
    initComponents();
    
    // Add auto resize modes to jcboAutoResizingMode
    jcboAutoResizingMode.addItem("AUTO_RESIZE_OFF");
    jcboAutoResizingMode.addItem("AUTO_RESIZE_LAST_COLUMN");
    jcboAutoResizingMode.addItem("AUTO_RESIZE_SUBSEQUENT_COLUMNS");
    jcboAutoResizingMode.addItem("AUTO_RESIZE_NEXT_COLUMN");
    jcboAutoResizingMode.addItem("AUTO_RESIZE_ALL_COLUMNS");
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    private void initComponents() {//GEN-BEGIN:initComponents
        jpProperties = new javax.swing.JPanel();
        jpAutoResizeMode = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcboAutoResizingMode = new javax.swing.JComboBox();
        jpRowGrid = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfRowHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfRowMargin = new javax.swing.JTextField();
        jchkShowGrid = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(data, columnNames);

        jpProperties.setLayout(new java.awt.BorderLayout());

        jpAutoResizeMode.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("autoResizeMode");
        jpAutoResizeMode.add(jLabel1, java.awt.BorderLayout.WEST);

        jcboAutoResizingMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboAutoResizingModeActionPerformed(evt);
            }
        });

        jpAutoResizeMode.add(jcboAutoResizingMode, java.awt.BorderLayout.CENTER);

        jpProperties.add(jpAutoResizeMode, java.awt.BorderLayout.NORTH);

        jpRowGrid.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setText("rowHeight");
        jpRowGrid.add(jLabel2);

        jtfRowHeight.setColumns(4);
        jtfRowHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRowHeightActionPerformed(evt);
            }
        });

        jpRowGrid.add(jtfRowHeight);

        jLabel3.setText("rowMargin");
        jpRowGrid.add(jLabel3);

        jtfRowMargin.setColumns(4);
        jtfRowMargin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRowMarginActionPerformed(evt);
            }
        });

        jpRowGrid.add(jtfRowMargin);

        jchkShowGrid.setText("showGrid");
        jchkShowGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkShowGridActionPerformed(evt);
            }
        });

        jpRowGrid.add(jchkShowGrid);

        jpProperties.add(jpRowGrid, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jpProperties, java.awt.BorderLayout.NORTH);

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
  
  private void jchkShowGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkShowGridActionPerformed
    jTable1.setShowGrid(jchkShowGrid.isSelected());
      }//GEN-LAST:event_jchkShowGridActionPerformed
      
    private void jtfRowMarginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRowMarginActionPerformed
      int rowMargin = new Integer(
      jtfRowMargin.getText().trim()).intValue();
      jTable1.setRowMargin(rowMargin);
    }//GEN-LAST:event_jtfRowMarginActionPerformed
    
    private void jtfRowHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRowHeightActionPerformed
      int rowHeight = new Integer(
      jtfRowHeight.getText().trim()).intValue();
      jTable1.setRowHeight(rowHeight);
    }//GEN-LAST:event_jtfRowHeightActionPerformed
    
  private void jcboAutoResizingModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboAutoResizingModeActionPerformed
    String selectedItem =
    (String)jcboAutoResizingMode.getSelectedItem();
    
    if (selectedItem.equals("AUTO_RESIZE_OFF"))
      jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    else if (selectedItem.equals("AUTO_RESIZE_LAST_COLUMN"))
      jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    else if (selectedItem.equals("AUTO_RESIZE_SUBSEQUENT_COLUMNS"))
      jTable1.setAutoResizeMode(
      JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    else if (selectedItem.equals("AUTO_RESIZE_NEXT_COLUMN"))
      jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    else if (selectedItem.equals("AUTO_RESIZE_ALL_COLUMNS"))
      jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
  }//GEN-LAST:event_jcboAutoResizingModeActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jchkShowGrid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfRowMargin;
    private javax.swing.JPanel jpAutoResizeMode;
    private javax.swing.JComboBox jcboAutoResizingMode;
    private javax.swing.JTextField jtfRowHeight;
    private javax.swing.JPanel jpRowGrid;
    private javax.swing.JPanel jpProperties;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}