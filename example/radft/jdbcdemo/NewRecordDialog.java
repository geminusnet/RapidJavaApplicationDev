package jdbcdemo;

import java.util.*;
import java.awt.*;
import javax.swing.table.*;

public class NewRecordDialog extends javax.swing.JDialog {
  private Vector newRecord;
  
  // Table model
  DefaultTableModel tableModel = new DefaultTableModel();
  
  /** Creates new form NewRecordDialog */
  public NewRecordDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    jTable1.setModel(tableModel);
  }
  
  public NewRecordDialog() {
    this(null, true);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
      jPanel1 = new javax.swing.JPanel();
      jbtOK = new javax.swing.JButton();
      jbtCancel = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      
      setTitle("Insert a New Record");
      setModal(true);
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
      
      jPanel1.add(jbtOK);
      
      jbtCancel.setText("Cancel");
      jbtCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jbtCancelActionPerformed(evt);
        }
      });
      
      jPanel1.add(jbtCancel);
      
      getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);
      
      jScrollPane1.setViewportView(jTable1);
      
      getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    
    pack();
  }//GEN-END:initComponents

  private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
    newRecord = null;
    setVisible(false);
  }//GEN-LAST:event_jbtCancelActionPerformed
  
  public java.util.Vector getNewRecord() {
    return newRecord;
  }

  /** Display the table */
  void displayTable(Vector columnHeaderVector) {
    this.setSize(new Dimension(400, 100));

    tableModel.setDataVector(new Vector(),
      columnHeaderVector);

    // Must create a new vector for a new record
    newRecord = new Vector();
    tableModel.addRow(newRecord);

    setVisible(true);
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
      new NewRecordDialog(new javax.swing.JFrame(), true).show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtOK;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}