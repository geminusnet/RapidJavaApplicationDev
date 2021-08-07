package treedemo;

import javax.swing.tree.*;

public class TestTree extends javax.swing.JApplet {
  /** Creates new form TestTree */
  public TestTree() {
    initComponents();
    
    // Create a tree model and set the tree model in jTree1
    DefaultTreeModel treeModel = createTreeModel();
    jTree1.setModel(treeModel); // Set this value manually
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    private void initComponents() {//GEN-BEGIN:initComponents
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        
        jScrollPane1.setViewportView(jTree1);
        
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
      
    }//GEN-END:initComponents
    
    /** Create a tree model */
    private DefaultTreeModel createTreeModel() {
      DefaultMutableTreeNode root = new DefaultMutableTreeNode
      ("Rapid Java Application Development Using Sun ONE Studio 4");

      DefaultMutableTreeNode parent = new DefaultMutableTreeNode
        ("Part I: Introduction to Forte and JavaBeans");
      root.add(parent);
      
      parent.add(new DefaultMutableTreeNode
      ("Chapter 1: Introduction to Forte"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 2: Introduction to JavaBeans"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 3: Beans Events"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 4: Developing and Using Components"));
      
      parent = new DefaultMutableTreeNode("Part II: Rapid Application "
        + "Development Using Swing Components");
      root.add(parent);
      
      parent.add(new DefaultMutableTreeNode
      ("Chapter 5: Swing Components"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 6: Containers and Layout Managers"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 7: Menus, Toolbars, and Dialogs"));
      parent.add(new DefaultMutableTreeNode
      ("Chapter 8: Advanced Swing Components"));
      
      // Omitted for brevity
      return new DefaultTreeModel(root);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}