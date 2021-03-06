package jdbcdemo;

import java.sql.*;

public class AddressPanelUsingDynamicSQL extends AddressPanel {
  PreparedStatement pstmt1;
  PreparedStatement pstmt2;

  public AddressPanelUsingDynamicSQL(Connection connection) {
    super(connection);

    // Create prepared SQL statements
    try {
      pstmt1 = connection.prepareStatement("select * from Address " + 
        "where firstName = ? AND lastName = ?");
      pstmt2 = connection.prepareStatement("insert into Address " + 
        "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
    }
    catch (SQLException ex) {
      setStatus(ex.getMessage());
    }

    setStatus("Using dynamic SQL statements");
  }

  /** Override this method from AddressPanel */
  protected void select() {
    try {
      pstmt1.setString(1, getFirstName());
      pstmt1.setString(2, getLastName());
      ResultSet rs = pstmt1.executeQuery();

      if (rs.next()) {
        setMi(rs.getString(2));
        setStreet(rs.getString(4));
        setCity(rs.getString(5));
        setState(rs.getString(6));
        setZip(rs.getString(7));
        setTelephone(rs.getString(8));
        setEmail(rs.getString(9));
        setStatus("Dynamic SQL selection succeeded");
      }
      else {
        setStatus("no record found");
      }
    }
    catch (SQLException ex) {
      setStatus(ex.getMessage());
    }
  }

  /** Override this method from AddressPanel */
  protected void insert() {
    try {
      pstmt2.setString(1, getFirstName());
      pstmt2.setString(2, getMi());
      pstmt2.setString(3, getLastName());
      pstmt2.setString(4, getStreet());
      pstmt2.setString(5, getCity());
      pstmt2.setString(6, getState());
      pstmt2.setString(7, getZip());
      pstmt2.setString(8, getTelephone());
      pstmt2.setString(9, getZip());

      pstmt2.executeUpdate();

      setStatus("Dynamic SQL Insertion succeeded");
    }
    catch (SQLException ex) {
      setStatus(ex.getMessage());
    }
  }
}