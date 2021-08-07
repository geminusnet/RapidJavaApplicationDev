package boundconstraintpropertydemo;

public class TestBoundProperty extends javax.swing.JFrame {
  /** Creates new form TestBoundProperty */
  public TestBoundProperty() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    clock = new boundconstraintpropertydemo.ClockBoundPropertyListener();
    editor = new boundconstraintpropertydemo.ClockEditor();
    
    getContentPane().setLayout(new java.awt.GridLayout(0, 2));
    
    setTitle("TestBoundProperty");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        exitForm(evt);
      }
    });
    
    getContentPane().add(clock);
    
    editor.setBorder(new javax.swing.border.TitledBorder("Clock Property Editor"));
    editor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        editorPropertyChange(evt);
      }
    });
    
    getContentPane().add(editor);
    
    pack();
  }//GEN-END:initComponents
  
    private void editorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_editorPropertyChange
      clock.propertyChange(evt);
    }//GEN-LAST:event_editorPropertyChange
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
    }//GEN-LAST:event_exitForm
    
    public static void main(String args[]) {
      new TestBoundProperty().show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private boundconstraintpropertydemo.ClockBoundPropertyListener clock;
    private boundconstraintpropertydemo.ClockEditor editor;
    // End of variables declaration//GEN-END:variables
}