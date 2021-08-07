package eventdemo;

import javax.swing.*;
import messagepaneldemo.MessagePanel;
import java.awt.*;

public class ShowTick extends JFrame implements TickListener {
  private Tick tick1 = new Tick();
  private MessagePanel messagePanel = new MessagePanel();

  /**Default constructor*/
  public ShowTick() {
    tick1.start();

    // Place the message canvas to the frame
    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(messagePanel);
    setTitle("ShowTick");

    // Register listener
    tick1.addTickListener(this);
  }

  /** Main method */
  public static void main(String[] args) {
    ShowTick showTick = new ShowTick();
    showTick.setSize(100, 100);
    showTick.setVisible(true);
  }

  public void handleTick(TickEvent e) {
    //TODO: implement this eventdemo.TickListener method;
    messagePanel.setMessage("Tick count is " + e.getTickCount() +
      " and tick interval is " + e.getTickInterval());
  }
}