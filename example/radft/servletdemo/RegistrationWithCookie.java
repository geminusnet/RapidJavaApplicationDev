package servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegistrationWithCookie extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";
  // Use a prepared statement to store a student into the database
  private PreparedStatement pstmt;

  /** Initialize global variables */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    initializeJdbc();
  }

  /** Process the HTTP Get request */
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Obtain data from the form
    String lastName = request.getParameter("lastName");
    String firstName = request.getParameter("firstName");
    String mi = request.getParameter("mi");
    String telephone = request.getParameter("telephone");
    String email = request.getParameter("email");
    String street = request.getParameter("street");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String zip = request.getParameter("zip");

    // Create cookies and send cookies to browsers
    Cookie cookieLastName = new Cookie("lastName", lastName);
    // cookieLastName.setMaxAge(1000);
    response.addCookie(cookieLastName);
    Cookie cookieFirstName = new Cookie("firstName", firstName);
    response.addCookie(cookieFirstName);
    // cookieFirstName.setMaxAge(0);
    Cookie cookieMi = new Cookie("mi", mi);
    response.addCookie(cookieMi);
    Cookie cookieTelephone = new Cookie("telephone", telephone);
    response.addCookie(cookieTelephone);
    Cookie cookieEmail = new Cookie("email", email);
    response.addCookie(cookieEmail);
    Cookie cookieStreet = new Cookie("street", street);
    response.addCookie(cookieStreet);
    Cookie cookieCity = new Cookie("city", city);
    response.addCookie(cookieCity);
    Cookie cookieState = new Cookie("state", state);
    response.addCookie(cookieState);
    Cookie cookieZip = new Cookie("zip", zip);
    response.addCookie(cookieZip);

    System.out.println("MaxAge? " + cookieLastName.getMaxAge());
    System.out.println("MaxAge fir? " + cookieFirstName.getMaxAge());

    if (lastName.length() == 0 || firstName.length() == 0) {
      out.println("Last Name and First Name are required");
      return; // End the method
    }

    // Ask for confirmation
    out.println("You entered the following data");
    out.println("<p>Last name: " + lastName);
    out.println("<br>First name: " + firstName);
    out.println("<br>MI: " + mi);
    out.println("<br>Telephone: " + telephone);
    out.println("<br>Email: " + email);
    out.println("<br>Street: " + street);
    out.println("<br>City: " + city);
    out.println("<br>State: " + state);
    out.println("<br>Zip: " + zip);

    // Set the action for processing the answers
    out.println("<p><form method=\"post\" action=" + 
      "servletdemo.RegistrationWithCookie>");
    out.println("<p><input type=\"submit\"" +
      " value=\"Confirm\" name=\"B1\">");
    out.println("</form>");
    out.close(); // Close stream
  }

  /** Process the HTTP Post request */
  public void doPost(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();

    String lastName = "";
    String firstName = "";
    String mi = "";
    String telephone = "";
    String email = "";
    String street = "";
    String city = "";
    String state = "";
    String zip = "";

    // Read the cookies
    Cookie[] cookies = request.getCookies();

    // Get cookie values
    for (int i=0; i<cookies.length; i++) {
      if (cookies[i].getName().equals("lastName"))
        lastName = cookies[i].getValue();
      else if (cookies[i].getName().equals("firstName"))
        firstName = cookies[i].getValue();
      else if (cookies[i].getName().equals("mi"))
        mi = cookies[i].getValue();
      else if (cookies[i].getName().equals("telephone"))
        telephone = cookies[i].getValue();
      else if (cookies[i].getName().equals("email"))
        email = cookies[i].getValue();
      else if (cookies[i].getName().equals("street"))
        street = cookies[i].getValue();
      else if (cookies[i].getName().equals("city"))
        city = cookies[i].getValue();
      else if (cookies[i].getName().equals("state"))
        state = cookies[i].getValue();
      else if (cookies[i].getName().equals("zip"))
        zip = cookies[i].getValue();
    }

    try {
      storeStudent(lastName, firstName, mi, telephone, email, street,
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
      String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
      String connectionString = "jdbc:odbc:LiangBookDB_MDB";
      // For Oracle
      // String driver = "oracle.jdbc.driver.OracleDriver";
      // String connectionString = "jdbc:oracle:thin:scott/
      //   tiger@liang.armstrong.edu:1521:oracle";

      // Load the Oracle JDBC Thin driver
      Class.forName(driver);
      System.out.println("Driver " + driver + " loaded");

      // Connect to the sample database
      Connection conn = DriverManager.getConnection
        (connectionString);
      System.out.println("Database " + connectionString +
        " connected");

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
    String mi, String telephone, String email, String street,
    String city, String state, String zip) throws SQLException {
    pstmt.setString(1, lastName);
    pstmt.setString(2, firstName);
    pstmt.setString(3, mi);
    pstmt.setString(4, telephone);
    pstmt.setString(5, email);
    pstmt.setString(6, street);
    pstmt.setString(7, city);
    pstmt.setString(8, state);
    pstmt.setString(9, zip);
    pstmt.executeUpdate();
  }
}