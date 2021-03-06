/**
 * Store test in test.txt
 * The student table stores student username, password and newexam
 * Delete the rows in score and scorelog
 * MS Access Data source name classtest in c:\exams\classtest
 *
 * Before using this program, empty score and scroelog, create a new
 * column named newexam in the student table
 * @version 1.0 2/6/2001
 * @author Y. Daniel Liang
 */
package exercise14_6;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Exercise14_6 extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";
  PreparedStatement pstmtCheckPassword;
  PreparedStatement pstmtExercise16_6;
  PreparedStatement pstmtGetName;

  /**Initialize global variables*/
  public void init(ServletConfig config) throws ServletException {
    super.init(config);

    try {
      initializeJdbc();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
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
      "jdbc:oracle:thin:classtest/liang@drake.armstrong.edu:1521:oracle";
      */
      // Load the Oracle JDBC Thin driver
      Class.forName(driver);

      // Connect to the sample database
      Connection conn = DriverManager.getConnection
        (connectionString);

      // Create prepared statements
      pstmtCheckPassword = conn.prepareStatement
        ("select count(*) from User where username = ? " +
         "and password = ?");
      pstmtExercise16_6 = conn.prepareStatement
        ("update User set password = ? where username = ?");
      pstmtGetName = conn.prepareStatement
        ("select name from User where username = ?");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**Process the HTTP Post request*/
  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    // Write HTML back to a browser
    response.setContentType(CONTENT_TYPE);

    // Obtain a print stream for sending HMTL to the browser
    PrintWriter out = response.getWriter();

    // Obtain username and password
    String username = request.getParameter("username").trim();
    String oldPassword = request.getParameter("oldPassword").trim();
    String newPassword = request.getParameter("newPassword").trim();
    String confirmNewPassword = request.getParameter("confirmNewPassword").trim();

    // Check password
    try {
      pstmtCheckPassword.setString(1, username.trim());
      pstmtCheckPassword.setString(2, oldPassword.trim());
      ResultSet resultSet = pstmtCheckPassword.executeQuery();

      resultSet.next();
      if (resultSet.getInt(1) < 1) {
        out.println("Your old password is incorrect. Please try again<p>");
        out.println("<form method=\"post\" action=exercise14_6.Exercise14_6>");
        out.println("<p>Username <input type=\"text\" name=\"username\">&nbsp;" +
"<p>Old Password <input type=\"password\" name=\"oldPassword\">&nbsp;" +
"<p>New Password <input type=\"password\" name=\"newPassword\">&nbsp;" +
"<p>Confirm New Password <input type=\"password\" name=\"confirmNewPassword\">&nbsp;" +
"<p><input type=\"submit\" name=\"Submit\" value=\"Submit\">" +
"   <input type=\"reset\" value=\"Reset\"></p>" +
"</form>");
        return;
      }

      if (newPassword.equals(confirmNewPassword)) {
        pstmtExercise16_6.setString(1, newPassword);
        pstmtExercise16_6.setString(2, username);
        pstmtExercise16_6.executeUpdate();

        pstmtGetName.setString(1, username);
        resultSet = pstmtGetName.executeQuery();

        resultSet.next();
        String name = resultSet.getString(1);

        out.println("Hello, " + name + ", your password has been updated!");
      }
      else {
        out.println("Your new password is not confirmed correctly. Please try again<p>");
        out.println("<form method=\"post\" action=exercise14_6.Exercise14_6>");
        out.println("<p>Username <input type=\"text\" name=\"username\">&nbsp;" +
"<p>Old Password <input type=\"password\" name=\"oldPassword\">&nbsp;" +
"<p>New Password <input type=\"password\" name=\"newPassword\">&nbsp;" +
"<p>Confirm New Password <input type=\"password\" name=\"confirmNewPassword\">&nbsp;" +
"<p><input type=\"submit\" name=\"Submit\" value=\"Submit\">" +
"   <input type=\"reset\" value=\"Reset\"></p>" +
"</form>");
        return;
      }
    }
    catch (Exception ex) {
      ex.printStackTrace();
      return;
    }
  }
}
