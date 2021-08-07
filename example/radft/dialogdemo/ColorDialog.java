package dialogdemo;

import java.awt.Color;

public class ColorDialog extends javax.swing.JDialog {
  // Declare color component values and selected color
  private int redValue, greenValue, blueValue;
  private java.awt.Color color = null;
  
  /** Default constructor */
  public ColorDialog() {
    this(null, true);
  }
  
  /** Creates new form ColorDialog */
  public ColorDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setTitle("Choose Color");
    initComponents();
  }
  
  /**  Return color */
  public Color getColor() {
    return color;
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
      jpButtons = new javax.swing.JPanel();
      jbtOK = new javax.swing.JButton();
      jbtCancel = new javax.swing.JButton();
      jpColor = new javax.swing.JPanel();
      jpSelectColor = new javax.swing.JPanel();
      jpLabels = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jpSliders = new javax.swing.JPanel();
      jslRed = new javax.swing.JSlider();
      jslGreen = new javax.swing.JSlider();
      jslBlue = new javax.swing.JSlider();
      jpSelectedColor = new javax.swing.JPanel();
      
      addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
          closeDialog(evt);
        }
      });
      
      jbtOK.setText("OK");
      jbtOK.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtOKActionPerformed(evt);
        }
      });
      
      jpButtons.add(jbtOK);
      
      jbtCancel.setText("Cancel");
      jbtCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtCancelActionPerformed(evt);
        }
      });
      
      jpButtons.add(jbtCancel);
      
      getContentPane().add(jpButtons, java.awt.BorderLayout.SOUTH);
          
          jpColor.setLayout(new java.awt.BorderLayout());
          
          jpSelectColor.setLayout(new java.awt.BorderLayout());
          
          jpSelectColor.setBorder(new javax.swing.border.TitledBorder("Select Color"));
          jpLabels.setLayout(new java.awt.GridLayout(3, 0));
          
          jLabel1.setText("Red");
          jpLabels.add(jLabel1);
          
          jLabel2.setText("Green");
          jpLabels.add(jLabel2);
          
          jLabel3.setText("Blue");
          jpLabels.add(jLabel3);
          
          jpSelectColor.add(jpLabels, java.awt.BorderLayout.WEST);
        
        jpSliders.setLayout(new java.awt.GridLayout(3, 0));
          
          jslRed.setMaximum(128);
          jslRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
              jslRedStateChanged(evt);
            }
          });
          
          jpSliders.add(jslRed);
          
          jslGreen.setMaximum(128);
          jslGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
              jslGreenStateChanged(evt);
            }
          });
          
          jpSliders.add(jslGreen);
          
          jslBlue.setMaximum(128);
          jslBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
              jslBlueStateChanged(evt);
            }
          });
          
          jpSliders.add(jslBlue);
          
          jpSelectColor.add(jpSliders, java.awt.BorderLayout.CENTER);
        
        jpColor.add(jpSelectColor, java.awt.BorderLayout.SOUTH);
      
      jpColor.add(jpSelectedColor, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(jpColor, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents
  
  private void jslBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslBlueStateChanged
    blueValue = jslBlue.getValue();
    color = new Color(redValue, greenValue, blueValue);
    jpSelectedColor.setBackground(color);
  }//GEN-LAST:event_jslBlueStateChanged
  
  private void jslGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslGreenStateChanged
    greenValue = jslGreen.getValue();
    color = new Color(redValue, greenValue, blueValue);
    jpSelectedColor.setBackground(color);
  }//GEN-LAST:event_jslGreenStateChanged
  
  private void jslRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslRedStateChanged
    redValue = jslRed.getValue();
    color = new Color(redValue, greenValue, blueValue);
    jpSelectedColor.setBackground(color);
  }//GEN-LAST:event_jslRedStateChanged
  
  private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
    color = null;
    setVisible(false);
  }//GEN-LAST:event_jbtCancelActionPerformed
  
  public java.awt.Dimension getPreferredSize() {
    return new java.awt.Dimension(200, 200);
  }
  
    private void jbtOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOKActionPerformed
      setVisible(false);
    }//GEN-LAST:event_jbtOKActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
      setVisible(false);
      dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      new ColorDialog(new javax.swing.JFrame(), true).show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpButtons;
    private javax.swing.JButton jbtOK;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JPanel jpColor;
    private javax.swing.JPanel jpSelectColor;
    private javax.swing.JPanel jpLabels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpSliders;
    private javax.swing.JSlider jslRed;
    private javax.swing.JSlider jslGreen;
    private javax.swing.JSlider jslBlue;
    private javax.swing.JPanel jpSelectedColor;
    // End of variables declaration//GEN-END:variables
}