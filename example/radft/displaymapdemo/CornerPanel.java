// CornerPanel.java: A panel displaying a line used for scroll
// pane corner
package displaymapdemo;

import javax.swing.*;
import java.awt.*;

public class CornerPanel extends JPanel
  implements ScrollPaneConstants {
  /** Line location */
  private String location;

  /** Construct a corner panel */
  public CornerPanel(String location) {
    this.location = location;
  }

  /** Draw a line depending on the location */
  public void paintComponent(Graphics g) {
    super.paintComponents(g);

    if (location == "UPPER_LEFT_CORNER")
      g.drawLine(0, getSize().height, getSize().width, 0);
    else if (location == "UPPER_RIGHT_CORNER")
      g.drawLine(0, 0, getSize().width, getSize().height);
    else if (location == "LOWER_RIGHT_CORNER")
      g.drawLine(0, getSize().height, getSize().width, 0);
    else if (location == "LOWER_LEFT_CORNER")
      g.drawLine(0, 0, getSize().width, getSize().height);
  }
}