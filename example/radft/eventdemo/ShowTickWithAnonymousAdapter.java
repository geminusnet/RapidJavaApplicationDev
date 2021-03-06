package eventdemo;

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import messagepaneldemo.*;

public class ShowTickWithAnonymousAdapter extends JApplet {
  MessagePanel messagePanel1 = new MessagePanel();
  Tick tick1 = new Tick();

  /** Component initialization */
  public void init() {
    this.setSize(new Dimension(400,300));
    tick1.start();

    // Anonymous inner class adapter
    tick1.addTickListener(new eventdemo.TickListener() {
      public void handleTick(TickEvent e) {
        tick1HandleTick(e);
      }
    });
    this.getContentPane().add(messagePanel1, BorderLayout.CENTER);
  }

  void tick1HandleTick(TickEvent e) {
    messagePanel1.setMessage("Tick count is " + e.getTickCount() +
      " and tick interval is " + e.getTickInterval());
  }
}