package exercise14_8;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import Acme.JPM.Encoders.GifEncoder;
import exercise4_8.BarChart;
import exercise4_8.ChartModel;

public class Exercise14_8 extends HttpServlet {
  /**Initialize global variables*/
  private final static int width = 300;
  private final static int height = 300;

  Connection conn = null;

  // Create image
  private Image image = new BufferedImage(width, height,
    BufferedImage.TYPE_INT_ARGB);

  // Get Graphics context of the image
  private Graphics g = image.getGraphics();

  // Create bar chart
  private BarChart barChart = new BarChart();

  // Create chart model
  private ChartModel chartModel = new ChartModel();

  // Create a frame to provide graphics enviorment for rendering
  // the clock
  private JFrame frame = new JFrame();

  /**Initialize global variables*/
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    frame.setSize(width, height); // Set the frame size
    barChart.setModel(chartModel);
    frame.getContentPane().add(barChart); // Add clock to the frame

    initializeJdbc();
  }

  /**Initialize database connection*/
  private void initializeJdbc() {
    try {
      // Declare driver and connection string
      String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
      String connectionString = "jdbc:odbc:LiangBookDB_MDB";
      /* For Oracle
      String driver = "oracle.jdbc.driver.OracleDriver";
      String connectionString =
      "jdbc:oracle:thin:scott/tiger@liang.armstrong.edu:1521:oracle";
      */
      // Load the Oracle JDBC Thin driver
      Class.forName(driver);

      // Connect to the sample database
      conn = DriverManager.getConnection
        (connectionString);
    }
    catch (Exception ex) {
      System.out.println(ex);
    }
  }

  /**Process the HTTP Get request*/
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("image/gif");
    OutputStream out = response.getOutputStream();

    String[] dataName = null;
    double[] data = null;

    try {
      Statement stmt = conn.createStatement();
      //  This doesn't work!!! ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

      ResultSet rs = stmt.executeQuery("select deptname, count(*) " +
        "from department, employee " +
        "where department.deptno = employee.deptno " +
        "group by deptname; ");

      // Count rows
      int count = 0;
      while (rs.next()) {
        count++;
      }

      dataName = new String[count];
      data = new double[count];

      rs = stmt.executeQuery("select deptname, count(*) " +
        "from department, employee " +
        "where department.deptno = employee.deptno " +
        "group by deptname; ");

      int i=0;
      while (rs.next()) {
        dataName[i] = rs.getString(1);
        data[i] = rs.getInt(2);
        i++;
      }
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

    frame.setVisible(true);
    g.setColor(Color.white);
    g.fillRect(0, 0, width, height);
    g.setColor(Color.black);

    chartModel.setChartData(dataName, data);

    // Invoke paintComponent, not paint, because barChart is a
    // Swing JPanel subclass. The paintComponent method is invoked
    // to draw the bar chart in the BarChart class.
    barChart.paintComponent(g);

    frame.setVisible(false);

    // Encode the image and send to the output stream
    new GifEncoder(image, out, true).encode();

    out.close(); // Close stream
  }

  /**Clean up resources*/
  public void destroy() {
  }
}