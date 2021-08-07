package exercise13_7;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class Exercise13_7 extends JApplet {
  boolean isStandalone = false;

  // Create tree root
  DefaultMutableTreeNode root = new DefaultMutableTreeNode(
    "No datadabse connected");

  // Create the tree model
  DefaultTreeModel treeModel = new DefaultTreeModel(root);

  JTree jTree1 = new JTree();
  JSplitPane jSplitPane1 = new JSplitPane();
  JLabel jlblStatus = new JLabel();
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenu1 = new JMenu();
  JMenuItem jmiConnect = new JMenuItem();
  JMenuItem jmiExit = new JMenuItem();
  DBConnectDialog dBConnectDialog1 = new DBConnectDialog();
  DBInfoPanel dBInfoPanel1 = new DBInfoPanel();
  TableInfoPanel tableContentPanel1 = new TableInfoPanel();
  JMenuItem jmiDisconnect = new JMenuItem();

  /**Initialize the applet*/
  public void init() {
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**Component initialization*/
  private void jbInit() throws Exception {
    this.setJMenuBar(jMenuBar1);
    this.setSize(new Dimension(400,300));
    dBConnectDialog1.setModal(true);
    jlblStatus.setText("Choose Connection, Connect to a Database");

    jMenu1.setText("Connection");
    jmiConnect.setText("Connect to Database");
    jmiConnect.addActionListener(
      new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jmiConnect_actionPerformed(e);
      }
    });

    jmiExit.setText("Exit");
    jmiExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jmiExit_actionPerformed(e);
      }
    });
    jTree1.setModel(treeModel);
    jTree1.setRootVisible(false);
    jTree1.addTreeSelectionListener(
      new javax.swing.event.TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        jTree1_valueChanged(e);
      }
    });
    jSplitPane1.setRightComponent(null);
    jmiDisconnect.setText("Disconnect the Selected Connection Node");
    jmiDisconnect.addActionListener(
      new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jmiDisconnect_actionPerformed(e);
      }
    });
    this.getContentPane().add(jSplitPane1, BorderLayout.CENTER);
    jSplitPane1.add(jTree1, JSplitPane.LEFT);
    this.getContentPane().add(jlblStatus, BorderLayout.SOUTH);
    jMenuBar1.add(jMenu1);
    jMenu1.add(jmiConnect);
    jMenu1.add(jmiDisconnect);
    jMenu1.addSeparator();
    jMenu1.add(jmiExit);

    treeModel.setRoot(root);
    treeModel.reload();
  }

  void jmiConnect_actionPerformed(ActionEvent e) {
    dBConnectDialog1.setVisible(true);

    try {
      Connection connection = dBConnectDialog1.getConnection();
      if (connection != null) {
        DatabaseMetaData dbMetaData =
          dBConnectDialog1.getConnection().getMetaData();
        jlblStatus.setText("Connected to " + dbMetaData.getURL());
        updateTree(connection);
        jSplitPane1.add(jTree1, JSplitPane.LEFT);
      }
    }
    catch (SQLException ex) {
      jlblStatus.setText(ex.getMessage());
    }
  }

  void jmiExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  private void updateTree(Connection connection)
    throws SQLException {
    DatabaseMetaData dbMetaData = connection.getMetaData();
    DefaultMutableTreeNode db = new DefaultMutableTreeNode();
    db.setUserObject(connection);
    root.add(db);

    ResultSet rsTableTypes =
      connection.getMetaData().getTableTypes();

    while (rsTableTypes.next()) {
      String tableType = rsTableTypes.getString("TABLE_TYPE");

      // Add table names to the tree node under database
      DefaultMutableTreeNode tableTypeNode =
        new DefaultMutableTreeNode(tableType);
      db.add(tableTypeNode);

      ResultSet rsTables = dbMetaData.getTables(null, null, null,
        new String[] {tableType});

      while (rsTables.next()) {
        String tableName = rsTables.getString("TABLE_NAME");
        // Add table names to the tree node under database
        DefaultMutableTreeNode tableNode =
          new DefaultMutableTreeNode(tableName);
        tableTypeNode.add(tableNode);

        ResultSet rsColumns = dbMetaData.getColumns(
          null, null, tableName, null);

        // Add column names to the table
        while (rsColumns.next()) {
          tableNode.add(new DefaultMutableTreeNode
            (rsColumns.getString("COLUMN_NAME")));
        }
      }
      treeModel.reload();
    }
  }

  /**Get Applet information*/
  public String getAppletInfo() {
    return "Applet Information";
  }

  /**Get parameter info*/
  public String[][] getParameterInfo() {
    return null;
  }

  /**Main method*/
  public static void main(String[] args) {
    Exercise13_7 applet = new Exercise13_7();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Exercise13_7");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(600,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }

  //static initializer for setting look & feel
  static {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }

  void jTree1_valueChanged(TreeSelectionEvent e) {
    TreePath path = jTree1.getSelectionPath();
    if (path == null) return;

    String tableName = null;
    Connection connection;

    switch (path.getPathCount()) {
      case 2:
        connection = (Connection)(((DefaultMutableTreeNode)
          (path.getPathComponent(1))).getUserObject());
        dBInfoPanel1.setConnection(connection);
        jSplitPane1.setDividerLocation(0.3);
        jSplitPane1.add(dBInfoPanel1, JSplitPane.RIGHT);
        break;
      case 4:
        connection = (Connection)(((DefaultMutableTreeNode)
          (path.getPathComponent(1))).getUserObject());
        tableName = (String)(((DefaultMutableTreeNode)
          (path.getPathComponent(3))).getUserObject());
        tableContentPanel1.setConnectionAndTable(
          connection, tableName);
        jSplitPane1.setDividerLocation(0.3);
        jSplitPane1.add(tableContentPanel1, JSplitPane.RIGHT);
        break;
      default:
        jSplitPane1.remove(dBInfoPanel1);
        jSplitPane1.remove(tableContentPanel1);
    }
  }

  void jmiDisconnect_actionPerformed(ActionEvent e) {
    TreePath path = jTree1.getSelectionPath();
    if (path == null) return;

    if (path.getPathCount() != 2) {
      JOptionPane.showMessageDialog(this, "Cannot remove this node");
    }
    else {
      // Get the node in the path
      DefaultMutableTreeNode treeNode =
        (DefaultMutableTreeNode)(path.getPathComponent(1));
      treeModel.removeNodeFromParent(treeNode);
    }
  }
}