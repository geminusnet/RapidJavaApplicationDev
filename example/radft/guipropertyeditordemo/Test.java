/*
 * Test.java
 *
 * Created on March 26, 2002, 7:48 AM
 */

package guipropertyeditordemo;

/**
 *
 * @author  administrator
 */
public class Test extends javax.swing.JApplet {
    
    /** Creates new form Test */
    public Test() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jTabbedPane1 = new javax.swing.JTabbedPane();
        imageViewer1 = new guipropertyeditordemo.ImageViewer();
        imageViewer2 = new guipropertyeditordemo.ImageViewer();
        imageViewer3 = new guipropertyeditordemo.ImageViewer();
        imageViewer4 = new guipropertyeditordemo.ImageViewer();

        imageViewer1.setImageFilename("/image/us.gif");
        jTabbedPane1.addTab("US", imageViewer1);

        jTabbedPane1.addTab("tab2", imageViewer2);

        jTabbedPane1.addTab("tab3", imageViewer3);

        jTabbedPane1.addTab("tab4", imageViewer4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private guipropertyeditordemo.ImageViewer imageViewer4;
    private guipropertyeditordemo.ImageViewer imageViewer3;
    private guipropertyeditordemo.ImageViewer imageViewer2;
    private guipropertyeditordemo.ImageViewer imageViewer1;
    // End of variables declaration//GEN-END:variables
    
}
