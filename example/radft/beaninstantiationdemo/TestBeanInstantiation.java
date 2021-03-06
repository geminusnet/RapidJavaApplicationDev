package beaninstantiationdemo;

import java.beans.*;
import displayfiguredemo.FigurePanel;

public class TestBeanInstantiation extends javax.swing.JFrame {
  /** Creates new form TestBeanInstantiation */
  public TestBeanInstantiation() {
    initComponents();
    
    // Create beans
    try {
      FigurePanel square = (FigurePanel)Beans.instantiate(
      getClass().getClassLoader(), "Square");
      FigurePanel rectangle = (FigurePanel)Beans.instantiate(
      getClass().getClassLoader(), "Rectangle");
      FigurePanel circle = (FigurePanel)Beans.instantiate(
      getClass().getClassLoader(), "Circle");
      FigurePanel oval = (FigurePanel)Beans.instantiate(
      getClass().getClassLoader(), "Oval");
      
      // Add beans to the form
      jPanel1.add(square);
      jPanel1.add(rectangle);
      jPanel1.add(circle);
      jPanel1.add(oval);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    jPanel1 = new javax.swing.JPanel();
    
    setTitle("Serialization Application");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        exitForm(evt);
      }
    });
    
    jPanel1.setLayout(new java.awt.GridLayout(2, 2));
    
    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents
  
  /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      new TestBeanInstantiation().show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}