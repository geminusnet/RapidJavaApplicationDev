/*
 * TestImageViewer.java
 *
 * Created on March 24, 2002, 9:36 PM
 */

package imageviewerdemo;

/**
 *
 * @author  liangy
 */
public class TestImageViewer extends javax.swing.JApplet {
  
  /** Creates new form TestImageViewer */
  public TestImageViewer() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    imageViewer1 = new imageviewerdemo.ImageViewer();

    imageViewer1.setImageFilename("/image/ca.gif");
    getContentPane().add(imageViewer1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private imageviewerdemo.ImageViewer imageViewer1;
  // End of variables declaration//GEN-END:variables
  
}
