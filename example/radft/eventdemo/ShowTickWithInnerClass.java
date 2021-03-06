package eventdemo;

import java.awt.*;
import messagepaneldemo.*;

public class ShowTickWithInnerClass extends javax.swing.JApplet {
  Tick tick1 = new Tick();
  MessagePanel messagePanel1 = new MessagePanel();

  /** Component initialization */
  public void init() {
    this.setSize(new Dimension(400,300));
    tick1.start();
    tick1.addTickListener(new ShowTickWithAdapter_TickAdapter());
    this.getContentPane().add(messagePanel1, BorderLayout.CENTER);
  }

  void tick1HandleTick(TickEvent e) {
    messagePanel1.setMessage("Tick count is " + e.getTickCount() +
      " and tick interval is " + e.getTickInterval());
  }

  /** Inner class */
  class ShowTickWithAdapter_TickAdapter 
    implements eventdemo.TickListener {
    public void handleTick(TickEvent e) {
      tick1HandleTick(e);
    }
  }
} 