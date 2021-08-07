package boundconstraintpropertydemo;

public class TestConstraintProperty extends javax.swing.JApplet {
  
  /** Creates new form TestConstraintProperty */
  public TestConstraintProperty() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    private void initComponents() {//GEN-BEGIN:initComponents
      editor = new boundconstraintpropertydemo.ClockEditorSupportConstraint();
      clock = new boundconstraintpropertydemo.ClockConstraintPropertyListener();
      
      editor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
          editorPropertyChange(evt);
        }
      });
      
      editor.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
        public void vetoableChange(java.beans.PropertyChangeEvent evt)
        throws java.beans.PropertyVetoException {
          editorVetoableChange(evt);
        }
      });
      
      getContentPane().add(editor, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(clock, java.awt.BorderLayout.WEST);
      
    }//GEN-END:initComponents
    
    private void editorVetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {//GEN-FIRST:event_editorVetoableChange
      clock.vetoableChange(evt);
    }//GEN-LAST:event_editorVetoableChange
    
    private void editorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_editorPropertyChange
      clock.propertyChange(evt);
    }//GEN-LAST:event_editorPropertyChange
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private boundconstraintpropertydemo.ClockEditorSupportConstraint editor;
    private boundconstraintpropertydemo.ClockConstraintPropertyListener clock;
    // End of variables declaration//GEN-END:variables
}