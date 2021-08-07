package dialogdemo;

import javax.swing.*;
import imageviewerdemo.ImageViewer;

public class TestOptionPane extends javax.swing.JApplet {

  /** Creates new form TestOptionPane */
    public TestOptionPane() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jlblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiErrorMessage = new javax.swing.JMenuItem();
        jmiInformationMessage = new javax.swing.JMenuItem();
        jmiQuestionMessage = new javax.swing.JMenuItem();
        jmiWarningMessage = new javax.swing.JMenuItem();
        jmiPlainMessage = new javax.swing.JMenuItem();
        jmiCustomIcon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiYesNo = new javax.swing.JMenuItem();
        jmiYesNoCancel = new javax.swing.JMenuItem();
        jmiOkCancel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiTfInput = new javax.swing.JMenuItem();
        jmiCboInput = new javax.swing.JMenuItem();
        jmiLstInput = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiCustomOption = new javax.swing.JMenuItem();

        getContentPane().add(jlblStatus, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("Message Dialog");
        jmiErrorMessage.setText("Error Message");
        jmiErrorMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiErrorMessageActionPerformed(evt);
            }
        });

        jMenu1.add(jmiErrorMessage);
        jmiInformationMessage.setText("Information Message");
        jmiInformationMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformationMessageActionPerformed(evt);
            }
        });

        jMenu1.add(jmiInformationMessage);
        jmiQuestionMessage.setText("Question Message");
        jmiQuestionMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiQuestionMessageActionPerformed(evt);
            }
        });

        jMenu1.add(jmiQuestionMessage);
        jmiWarningMessage.setText("Warning Message");
        jmiWarningMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiWarningMessageActionPerformed(evt);
            }
        });

        jMenu1.add(jmiWarningMessage);
        jmiPlainMessage.setText("Plain Message");
        jmiPlainMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPlainMessageActionPerformed(evt);
            }
        });

        jMenu1.add(jmiPlainMessage);
        jmiCustomIcon.setText("Custom Icon");
        jmiCustomIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCustomIconActionPerformed(evt);
            }
        });

        jMenu1.add(jmiCustomIcon);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Confirmation Dialog");
        jmiYesNo.setText("YES_NO_OPTION");
        jmiYesNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiYesNoActionPerformed(evt);
            }
        });

        jMenu2.add(jmiYesNo);
        jmiYesNoCancel.setText("YES_NO_CANCEL_OPTION");
        jmiYesNoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiYesNoCancelActionPerformed(evt);
            }
        });

        jMenu2.add(jmiYesNoCancel);
        jmiOkCancel.setText("OK_CANCEL_OPTION");
        jmiOkCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOkCancelActionPerformed(evt);
            }
        });

        jMenu2.add(jmiOkCancel);
        jMenuBar1.add(jMenu2);
        jMenu3.setText("Input Dialog");
        jmiTfInput.setText("TextField Input");
        jmiTfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTfInputActionPerformed(evt);
            }
        });

        jMenu3.add(jmiTfInput);
        jmiCboInput.setText("ComboBox Input");
        jmiCboInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCboInputActionPerformed(evt);
            }
        });

        jMenu3.add(jmiCboInput);
        jmiLstInput.setText("List Input");
        jmiLstInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLstInputActionPerformed(evt);
            }
        });

        jMenu3.add(jmiLstInput);
        jMenuBar1.add(jMenu3);
        jMenu4.setText("Option Dialog");
        jmiCustomOption.setText("Custom Option");
        jmiCustomOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCustomOptionActionPerformed(evt);
            }
        });

        jMenu4.add(jmiCustomOption);
        jMenuBar1.add(jMenu4);
        setJMenuBar(jMenuBar1);

    }//GEN-END:initComponents

    private void jmiOkCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOkCancelActionPerformed
    int selectedOption =
      JOptionPane.showConfirmDialog(this, "Confirm?",
        "YES_NO_OPTION", JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE);
    jlblStatus.setText("Option " + selectedOption + " selected");
    }//GEN-LAST:event_jmiOkCancelActionPerformed

    private void jmiYesNoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiYesNoCancelActionPerformed
    int selectedOption =
      JOptionPane.showConfirmDialog(this, "Confirm?",
        "YES_NO_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE);
    jlblStatus.setText("Option " + selectedOption + " selected");
    }//GEN-LAST:event_jmiYesNoCancelActionPerformed

    private void jmiYesNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiYesNoActionPerformed
    int selectedOption =
      JOptionPane.showConfirmDialog(this, "Confirm?",
        "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
    jlblStatus.setText("Option " + selectedOption + " selected");
    }//GEN-LAST:event_jmiYesNoActionPerformed

    private void jmiCustomOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCustomOptionActionPerformed
    int value =
      JOptionPane.showOptionDialog(this, "Select a button",
        "Option Dialog", JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[]{"Button 0", "Button 1", "Button 2"},
        "Button 1");
    jlblStatus.setText("Value is " + value);
    }//GEN-LAST:event_jmiCustomOptionActionPerformed

    private void jmiLstInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLstInputActionPerformed
    Object input =
      JOptionPane.showInputDialog(this, "Select an item",
        "Choose a State", JOptionPane.QUESTION_MESSAGE, null,
        new String[]{"Item 1", "Item 2", "Item 3", "Item 4",
          "Item 5", "Item 6", "Item 7", "Item 8", "Item 9",
          "Item 10", "Item 11", "Item 12", "Item 13", "Item 14",
          "Item 15", "Item 16", "Item 17", "Item 18", "Item 19",
          "Item 20"},
        "Item 5");
    jlblStatus.setText("Input is " + input);
    }//GEN-LAST:event_jmiLstInputActionPerformed

    private void jmiCboInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCboInputActionPerformed
    Object input =
      JOptionPane.showInputDialog(this, "Select a school",
        "Choose a School", JOptionPane.QUESTION_MESSAGE, null,
        new String[]{"Arts and Science", "Engineering", "Education"},
        "Engineering");
    jlblStatus.setText("Input is " + input);
    }//GEN-LAST:event_jmiCboInputActionPerformed

    private void jmiTfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTfInputActionPerformed
    String input =
      JOptionPane.showInputDialog(this, "Enter your name");
    jlblStatus.setText("Input is " + input);
    }//GEN-LAST:event_jmiTfInputActionPerformed

    private void jmiCustomIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCustomIconActionPerformed
    JOptionPane.showMessageDialog(this, "This is a printer",
      "Custom icon", JOptionPane.INFORMATION_MESSAGE,
      ImageViewer.createImageIcon("/image/print.gif", this));
    }//GEN-LAST:event_jmiCustomIconActionPerformed

    private void jmiPlainMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPlainMessageActionPerformed
    JOptionPane.showMessageDialog(this, new clockdemo.Clock(),
      "Current Time", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jmiPlainMessageActionPerformed

    private void jmiWarningMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiWarningMessageActionPerformed
    JOptionPane.showMessageDialog(this, "This is a warning",
      "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jmiWarningMessageActionPerformed

    private void jmiQuestionMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiQuestionMessageActionPerformed
    JOptionPane.showMessageDialog(this, "This is a question",
      "Question", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_jmiQuestionMessageActionPerformed

    private void jmiInformationMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformationMessageActionPerformed
    JOptionPane.showMessageDialog(this, "This is an information",
      "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiInformationMessageActionPerformed

    private void jmiErrorMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiErrorMessageActionPerformed
    JOptionPane.showMessageDialog(this, "This is an error",
      "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jmiErrorMessageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jmiYesNoCancel;
    private javax.swing.JMenuItem jmiWarningMessage;
    private javax.swing.JMenuItem jmiCustomIcon;
    private javax.swing.JMenuItem jmiCustomOption;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jmiLstInput;
    private javax.swing.JMenuItem jmiYesNo;
    private javax.swing.JMenuItem jmiInformationMessage;
    private javax.swing.JMenuItem jmiCboInput;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JMenuItem jmiOkCancel;
    private javax.swing.JMenuItem jmiQuestionMessage;
    private javax.swing.JMenuItem jmiTfInput;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiErrorMessage;
    private javax.swing.JMenuItem jmiPlainMessage;
    // End of variables declaration//GEN-END:variables

}