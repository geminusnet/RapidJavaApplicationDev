/*
 * Exercise2_4.java
 *
 * Created on September 22, 2001, 10:41 PM
 */

package exercise2_4;

/**
 *
 * @author  administrator
 */
public class Exercise2_4 extends javax.swing.JApplet {

  /** Creates new form Exercise2_4 */
    public Exercise2_4() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  private void initComponents() {//GEN-BEGIN:initComponents
    imageControl1 = new exercise2_4.ImageControl();
    imageControl2 = new exercise2_4.ImageControl();

    getContentPane().setLayout(new java.awt.GridLayout(1, 2));

    imageControl1.setImageFilename("/image/us.gif");
    imageControl1.setStrectched(true);
    getContentPane().add(imageControl1);

    imageControl2.setImageFilename("/image/ca.gif");
    imageControl2.setStrectched(true);
    getContentPane().add(imageControl2);

  }//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private exercise2_4.ImageControl imageControl2;
  private exercise2_4.ImageControl imageControl1;
  // End of variables declaration//GEN-END:variables

}