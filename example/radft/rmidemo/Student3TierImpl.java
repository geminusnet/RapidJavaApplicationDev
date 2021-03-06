package rmidemo;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.MalformedURLException;
import java.sql.*;

public class Student3TierImpl extends UnicastRemoteObject 
  implements Student {
  // Use prepared statement for querying DB
  private PreparedStatement pstmt;

  /** Constructs Student3TierImpl object and exports it on default port.
   */
  public Student3TierImpl() throws RemoteException {
    super();
    
    initializeDB();
  }
  
  /** Constructs Student3TierImpl object and exports it on 
   * specified port.
   * @param port The port for exporting
   */
  public Student3TierImpl(int port) throws RemoteException {
    super(port);
    
    initializeDB();
  }
  
  /** Register Student3TierImpl object with the RMI registry.
   * @param name - name identifying the service in the RMI registry
   * @param create - create local registry if necessary
   * @throw RemoteException if cannot be exported or bound to 
   *   RMI registry
   * @throw MalformedURLException if name cannot be used to construct 
   *   a valid URL
   * @throw IllegalArgumentException if null passed as name
   */
  public static void registerToRegistry(String name, Remote obj, 
    boolean create) throws RemoteException, MalformedURLException{
    
    if (name == null) throw new IllegalArgumentException(
      "registration name can not be null");
    
    try {
      Naming.rebind(name, obj);
    } catch (RemoteException ex){
      if (create) {
        Registry r = LocateRegistry.createRegistry(
          Registry.REGISTRY_PORT);
        r.rebind(name, obj);
      } else throw ex;
    }
  }
  
  /** Main method.
   */
  public static void main(String[] args) {
    System.setSecurityManager(new RMISecurityManager());
    
    try {
      Student3TierImpl obj = new Student3TierImpl();
      // Register the server with the name StudentImpl,
      // which is the same as in Example 15.1 so it can be used
      // by Example 15.1.
      registerToRegistry("StudentImpl", obj, true);
      System.out.println("Server " + obj + " registered");
    } catch (RemoteException ex) {
      ex.printStackTrace();
    } catch (MalformedURLException ex) {
      ex.printStackTrace();
    }
  }
  
  /** Load JDBC driver, establish connection and create statement */
  protected void initializeDB() {
    try {
      // Load the JDBC driver
      // Class.forName("oracle.jdbc.driver.OracleDriver");
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      System.out.println("Driver registered");
      
      // Establish connection
      /*Connection conn = DriverManager.getConnection
        ("jdbc:oracle:thin:@drake.armstrong.edu:1521:test",
          "scott", "tiger");  */
      Connection conn = DriverManager.getConnection
        ("jdbc:odbc:LiangBookDB_MDB", "", "" );
      System.out.println("Database connected");
      
      // Create the Scores table and initialize it if necessary
      initializeTable(conn);
      
      // Create a prepared statement for querying DB
      pstmt = conn.prepareStatement(
        "select * from Scores where name = ?");
    }
    catch (Exception ex) {
      System.out.println(ex);
    }
  }
  
  /** Create the Scores table and initialize it if necessary */
  private void initializeTable(Connection conn) {
    try {
      // Create a statement
      Statement stmt = conn.createStatement();
      
      // stmt.executeUpdate("DROP TABLE Scores");
      
      // Create the table,
      // if already exists, an exception would be raised
      stmt.executeUpdate(
        "create table Scores" +
        "(name varchar(20), score number, permission number)");
      
      // Insert three records into the Scores TABLE
      stmt.executeUpdate(
        "insert into Scores values ('John', 90.5, 1)");
      stmt.executeUpdate(
        "insert into Scores values ('Michael', 100, 1)");
      stmt.executeUpdate(
        "insert into Scores values ('Michelle', 100, 0)");
    }
    catch (SQLException ex) {
      System.out.println(ex);
    }
  }
  
  /** Return the score for specified the name
   * Return -1 if score is not found.
   */
  public double findScore(String name) throws RemoteException {
    double score = -1;
    try {
      // Set the specified name in the prepared statement
      pstmt.setString(1, name);
      
      // Execute the prepared statement
      ResultSet rs = pstmt.executeQuery();
      
      // Retrieve the score
      if (rs.next()) {
        if (rs.getBoolean(3))
          score = rs.getDouble(2);
      }
    }
    catch (SQLException ex) {
      System.out.println(ex);
    }
    
    System.out.println(name + "\'s score is " + score);
    return score;
  } 
}