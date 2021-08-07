package treedemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.tree.*;
import imageviewerdemo.ImageViewer;

public class Figure8_19 extends JApplet {
  boolean isStandalone = false;
  JScrollPane jScrollPane1 = new JScrollPane();
  JTree jTree1 = new JTree();

  ImageIcon leafImageIcon, openImageIcon, closedImageIcon;

  //Initialize the applet
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception {
    // Create image icons
    leafImageIcon = ImageViewer.createImageIcon(
      "../image/clock16.gif", this);
    openImageIcon = ImageViewer.createImageIcon(
      "../image/open.gif", this);
    closedImageIcon = ImageViewer.createImageIcon(
      "../image/flag16.gif", this);

    this.setSize(new Dimension(400,300));
    this.getContentPane().add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jTree1, null);

    // Customize cell renderer
    DefaultTreeCellRenderer renderer =
      (DefaultTreeCellRenderer)jTree1.getCellRenderer();
    renderer.setLeafIcon(leafImageIcon);
    renderer.setOpenIcon(openImageIcon);
    renderer.setClosedIcon(closedImageIcon);
    renderer.setBackgroundSelectionColor(Color.red);

    // Customize editor
    JComboBox jcboColor = new JComboBox();
    jcboColor.addItem("red");
    jcboColor.addItem("green");
    jcboColor.addItem("blue");
    jcboColor.addItem("yellow");
    jcboColor.addItem("orange");

    jTree1.setCellEditor
      (new DefaultTreeCellEditor(jTree1,
        new DefaultTreeCellRenderer(),
        new DefaultCellEditor(jcboColor)));

    // jTree1.setCellEditor(new DefaultCellEditor(jcboColor));
    jTree1.setEditable(true);
  }

  //Main method
  public static void main(String[] args)
  {
    Figure8_19 applet = new Figure8_19();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    frame.setTitle("Applet Frame");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
}