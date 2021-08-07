package introdemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class TestApplet extends JApplet implements ActionListener {
  // Declare three text fields
  private JTextField jtfNum1, jtfNum2, jtfResult;

  // Declare Add button
  private JButton jbtAdd;

  /** Initialize the applet */
  public void init() {
    this.setSize(new Dimension(400,300));

    // Place labels and text fields in a panel
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    p1.add(new JLabel("Number 1"));
    p1.add(jtfNum1 = new JTextField(3));
    p1.add(new JLabel("Number 2"));
    p1.add(jtfNum2 = new JTextField(3));
    p1.add(new JLabel("Result"));
    p1.add(jtfResult = new JTextField(4));
    jtfResult.setEditable(false);  // Set it noneditable

    // Add the panel and the Add button in the frame
    this.getContentPane().add(p1, BorderLayout.CENTER);
    this.getContentPane().add(jbtAdd = new JButton("Add"),
      BorderLayout.SOUTH);

    // Register listener
    jbtAdd.addActionListener(this);
  }

  /** Handle add button action */
  public void actionPerformed(ActionEvent e) {
    int num1 =
      (Integer.valueOf(jtfNum1.getText().trim())).intValue();
    int num2 =
      (Integer.valueOf(jtfNum2.getText().trim())).intValue();
    int result = num1 + num2;

    // Display result
    jtfResult.setText(String.valueOf(result));
  }
  
  /** Main method */
  public static void main(String[] args) {
    TestApplet applet = new TestApplet();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("TestApplet");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, 
      (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
}