package modelviewdemo;

public class TestCircleUsingBoundProperties extends javax.swing.JApplet {
  /** Creates new form TestCircleUsingBoundProperties */
  public TestCircleUsingBoundProperties() {
    initComponents();
  }
  
    private void initComponents() {//GEN-BEGIN:initComponents
        circleModel = new modelviewdemo.CircleModelUsingBoundProperties();
        editor = new modelviewdemo.CircleEditorUsingBoundProperties();
        view = new modelviewdemo.CircleViewUsingBoundProperties();

        editor.setBorder(new javax.swing.border.TitledBorder("Circle Editor"));
        editor.setModel(circleModel);
        getContentPane().add(editor, java.awt.BorderLayout.NORTH);

        view.setBorder(new javax.swing.border.TitledBorder("Circle View"));
        view.setModel(circleModel);
        getContentPane().add(view, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelviewdemo.CircleModelUsingBoundProperties circleModel;
    private modelviewdemo.CircleEditorUsingBoundProperties editor;
    private modelviewdemo.CircleViewUsingBoundProperties view;
    // End of variables declaration//GEN-END:variables
}