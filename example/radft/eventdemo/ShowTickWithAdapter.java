package eventdemo;

import java.awt.*;
import messagepaneldemo.*;

public class ShowTickWithAdapter extends javax.swing.JApplet {
  Tick tick1 = new Tick();
  MessagePanel messagePanel1 = new MessagePanel();

  /** Component initialization */
  public void init() {
    this.setSize(new Dimension(400,300));
    tick1.start();
    tick1.addTickListener(new ShowTickWithAdapter_TickAdapter(this));
    this.getContentPane().add(messagePanel1, BorderLayout.CENTER);
  }

  void tick1HandleTick(TickEvent e) {
    messagePanel1.setMessage("Tick count is " + e.getTickCount() +
      " and tick interval is " + e.getTickInterval());
  }
}

/** Adapter class */
class ShowTickWithAdapter_TickAdapter 
  implements eventdemo.TickListener {
  ShowTickWithAdapter adaptee;
    
  ShowTickWithAdapter_TickAdapter(ShowTickWithAdapter adaptee) {
    this.adaptee = adaptee;
  }
    
  public void handleTick(TickEvent e) {
    adaptee.tick1HandleTick(e);
  }
} 