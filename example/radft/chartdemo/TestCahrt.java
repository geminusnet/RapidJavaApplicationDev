package chartdemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class TestCahrt extends JApplet
{
  boolean isStandalone = false;
  PieChart pieChart1 = new PieChart();
  /**Get a parameter value*/
  public String getParameter(String key, String def)
  {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public TestCahrt()
  {
  }
  /**Initialize the applet*/
  public void init()
  {
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  /**Component initialization*/
  private void jbInit() throws Exception
  {
    this.setSize(new Dimension(400,300));
    this.getContentPane().add(pieChart1, BorderLayout.CENTER);
  }
  /**Get Applet information*/
  public String getAppletInfo()
  {
    return "Applet Information";
  }
  /**Get parameter info*/
  public String[][] getParameterInfo()
  {
    return null;
  }
  /**Main method*/
  public static void main(String[] args)
  {
    TestCahrt applet = new TestCahrt();
    applet.isStandalone = true;
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Applet Frame");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }

  //static initializer for setting look & feel
  static
  {
    try
    {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e)
    {
    }
  }
}