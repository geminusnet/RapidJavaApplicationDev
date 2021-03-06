package exercise13_8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.table.*;

public class Exercise13_8 extends JApplet {
  boolean isStandalone = false;
  JScrollPane jScrollPane1 = new JScrollPane();
  JTable jTable1 = new JTable();

  MyTableModel tableModel = new MyTableModel();

  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public Exercise13_8() {
  }
  /**Initialize the applet*/
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  /**Component initialization*/
  private void jbInit() throws Exception {
    this.setSize(new Dimension(400,300));
    this.getContentPane().add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jTable1, null);
    jTable1.setModel(tableModel);
    jTable1.setRowHeight(50);

    tableModel.setColumnIdentifiers(new Object[]{"Name", "Flag",
      "Description"});

    // Set custom renderer for displaying images
    TableColumn flag = jTable1.getColumn("Flag");
    flag.setCellRenderer(new MyImageCellRenderer());

    getData();
  }

  private void getData() throws Exception {
    // Load the driver
    Class.forName("com.borland.datastore.jdbc.DataStoreDriver");
    // Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("Driver loaded");

    // Establish connection
    Connection connection = DriverManager.getConnection
      ("jdbc:borland:dslocal:C:\\radjb\\LiangBookDB.jds",
       "scott", "tiger");
//      ("jdbc:oracle:thin:@liang.armstrong.edu:1521:test",
//       "scott", "tiger");
    System.out.println("Database connected");

    // Create a statement for static SQL
    Statement stmt = connection.createStatement();

    ResultSet rs = stmt.executeQuery("select * from Country");

    Vector tableVector = new Vector();

    while (rs.next()) {
      Vector vector = new Vector();
      vector.add(rs.getString(1));
      vector.add(getImageIcon(rs.getBinaryStream(2)));
      vector.add(rs.getString(3));
      tableModel.addRow(vector);
    }
  }

  private ImageIcon getImageIcon(InputStream inputStream)
    throws Exception {
    byte[] bytes = new byte[inputStream.available()];
    inputStream.read(bytes);
    return new ImageIcon(bytes);
  }

  /**Main method*/
  public static void main(String[] args) {
    Exercise13_8 applet = new Exercise13_8();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Exercise13_9");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
}