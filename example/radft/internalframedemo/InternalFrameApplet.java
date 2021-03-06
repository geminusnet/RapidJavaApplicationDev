package internalframedemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import imageviewerdemo.ImageViewer;

public class InternalFrameApplet extends JApplet {
  boolean isStandalone = false;
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenu1 = new JMenu();
  JMenuItem jmiUS = new JMenuItem();
  JMenuItem jmiCanada = new JMenuItem();
  ImageViewer imageViewer = new ImageViewer();

  // Create JDesktopPane to hold the internal frame
  JDesktopPane desktop = new JDesktopPane();
  JInternalFrame internalFrame = new JInternalFrame("US", true,
      true, true, true);

  // Create images
  Image imageUS = ImageViewer.createImage(
    "/image/us.gif", this);
  Image imageCanada = ImageViewer.createImage(
    "/image/ca.gif", this);

  // Create image icons
  ImageIcon imageUSIcon = ImageViewer.createImageIcon(
      "/image/usIcon.gif", this);
  ImageIcon imageCanadaIcon = ImageViewer.createImageIcon(
      "/image/caIcon.gif", this);

  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public InternalFrameApplet() {
  }

  /**Initialize the applet*/
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  /**Component initialization*/
  private void jbInit() throws Exception {
    desktop.add(internalFrame);

    this.setSize(new Dimension(400,300));
    this.getContentPane().add(desktop, BorderLayout.CENTER);

    imageViewer.setImage(imageUS);
    internalFrame.setFrameIcon(imageUSIcon);

    internalFrame.getContentPane().add(imageViewer);
    internalFrame.setLocation(20, 20);
    internalFrame.setSize(100, 100);
    internalFrame.setVisible(true);

    jMenuBar1.add(jMenu1);
    jMenu1.add(jmiUS);
    jMenu1.add(jmiCanada);
    jMenu1.setText("Flags");
    jmiUS.setText("US");
    jmiCanada.setText("Canada");
    this.setJMenuBar(jMenuBar1);

    jmiUS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jmiUS_actionPerformed(e);
      }
    });

    jmiCanada.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jmiCanada_actionPerformed(e);
      }
    });
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
    InternalFrameApplet applet = new InternalFrameApplet();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Internal Frame Demo");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2,
      (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }

  //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }

  void jmiUS_actionPerformed(ActionEvent e) {
    imageViewer.setImage(imageUS);
    internalFrame.setFrameIcon(imageUSIcon);
    internalFrame.setTitle("US");
  }

  void jmiCanada_actionPerformed(ActionEvent e) {
    imageViewer.setImage(imageCanada);
    internalFrame.setFrameIcon(imageCanadaIcon);
    internalFrame.setTitle("Canada");
  }
}