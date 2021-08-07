package listdemo;

import javax.swing.*;

public class TestListModel extends javax.swing.JApplet {
  // Create a list model
  DefaultListModel listModel = new DefaultListModel();
  
  /** Creates new form TestListModel */
  public TestListModel() {
    initComponents();
    
    // Add items to the list model
    listModel.addElement("United States");
    listModel.addElement("United Kingdom");
    listModel.addElement("China");
    listModel.addElement("Germany");
    listModel.addElement("France");
    listModel.addElement("Canada");
    
    // Add selection modes to the combo box
    jcboSelectionMode.addItem("SINGLE_SELECTION");
    jcboSelectionMode.addItem("SINGLE_INTERVAL_SELECTION");
    jcboSelectionMode.addItem("MULTIPLE_INTERVAL_SELECTION");
    
    // Set list model to the list
    jList1.setModel(listModel);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jpSettings = new javax.swing.JPanel();
        jpAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfNewItem = new javax.swing.JTextField();
        jbtAdd = new javax.swing.JButton();
        jpRemove = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcboSelectionMode = new javax.swing.JComboBox();
        jbtRemove = new javax.swing.JButton();
        jlblStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        
        jpSettings.setLayout(new java.awt.BorderLayout());
        
        jpAdd.setLayout(new java.awt.BorderLayout());
        
        jLabel2.setText("Enter a New Item");
        jpAdd.add(jLabel2, java.awt.BorderLayout.WEST);
        
        jpAdd.add(jtfNewItem, java.awt.BorderLayout.CENTER);
        
        jbtAdd.setText("Add New Item");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtAddActionPerformed(evt);
          }
        });
        
        jpAdd.add(jbtAdd, java.awt.BorderLayout.EAST);
        
        jpSettings.add(jpAdd, java.awt.BorderLayout.NORTH);
      
      jpRemove.setLayout(new java.awt.BorderLayout());
        
        jLabel3.setText("Choose Selection Mode");
        jpRemove.add(jLabel3, java.awt.BorderLayout.WEST);
        
        jcboSelectionMode.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcboSelectionModeActionPerformed(evt);
          }
        });
        
        jpRemove.add(jcboSelectionMode, java.awt.BorderLayout.CENTER);
        
        jbtRemove.setText("Remove Selected Item");
        jbtRemove.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtRemoveActionPerformed(evt);
          }
        });
        
        jpRemove.add(jbtRemove, java.awt.BorderLayout.EAST);
        
        jpSettings.add(jpRemove, java.awt.BorderLayout.SOUTH);
      
      getContentPane().add(jpSettings, java.awt.BorderLayout.NORTH);
      
      getContentPane().add(jlblStatus, java.awt.BorderLayout.SOUTH);
      
      jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
          jList1ValueChanged(evt);
        }
      });
      
      jScrollPane1.setViewportView(jList1);
      
      getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
  private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
    int[] indices = jList1.getSelectedIndices();
    Object[] selectedItems = jList1.getSelectedValues();
    String display = "";
    
    for (int i=0; i<indices.length; i++) {
      display += " " + (String)selectedItems[i];
    }
    
    jlblStatus.setText(display);
  }//GEN-LAST:event_jList1ValueChanged
  
  private void jcboSelectionModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboSelectionModeActionPerformed
    String selectedMode =
    (String)jcboSelectionMode.getSelectedItem();
    
    if (selectedMode.equals("SINGLE_SELECTION"))
      jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    else if (selectedMode.equals("SINGLE_INTERVAL_SELECTION"))
      jList1.setSelectionMode(
      ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    if (selectedMode.equals("MULTIPLE_INTERVAL_SELECTION"))
      jList1.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
  }//GEN-LAST:event_jcboSelectionModeActionPerformed
  
  private void jbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveActionPerformed
    int selectedIndices[] = jList1.getSelectedIndices();
    
    for (int i=0; i<selectedIndices.length; i++) {
      listModel.removeElementAt(selectedIndices[i] - i);
    }
  }//GEN-LAST:event_jbtRemoveActionPerformed
  
  private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
    listModel.addElement(jtfNewItem.getText());
  }//GEN-LAST:event_jbtAddActionPerformed
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpSettings;
  private javax.swing.JPanel jpAdd;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField jtfNewItem;
  private javax.swing.JButton jbtAdd;
  private javax.swing.JPanel jpRemove;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JComboBox jcboSelectionMode;
  private javax.swing.JButton jbtRemove;
  private javax.swing.JLabel jlblStatus;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JList jList1;
  // End of variables declaration//GEN-END:variables
}