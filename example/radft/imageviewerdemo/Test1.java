/*
 * Test1.java
 *
 * Created on September 4, 2001, 3:05 PM
 */

package imageviewerdemo;

/**
 *
 * @author  administrator
 */
public class Test1 extends javax.swing.JApplet {

  /** Creates new form Test1 */
    public Test1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
      imageViewer1 = new guipropertyeditordemo.ImageViewer();
      
      imageViewer1.setImageFilename("/image/us.gif");
      getContentPane().add(imageViewer1, java.awt.BorderLayout.CENTER);
      
    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private guipropertyeditordemo.ImageViewer imageViewer1;
    // End of variables declaration//GEN-END:variables

}