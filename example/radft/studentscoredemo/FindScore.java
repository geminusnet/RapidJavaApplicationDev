package studentscoredemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class FindScore extends HttpServlet
{
  private static final String CONTENT_TYPE = "text/html";
  PreparedStatement pstmtGetResult;
  Connection conn;

  /**Initialize global variables*/
  public void init(ServletConfig config) throws ServletException
  {
    super.init(config);
    initializeJdbc();
  }

  /**Initialize database connection*/
  private void initializeJdbc()
  {
    try
    {
      // Declare driver and connection string
      String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
      String connectionString = "jdbc:odbc:LiangBookDB_MDB";
      /* For Oracle
      String driver = "oracle.jdbc.driver.OracleDriver";
      String connectionString =
      "jdbc:oracle:thin:classtest/liang@drake.armstrong.edu:1521:oracle";
      */
      // Load the Oracle JDBC Thin driver
      Class.forName(driver);

      // Connect to the sample database
      conn = DriverManager.getConnection
        (connectionString);

//      pstmtGetResult = conn.prepareStatement
//        ("select name, current from csci4990 where ssn = ?");
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  /**Process the HTTP Get request*/
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();

    String ssn = "";
    String course = "";

    try
    {
      ssn = request.getParameter("ssn");
      course = request.getParameter("course");

      System.out.println("Course " + course);

      String sqlString = "select name, current from " + course + " where ssn = '"
        + ssn + "'";

      System.out.println("sqlString " + sqlString);

      Statement statement = conn.createStatement();
      ResultSet rs = statement.executeQuery(sqlString);

      if (rs == null)
        out.println("Not found");
      else
      {
        out.println("As of " + new java.util.Date().toString() + "<p>");
        while (rs.next())
        {
          out.println(rs.getString(1) + "\'s current score is ");
          out.println(rs.getDouble(2));
        }
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

//   out.println("<font color=\"green\">");
//    out.println("<p>The servlet has received a GET. This is the reply.</p>");
//    out.println("</font>");
    out.flush();
    out.close();
  }
  /**Clean up resources*/
  public void destroy()
  {
  }
}