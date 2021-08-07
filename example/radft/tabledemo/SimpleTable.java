package tabledemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class SimpleTable extends JApplet {
  boolean isStandalone = false;
  JScrollPane jScrollPane1 = new JScrollPane();
  JTable jTable1;

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

    // Create table column names
    String[] columnNames =
      {"Title", "Author", "Publisher", "In-stock"};

    // Create table data
    Object[][] data = {
      {"Introduction to Java Programming", "Y. Daniel Liang",
       "Que Education & Training", new Boolean(false)},
      {"Introduction to Java Programming, Second Edition",
       "Y. Daniel Liang", "Que Education & Training",
       new Boolean(true)},
      {"Introduction to Java Programming, Thrid Edition",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
      {"Introduction to Java Programming With Visual J++ 6",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
      {"Introduction to Java Programming with JBuilder 3",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
      {"Rapid Java Application Development Using JBuilder 3",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
      {"Rapid Java Application Development Using JBuilder 4 and 5",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
      {" Introduction to Java Programming with JBuilder 4",
       "Y. Daniel Liang", "Prentice Hall", new Boolean(true)},
    };

    // Create a table
    jTable1 = new JTable(data, columnNames);
    jScrollPane1.getViewport().add(jTable1, null);

    jTable1.setRowHeight(24);
  }

  /**Main method*/
  public static void main(String[] args) {
    SimpleTable applet = new SimpleTable();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("A Simple Table");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
}