package treedemo;

import javax.swing.tree.*;
import javax.swing.*;

public class ProcessTree extends javax.swing.JApplet {
  // Declare selection model
  TreeSelectionModel selectionModel;
  
  // Declare tree model
  DefaultTreeModel treeModel;
  
  /** Creates new form ProcessTree */
  public ProcessTree() {
    initComponents();
    
    // Get selection model
    selectionModel = jTree1.getSelectionModel();
    
    // Get tree model
    treeModel = (DefaultTreeModel)jTree1.getModel();
    
    // Set single selection
    selectionModel.setSelectionMode(
    TreeSelectionModel.SINGLE_TREE_SELECTION);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
      jpButtons = new javax.swing.JPanel();
      jbtAdd = new javax.swing.JButton();
      jbtRemove = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTree1 = new javax.swing.JTree();
      
      jbtAdd.setText("Insert a Child Node");
      jbtAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtAddActionPerformed(evt);
        }
      });
      
      jpButtons.add(jbtAdd);
      
      jbtRemove.setText("Remove a Child Node");
      jbtRemove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtRemoveActionPerformed(evt);
        }
      });
      
      jpButtons.add(jbtRemove);
      
      getContentPane().add(jpButtons, java.awt.BorderLayout.NORTH);
      
      jScrollPane1.setViewportView(jTree1);
      
      getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
    private void jbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveActionPerformed
      // Get the selection path
      TreePath path = selectionModel.getLeadSelectionPath();
      
      // Get the last node in the path
      DefaultMutableTreeNode treeNode =
      (DefaultMutableTreeNode)path.getLastPathComponent();
      
      if (treeNode == treeModel.getRoot()) {
        JOptionPane.showMessageDialog(this, "Cannot remove the root");
      }
      else
        // Remove the selected node
        treeModel.removeNodeFromParent(treeNode);
    }//GEN-LAST:event_jbtRemoveActionPerformed
    
    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
      // Get the selection path
      TreePath path = selectionModel.getLeadSelectionPath();
      
      // Get the last node in the path
      DefaultMutableTreeNode treeNode =
      (DefaultMutableTreeNode)path.getLastPathComponent();
      
      // Enter a new node
      String nodeName = JOptionPane.showInputDialog(
      this, "Enter a name for this new node", "Add a Child",
      JOptionPane.QUESTION_MESSAGE);
      
      // Insert the new node as a child of treeNode
      treeModel.insertNodeInto(new DefaultMutableTreeNode(nodeName),
      treeNode, treeNode.getChildCount());
    }//GEN-LAST:event_jbtAddActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpButtons;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}