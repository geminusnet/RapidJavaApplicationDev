/*
 * Exercise8_8.java
 *
 * Created on April 20, 2002, 6:10 AM
 */

package exercise8_8;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import imageviewerdemo.ImageViewer;

public class Exercise8_8 extends javax.swing.JApplet {
  // Create image icons
  ImageIcon leafImageIcon, openImageIcon, closedImageIcon;
  
  /** Creates new form Exercise8_8 */
  public Exercise8_8() {
    // Create image icons
/*    leafImageIcon = ImageViewer.createImageIcon(
      "../image/clock16.gif", this);
    openImageIcon = ImageViewer.createImageIcon(
      "../image/open.gif", this);
    closedImageIcon = ImageViewer.createImageIcon(
      "../image/flag16.gif", this);
*/
    ImageIcon t= (new javax.swing.ImageIcon(getClass().getResource("/image/rbr.gif")));

    System.out.println("Successfule???");
    ImageIcon t1= (new javax.swing.ImageIcon(getClass().getResource("/image/rbr.gif")));
    
    leafImageIcon = new javax.swing.ImageIcon(getClass().getResource("/image/clock16.gif"));
    openImageIcon = new javax.swing.ImageIcon(getClass().getResource("/image/rbr.gif"));
    closedImageIcon = new javax.swing.ImageIcon(getClass().getResource("/image/rbr.gif"));;

    initComponents();

    // Customize cell renderer
    DefaultTreeCellRenderer renderer =
      (DefaultTreeCellRenderer)jTree1.getCellRenderer();
    renderer.setLeafIcon(leafImageIcon);
    renderer.setOpenIcon(openImageIcon);
    renderer.setClosedIcon(closedImageIcon);
    renderer.setBackgroundSelectionColor(Color.red);

    // Customize editor
    JComboBox jcboColor = new JComboBox();
    jcboColor.addItem("red");
    jcboColor.addItem("green");
    jcboColor.addItem("blue");
    jcboColor.addItem("yellow");
    jcboColor.addItem("orange");

    jTree1.setCellEditor
      (new DefaultTreeCellEditor(jTree1,
        new DefaultTreeCellRenderer(),
        new DefaultCellEditor(jcboColor)));

    // jTree1.setCellEditor(new DefaultCellEditor(jcboColor));
    jTree1.setEditable(true);
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
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTree jTree1;
  // End of variables declaration//GEN-END:variables
  
}
