package jdbcdemo;

import java.sql.*;

public class AddressPanelUsingStoredProc
  extends AddressPanelUsingDynamicSQL {
  CallableStatement cstmt;

  public AddressPanelUsingStoredProc(Connection connection) {
    super(connection);

    try {
      // Create a callable statement
      cstmt = connection.prepareCall
        ("{ ? = call AddressFound(?, ?)}");
    }
    catch (SQLException ex) {
      setStatus(ex.getMessage());
    }

    setStatus("Using stored SQL procedures");
  }

  public void insert() {
    try {
      if (addressFound() == 1)
        setStatus("Address already exist");
      else
        super.insert();
    }
    catch (SQLException ex) {
      setStatus(ex.getMessage());
    }
  }

  /**Return true if an address matching the given firstname and
   * lastname is already in the database */
  int addressFound() throws SQLException {
    cstmt.setString(2, getFirstName());
    cstmt.setString(3, getLastName());
    cstmt.registerOutParameter(1, Types.INTEGER);
    cstmt.execute();
    return cstmt.getInt(1);
  }
}