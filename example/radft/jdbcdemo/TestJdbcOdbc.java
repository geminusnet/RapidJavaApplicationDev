package jdbcdemo;

import java.sql.*;

public class TestJdbcOdbc {
  public static void main(String[] args)
    throws SQLException, ClassNotFoundException {
    // Load the JDBC-ODBC bridge driver
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    System.out.println("Driver sun.jdbc.odbc.JdbcOdbcDriverloaded");

    // Establish connection
    Connection connection = DriverManager.getConnection
      ("jdbc:odbc:LiangBookDB_MDB", "", "");
    System.out.println("Database LiangBookDB_MDB connected");

    // Create a statement
    Statement stmt = connection.createStatement();

    try {
      // Create the Student TABLE
      stmt.executeUpdate(
        "create table Student(firstName varchar(20), "
        + "mi varchar(1), lastName varchar(20))");

      // Insert two records into the Student TABLE
      stmt.executeUpdate(
        "insert into Student values ('John', 'F', 'Smith')");
      stmt.executeUpdate(
        "insert into Student values ('Wade', 'E', 'Bush')");
    }
    catch (SQLException ex) {
      System.out.println("Table Student already exists");
    }

    // Select the column student from the Student table
    ResultSet rset = stmt.executeQuery
      ("select firstName, mi, lastName from Student");

    // Iterate through the result and print the student names
    while (rset.next())
      System.out.println(rset.getString(1) + " " +
        rset.getString(2) + ". " + rset.getString(3));

    // Close the connection
    connection.close();
  }
}
