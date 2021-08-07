package servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class SimpleRegistration extends HttpServlet {
  // Use a prepared statement to store a student into the database
  private PreparedStatement pstmt;

  /** Initialize global variables */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    initializeJdbc();
  }

  /** Process the HTTP Post request */
  public void doPost(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Obtain parameters from the client
    String lastName = request.getParameter("lastName");
    String firstName = request.getParameter("firstName");
    String mi = request.getParameter("mi");
    String phone = request.getParameter("telephone");
    String email = request.getParameter("email");
    String address = request.getParameter("street");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String zip = request.getParameter("zip");

    if (lastName.length() == 0 || firstName.length() == 0) {
      out.println("Last Name and First Name are required");
      return; // End the method
    }

    try {
      storeStudent(lastName, firstName, mi, phone, email, address,
        city, state, zip);

      out.println(firstName + " " + lastName +
        " is now registered in the database");

      out.close(); // Close stream
    }
    catch(Exception ex) {
      out.println("Error: " + ex.getMessage());
      return; // End the method
    }
  }

  /** Initialize database connection */
  private void initializeJdbc() {
    try {
      // Declare driver and connection string
      // String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
      // String connectionString = "jdbc:odbc:LiangBookDB_MDB";
      // For Oracle
      String driver = "oracle.jdbc.driver.OracleDriver";
      String connectionString =
        "jdbc:oracle:thin:scott/tiger@localhost:1521:liangy";

      // Load the Oracle JDBC Thin driver
      Class.forName(driver);

      // Connect to the sample database
      Connection conn = DriverManager.getConnection
        (connectionString);

      // Create a Statement
      pstmt = conn.prepareStatement("insert into Address " +
        "(lastName, firstName, mi, telephone, email, street, city, "
         + "state, zip) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
    }
    catch (Exception ex) {
      System.out.println(ex);
    }
  }

  /** Store a student record to the database */
  private void storeStudent(String lastName, String firstName,
    String mi, String phone, String email, String address,
    String city, String state, String zip) throws SQLException {
    pstmt.setString(1, lastName);
    pstmt.setString(2, firstName);
    pstmt.setString(3, mi);
    pstmt.setString(4, phone);
    pstmt.setString(5, email);
    pstmt.setString(6, address);
    pstmt.setString(7, city);
    pstmt.setString(8, state);
    pstmt.setString(9, zip);
    pstmt.executeUpdate();
  }
}

