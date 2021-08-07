package internalframedemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestInternalFrame_Frame extends JFrame
{
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenu1 = new JMenu();
  JMenuItem jMenuItem1 = new JMenuItem();
  JMenuItem jMenuItem2 = new JMenuItem();
  JMenuItem jMenuItem3 = new JMenuItem();
  JMenuItem jMenuItem4 = new JMenuItem();
  JMenuItem jMenuItem5 = new JMenuItem();

  /**Construct the frame*/
  public TestInternalFrame_Frame()
  {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
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
    //setIconImage(Toolkit.getDefaultToolkit().createImage(TestInternalFrame_Frame.class.getResource("[Your Icon]")));

    jMenuBar1.add(jMenu1);
    jMenu1.add(jMenuItem1);
    jMenu1.add(jMenuItem2);
    jMenu1.add(jMenuItem3);
    jMenu1.add(jMenuItem4);
    jMenu1.add(jMenuItem5);
    this.setJMenuBar(jMenuBar1);

    JDesktopPane desktop = new JDesktopPane();

//    this.setContentPane(desktop);

    this.getContentPane().add(desktop);
    this.getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);

    JInternalFrame internalFrame = new JInternalFrame("US", true,
      true, true,true);
    internalFrame.setSize(100, 100);
    internalFrame.setVisible(true);
    jMenu1.setText("Map");
    jMenuItem1.setText("US");
    jMenuItem2.setText("Canada");
    jMenuItem3.setText("UK");
    jMenuItem4.setText("India");
    jMenuItem5.setText("Norway");
    desktop.add(internalFrame);

    this.setSize(new Dimension(400, 300));
    this.setTitle("Frame Title");
  }

  /**Overridden so we can exit when window is closed*/
  protected void processWindowEvent(WindowEvent e)
  {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING)
    {
      System.exit(0);
    }
  }
}