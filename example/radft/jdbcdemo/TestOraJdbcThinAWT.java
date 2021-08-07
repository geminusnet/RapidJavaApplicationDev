package jdbcdemo;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class TestOraJdbcThinAWT extends java.applet.Applet
  implements ActionListener
{ //The driver to load
  static final String driver_class = "oracle.jdbc.driver.OracleDriver";

  //The connect string
  static final String connect_string =
    "jdbc:oracle:thin:scott/tiger@cs1.ipfw.edu:1521:test";

  //The quqry to get system time
  static final String query = "SELECT sysdate FROM Dual";

  //The button to push for getting the system time
  private Button getTimeBT;
  //The text field to show the time
  private TextField timeTF;
  //The text area to trace connection and query
  private TextArea log;

  //The connection to the database
  private Connection conn;

  //Create the user interface
  public void init()
  { Panel p = new Panel();
    p.setLayout(new FlowLayout());
    p.add(new Label("Server Time"));
    p.add(timeTF = new TextField(30));
    timeTF.setEditable(false);
    p.add(getTimeBT = new Button("Get Server Time"));

    this.setLayout(new BorderLayout());
    this.add("North", p);
    this.add("Center", log = new TextArea(10, 60));

    //register listener
    getTimeBT.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { if (e.getSource() instanceof Button)
    { try
      {	//Clear the log text area
	      log.setText(null);

	      //See if we need to open the connection to the database
	      if (conn == null)
	      { //Load the JDBC driver
          Class.forName(driver_class);
	        log.append("JDBC driver " + driver_class + " loaded\n");

          // Connect to the databse
          conn = DriverManager.getConnection(connect_string);
	        log.append("Connected to " + connect_string + "\n");
	      }

	      //Create a statement
	      Statement stmt = conn.createStatement ();

	      //Execute the query
        log.append("Executing query " + query + "\n");
	      ResultSet rset = stmt.executeQuery (query);

	      //Display the time
	      while (rset.next())
          timeTF.setText(rset.getString(1));
      }
      catch (Exception ex)
      { log.append (ex.getMessage () + "\n");
      }
    }
  }
}
