package studentscoredemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class StudentScore extends HttpServlet
{
  private static final String CONTENT_TYPE = "text/html";
  PreparedStatement pstmtGetResult;

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
      Connection conn = DriverManager.getConnection
        (connectionString);

      pstmtGetResult = conn.prepareStatement
        ("select name, current from csci4990 where ssn = ?");
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
    try
    {
      ssn = request.getParameter("ssn");

      pstmtGetResult.setString(1, ssn);
      ResultSet rs = pstmtGetResult.executeQuery();

      if (rs == null)
        out.println("Not found");
      else
      {
        while (rs.next())
        {
          out.println(rs.getString(1));
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