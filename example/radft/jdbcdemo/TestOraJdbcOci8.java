package jdbcdemo;

import java.sql.*;

public class TestOraJdbcOci8 {
  public static void main(String[] args)
    throws SQLException, ClassNotFoundException {
    // Load the Oracle JDBC driver
    Class.forName ("oracle.jdbc.driver.OracleDriver");
    System.out.println("Driver oracle.jdbc.driver.OracleDriver loaded");

    // Connect to the sample database
    Connection connection = DriverManager.getConnection
      ("jdbc:oracle:oci8:@liang", "scott", "tiger");
    System.out.println("Database connected");

    // Create a Statement
    Statement stmt = connection.createStatement();

    // Select the date and time from the server
    ResultSet rset = stmt.executeQuery("select sysdate from Dual");

    // Show the system date and time
    while (rset.next())
      System.out.println(rset.getString(1));
  }
}