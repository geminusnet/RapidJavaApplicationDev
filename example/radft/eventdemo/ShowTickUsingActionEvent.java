package eventdemo;

public class ShowTickUsingActionEvent extends javax.swing.JApplet {
  /** Creates new form ShowTickUsingActionEvent */
  public ShowTickUsingActionEvent() {
    initComponents();
    tickUsingActionEvent1.start();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    private void initComponents() {//GEN-BEGIN:initComponents
      tickUsingActionEvent1 = new eventdemo.TickUsingActionEvent();
      messagePanel1 = new messagepaneldemo.MessagePanel();
      
      tickUsingActionEvent1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          tickUsingActionEvent1ActionPerformed(evt);
        }
      });
      
      
      messagePanel1.setBackground(java.awt.Color.cyan);
      messagePanel1.setYCoordinate(30);
      getContentPane().add(messagePanel1, java.awt.BorderLayout.CENTER);
      
    }//GEN-END:initComponents
    
    private void tickUsingActionEvent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tickUsingActionEvent1ActionPerformed
      messagePanel1.setMessage("Tick count is " +
      tickUsingActionEvent1.getTickCount() + " and tick interval is "
      +tickUsingActionEvent1.getTickInterval());
    }//GEN-LAST:event_tickUsingActionEvent1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eventdemo.TickUsingActionEvent tickUsingActionEvent1;
    private messagepaneldemo.MessagePanel messagePanel1;
    // End of variables declaration//GEN-END:variables
}