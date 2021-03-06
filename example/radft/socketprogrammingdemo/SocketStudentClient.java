// SocketStudentClient.java: Student Client
package socketprogrammingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class SocketStudentClient extends JApplet {
  // Declare I/O streams
  protected BufferedReader isFromServer;
  protected PrintWriter osToServer;

  boolean isStandalone = false;

  public void initialize() {
    try {
      // Create a socket to connect to the server
      Socket connectToServer = new Socket("localhost", 8000);

      // Create a buffered input stream to receive data
      // from the server
      isFromServer = new BufferedReader(
        new InputStreamReader(connectToServer.getInputStream()));

      // Create a buffered output stream to send data to the server
      osToServer =
        new PrintWriter(connectToServer.getOutputStream(), true);
    }
    catch (IOException ex) {
      System.err.println(ex);
    }
  }

  /** Creates component */
  public SocketStudentClient() {
    initComponents();
    
    initialize();
  }
  
  private void initComponents() {
    jbtGetScore = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jlblName = new javax.swing.JLabel();
    jtfName = new javax.swing.JTextField();
    jlblScore = new javax.swing.JLabel();
    jtfScore = new javax.swing.JTextField();
    jbtGetScore.setText("Get Score");
    jbtGetScore.addActionListener(
      new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtGetScoreActionPerformed(evt);
      }
    });
    getContentPane().add(jbtGetScore, java.awt.BorderLayout.SOUTH);
    jPanel1.setLayout(new java.awt.GridLayout(2, 2));
    jlblName.setText("Name");
    jPanel1.add(jlblName);
    jPanel1.add(jtfName);
    jlblScore.setText("Score");
    jPanel1.add(jlblScore);
    jPanel1.add(jtfScore);
    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);  
  }
  
  /** Main method */
  public static void main(String[] args) {
    SocketStudentClient applet = new SocketStudentClient();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    frame.setTitle("SocketStudentClient");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(250, 150);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, 
      (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(3);
  }

  void jbtGetScoreActionPerformed(ActionEvent e) {
    try {
      // Send student name to the server
      osToServer.println(jtfName.getText().trim());

      // Get score from the server as a string
      StringTokenizer st = new StringTokenizer(
        isFromServer.readLine());

      // Convert string to double
      double score = new Double(
        st.nextToken()).doubleValue();

      // Display the result
      if (score < 0)
        jtfScore.setText("Not found");
      else
        jtfScore.setText(new Double(score).toString());
    }
    catch (IOException ex) {
      System.err.println(ex);
    }
  }
  
  private JLabel jlblName = new JLabel();
  private JTextField jtfName = new JTextField();
  private JButton jbtGetScore = new JButton();
  private JTextField jtfScore = new JTextField();
  private JPanel jPanel1 = new JPanel();
  private GridLayout gridLayout1 = new GridLayout();
  private BorderLayout borderLayout1 = new BorderLayout();
  private TitledBorder titledBorder1;
  private JLabel jlblScore = new JLabel();
}