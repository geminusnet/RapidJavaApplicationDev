package mortgagedemo;

import java.text.*;

public class ComputeMortgage extends javax.swing.JApplet {
  /** Creates new form ComputeMortgage */
  public ComputeMortgage() {
    initComponents();
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
        jpInput = new javax.swing.JPanel();
        jpInputLabels = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpInputTextFields = new javax.swing.JPanel();
        jtfLoanAmount = new javax.swing.JTextField();
        jtfInterestRate = new javax.swing.JTextField();
        jtfYears = new javax.swing.JTextField();
        jbtCompute = new javax.swing.JButton();
        jpResults = new javax.swing.JPanel();
        jpResultLabels = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpResultTextFields = new javax.swing.JPanel();
        jtfMonthlyPay = new javax.swing.JTextField();
        jtfTotalPay = new javax.swing.JTextField();
        
        jpInput.setLayout(new java.awt.BorderLayout());
        
        jpInput.setBorder(new javax.swing.border.TitledBorder("Enter Loan Amount, Interest Rate, and Years"));
        jpInputLabels.setLayout(new java.awt.GridLayout(3, 0));
        
        jLabel1.setText("Loan Amount");
        jpInputLabels.add(jLabel1);
        
        jLabel2.setText("Interest Rate");
        jpInputLabels.add(jLabel2);
        
        jLabel3.setText("Years");
        jpInputLabels.add(jLabel3);
        
        jpInput.add(jpInputLabels, java.awt.BorderLayout.WEST);
      
      jpInputTextFields.setLayout(new java.awt.GridLayout(3, 0));
        
        jtfLoanAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpInputTextFields.add(jtfLoanAmount);
        
        jtfInterestRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpInputTextFields.add(jtfInterestRate);
        
        jtfYears.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpInputTextFields.add(jtfYears);
        
        jpInput.add(jpInputTextFields, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(jpInput, java.awt.BorderLayout.NORTH);
        
        jbtCompute.setText("Compute");
        jbtCompute.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtComputeActionPerformed(evt);
          }
        });
        
        getContentPane().add(jbtCompute, java.awt.BorderLayout.SOUTH);
        
        jpResults.setLayout(new java.awt.BorderLayout());
        
        jpResults.setBorder(new javax.swing.border.TitledBorder("Mortgage Payments"));
        jpResultLabels.setLayout(new java.awt.GridLayout(2, 0));
        
        jLabel4.setText("Monthly Pay");
        jpResultLabels.add(jLabel4);
        
        jLabel5.setText("Total Pay");
        jpResultLabels.add(jLabel5);
        
        jpResults.add(jpResultLabels, java.awt.BorderLayout.WEST);
      
      jpResultTextFields.setLayout(new java.awt.GridLayout(2, 0));
        
        jtfMonthlyPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpResultTextFields.add(jtfMonthlyPay);
        
        jtfTotalPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpResultTextFields.add(jtfTotalPay);
        
        jpResults.add(jpResultTextFields, java.awt.BorderLayout.CENTER);
      
      getContentPane().add(jpResults, java.awt.BorderLayout.CENTER);
    
  }//GEN-END:initComponents

  private void jbtComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtComputeActionPerformed
    // Retrieve input from user
    double loan = new Double(jtfLoanAmount.getText()).doubleValue();
    double interestRate =
      new Double(jtfInterestRate.getText()).doubleValue()/1200;
    int year = new Integer(jtfYears.getText()).intValue();

    // Calculate payment
    double monthlyPay =
      loan*interestRate/(1-(Math.pow(1/(1+interestRate),year*12)));
    double totalPay = monthlyPay*year*12;

    // Display results in currency format
    NumberFormat nf = NumberFormat.getCurrencyInstance(getLocale());
    jtfMonthlyPay.setText(nf.format(monthlyPay));
    jtfTotalPay.setText(nf.format(totalPay));
  }//GEN-LAST:event_jbtComputeActionPerformed

  /** Main method */
  public static void main(String[] args) {
    ComputeMortgage applet = new ComputeMortgage();
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setTitle("ComputeMortgage");
    frame.getContentPane().add(applet, java.awt.BorderLayout.CENTER);
    frame.setSize(400,320);
    java.awt.Dimension d = 
      java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, 
      (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpInput;
  private javax.swing.JPanel jpInputLabels;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jpInputTextFields;
  private javax.swing.JTextField jtfLoanAmount;
  private javax.swing.JTextField jtfInterestRate;
  private javax.swing.JTextField jtfYears;
  private javax.swing.JButton jbtCompute;
  private javax.swing.JPanel jpResults;
  private javax.swing.JPanel jpResultLabels;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jpResultTextFields;
  private javax.swing.JTextField jtfMonthlyPay;
  private javax.swing.JTextField jtfTotalPay;
  // End of variables declaration//GEN-END:variables
}