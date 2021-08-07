package jdbcdemo;

import java.sql.*;

public class SimpleJdbc {
  public static void main(String[] args)
    throws SQLException, ClassNotFoundException {
    // Load the JDBC driver
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    System.out.println("Driver loaded");

    // Establish a connection
    Connection connection = DriverManager.getConnection
      ("jdbc:odbc:LiangBookDB_MDB", "", "" );
    System.out.println("Database connected");

    // Create a statement
    Statement stmt = connection.createStatement();

    // Select the columns from the Student table
    ResultSet rset = stmt.executeQuery
      ("select firstName, mi, lastName from Student");

    // Iterate through the result and print the student names
    while (rset.next())
      System.out.println(rset.getString(1) + " " + rset.getString(2)
        + ". " + rset.getString(3));
  }
}