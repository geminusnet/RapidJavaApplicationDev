package jdbcdemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.sql.*;

public class TestOraJdbcThin extends JApplet {
  // SQL Statement
  Statement stmt;

  boolean isStandalone = false;
  JPanel jPanel1 = new JPanel();
  JTextArea jtaOutput = new JTextArea();
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel jLabel1 = new JLabel();
  JTextField jtfTime = new JTextField();
  JButton jbtGetTime = new JButton();

  /** Initialize the applet */
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  /** Component initialization */
  private void jbInit() throws Exception {
    this.setSize(new Dimension(399, 166));
    jPanel1.setLayout(borderLayout1);
    jLabel1.setText("Server Time");
    jbtGetTime.setText("Get Server Time");
    jbtGetTime.addActionListener(
      new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jbtGetTime_actionPerformed(e);
      }
    });
    this.getContentPane().add(jPanel1, BorderLayout.NORTH);
    jPanel1.add(jLabel1, BorderLayout.WEST);
    jPanel1.add(jtfTime, BorderLayout.CENTER);
    jPanel1.add(jbtGetTime, BorderLayout.EAST);
    this.getContentPane().add(jtaOutput, BorderLayout.CENTER);

    // Initialized JDBC
    initializeJDBC();
  }

  private void initializeJDBC() {
    try {
      // Load the Oracle JDBC Thin driver
      Class.forName("oracle.jdbc.driver.OracleDriver");
      jtaOutput.append("Driver oracle.jdbc.driver.OracleDriver" +
        " loaded"+'\n');

      // Connect to the sample database
      Connection connection = DriverManager.getConnection
        ("jdbc:oracle:thin:@liang.armstrong.edu:1521:test",
         "scott", "tiger");
      jtaOutput.append("Database jdbc:oracle:thin:scott/tiger" +
        "@liang.armstrong.edu:1521:test connected"+'\n');

      // Create a Statement
      stmt = connection.createStatement();
    }
    catch (Exception ex) {
      jtaOutput.append(ex.getMessage() + '\n');
    }
  }

  void jbtGetTime_actionPerformed(ActionEvent e) {
    String query = "select sysdate from Dual";

    if (e.getSource() instanceof JButton) {
      try {
        // Execute the query
        jtaOutput.append("Executing query " + query + "\n");
        ResultSet rset = stmt.executeQuery(query);

        // Display the time
        while (rset.next())
          jtfTime.setText(rset.getString(1));
      }
      catch (Exception ex) {
        jtaOutput.append(ex.getMessage() + '\n');
      }
    }
  }
}