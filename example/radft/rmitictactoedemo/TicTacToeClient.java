// TicTacToeClient.java: TicTacToeClient applet
package rmitictactoedemo;

import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

public class TicTacToeClient extends JApplet {
  // marker is used to indicate the token type
  char marker;

  // myTurn indicates whether the player can move now
  private boolean myTurn = false;

  // Each cell can be empty or marked as 'O' or 'X'
  private Cell[][] cell;

  // ticTacToe is the game server for coordinating with the players
  TicTacToe ticTacToe;

  // Border for cells and panel
  Border lineBorder = BorderFactory.createLineBorder(Color.yellow, 1);

  boolean isStandalone = false;

  /** Initialize the applet */
  public void init() {
    initComponents();

    // Create cells and place cells in the panel
    cell = new Cell[3][3];
    for (int i=0; i<3; i++)
      for (int j=0; j<3; j++)
        jPanel1.add(cell[i][j] = new Cell(i, j));

    // Initialize the CORBA environment
    try {
      initializeRMI();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /** Component and RMI initialization */
  private void initComponents() {
    // Create user interface
    this.setSize(400,300);
    jPanel1.setLayout(gridLayout1);
    gridLayout1.setRows(3);
    gridLayout1.setHgap(1);
    gridLayout1.setColumns(3);
    jlblIdentification.setText("jLabel1");
    this.getContentPane().add(jlblStatus, BorderLayout.SOUTH);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    this.getContentPane().add(jlblIdentification, BorderLayout.NORTH);
    jPanel1.setBorder(lineBorder);
  }

  /** Initialize RMI */
  protected boolean initializeRMI() throws Exception {
    String url;

    if (isStandalone) {
      // Initialize RMI for a standalone application
      // System.setSecurityManager(new RMISecurityManager());
      url = "rmi:///";
      // Use rmi://hostname/ if the server is located on hostname,
      // i.e. rmi://liangy.liangy.edu/
    }
    else {
      // Initialize RMI for an applet
      url = getCodeBase().getHost();
      if (url.equals("default")) url = "";
      url = "rmi://" + url + "/";
    }

    ticTacToe = (TicTacToe)Naming.lookup(url + "TicTacToeImpl");
    System.out.println("Server found");

    // Create callback for use by the server to control the client
    CallBackImpl callBackControl = new CallBackImpl(this);

    if (
      (marker = ticTacToe.connect((CallBack)callBackControl)) != ' ')
    {
      System.out.println("connected as " + marker + " player.");
      jlblIdentification.setText("You are player " + marker);
      return true;
    }
    else {
      System.out.println("already two players connected as ");
      return false;
    }
  }

  /** Set variable myTurn to true or false */
  void setMyTurn(boolean myTurn) {
    this.myTurn = myTurn;
  }

  /** Set message on the status label */
  public void setMessage(String message) {
    jlblStatus.setText(message);
  }

  /** Mark the specified cell using the token */
  void mark(int row, int column, char token) {
    cell[row][column].setToken(token);
  }

  /** Inner class Cell for modeling a cell on the TicTacToe board */
  public class Cell extends JPanel implements MouseListener {
    // marked indicates whether the cell has been used
    private boolean marked = false;

    // row and column indicate where the cell appears on the board
    int row, column;

    // The token for the cell
    private char token;

    /** Construct a cell */
    public Cell(int row, int column) {
      this.row = row;
      this.column = column;
      addMouseListener(this);
      setBorder(lineBorder);
    }

    /** Set token on a cell (mark a cell) */
    public void setToken(char c) {
      token = c;
      marked = true;
      repaint();
    }

    /** Paint the cell to draw a shape for the token */
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // Draw the border
      g.drawRect(0, 0, getSize().width, getSize().height);

      if (token == 'X') {
        g.drawLine(10, 10, getSize().width-10, getSize().height-10);
        g.drawLine(getSize().width-10, 10, 10, getSize().height-10);
      }
      else if (token == 'O') {
        g.drawOval(10, 10, getSize().width-20, getSize().height-20);
      }
    }

    public void mouseClicked(MouseEvent e) {
      // TODO: implement this java.awt.event.MouseListener method;
      if (myTurn && !marked) {
        // Mark the cell
        setToken(marker);

        // Notify the server of the move
        try {
          ticTacToe.myMove(row, column, marker);
        }
        catch (RemoteException ex) {
          System.out.println(ex);
        }
      }
    }

    public void mousePressed(MouseEvent e) {
      // TODO: implement this java.awt.event.MouseListener method;
    }

    public void mouseReleased(MouseEvent e) {
      // TODO: implement this java.awt.event.MouseListener method;
    }

    public void mouseEntered(MouseEvent e) {
      // TODO: implement this java.awt.event.MouseListener method;
    }

    public void mouseExited(MouseEvent e) {
      // TODO: implement this java.awt.event.MouseListener method;
    }
  }

  /** Main method */
  public static void main(String[] args) {
    // Omitted for brevity
  }
  
  private JLabel jlblStatus = new JLabel();
  private JPanel jPanel1 = new JPanel();
  private GridLayout gridLayout1 = new GridLayout();
  private JLabel jlblIdentification = new JLabel();
}