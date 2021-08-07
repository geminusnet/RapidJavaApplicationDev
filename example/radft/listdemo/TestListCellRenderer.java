package listdemo;

import javax.swing.*;
import java.awt.*;
import imageviewerdemo.ImageViewer;

public class TestListCellRenderer extends javax.swing.JApplet {
  
  MyListModel listModel;
  
  // Create a list cell renderer
  ListCellRenderer myListCellRenderer = new MyListCellRenderer();
  
  /** Creates new form TestListCellRenderer */
  public TestListCellRenderer() {
    initComponents();
    
    // Create images
    Image imageUS = ImageViewer.createImage(
      "/image/us.gif", this);
    Image imageFrance = ImageViewer.createImage(
      "/image/fr.gif", this);
    Image imageUK = ImageViewer.createImage(
      "/image/uk.gif", this);
    Image imageGermany = ImageViewer.createImage(
      "/image/germany.gif", this);
    Image imageIndia = ImageViewer.createImage(
      "/image/india.gif", this);
    Image imageNorway = ImageViewer.createImage(
      "/image/norway.gif", this);
    Image imageChina = ImageViewer.createImage(
      "/image/china.gif", this);
    Image imageCanada = ImageViewer.createImage(
      "/image/ca.gif", this);
    Image imageDenmark = ImageViewer.createImage(
      "/image/denmark.gif", this);
    
    // Create a list model
    listModel = new MyListModel(
    new String[]
    {"United States", "France", "United Kingdom", "Germany",
     "India", "Norway", "China", "Canada", "Denmark"},
     new Image[]
     {imageUS, imageFrance, imageUK, imageGermany, imageIndia,
      imageNorway, imageChina, imageCanada, imageDenmark});
      
      // Set list model
      jList1.setModel(listModel);
      
      // Set list cell renderer
      jList1.setCellRenderer(myListCellRenderer);
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        imageViewer1 = new guipropertyeditordemo.ImageViewer();
        
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
          public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jList1ValueChanged(evt);
          }
        });
        
        jScrollPane1.setViewportView(jList1);
        
        jSplitPane1.setLeftComponent(jScrollPane1);
      
      jSplitPane1.setRightComponent(imageViewer1);
      
      getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents
  
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
      Image image = listModel.getImage(jList1.getSelectedValue());
      imageViewer1.setImage(image);
    }//GEN-LAST:event_jList1ValueChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jList1;
    private guipropertyeditordemo.ImageViewer imageViewer1;
    // End of variables declaration//GEN-END:variables
}