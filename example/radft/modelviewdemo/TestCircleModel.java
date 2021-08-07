package modelviewdemo;

public class TestCircleModel extends javax.swing.JApplet {
  /** Creates new form TestCircleModel */
  public TestCircleModel() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    circleModel1 = new modelviewdemo.CircleModel();
    circleEditor1 = new modelviewdemo.CircleEditor();
    circleView1 = new modelviewdemo.CircleView();

    circleModel1.setColor(java.awt.Color.blue);
    circleModel1.setFilled(true);
    circleModel1.setRadius(40.0);

    circleEditor1.setBorder(new javax.swing.border.TitledBorder("CircleEditor"));
    circleEditor1.setModel(circleModel1);
    getContentPane().add(circleEditor1, java.awt.BorderLayout.NORTH);

    circleView1.setBorder(new javax.swing.border.TitledBorder("CircleView"));
    circleView1.setModel(circleModel1);
    getContentPane().add(circleView1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private modelviewdemo.CircleView circleView1;
  private modelviewdemo.CircleEditor circleEditor1;
  private modelviewdemo.CircleModel circleModel1;
  // End of variables declaration//GEN-END:variables
}