/*
 * TestSimplePropertyEditor.java
 *
 * Created on August 30, 2001, 9:43 PM
 */

package beaninfodemo;

/**
 *
 * @author  administrator
 */
public class TestSimplePropertyEditor extends javax.swing.JApplet {

  /** Creates new form TestSimplePropertyEditor */
    public TestSimplePropertyEditor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        student1 = new beaninfodemo.Student();

        student1.setAge(40);
        student1.setFullName("Frank,D,Edwards");
        student1.setGender("Male");
        getContentPane().add(student1, java.awt.BorderLayout.NORTH);

    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private beaninfodemo.Student student1;
    // End of variables declaration//GEN-END:variables
}