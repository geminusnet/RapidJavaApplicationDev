
//Title:        Your Product Name
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Y. Daniel Liang
//Company:      IPFW
//Description:  Your description

package exercise2_4;

import java.awt.*;
import javax.swing.JPanel;
import java.net.*;

public class ImageControl extends JPanel {
  private Image currentImage = null;
  private String imageFilename = "";
  private boolean strectched;

  public void setImageFilename(String imageFilename) {
    this.imageFilename = imageFilename;
    Class myClass = getClass();
    try  {
      URL url = myClass.getResource(imageFilename);

      // Obtain a Toolkit instance
      Toolkit toolkit = Toolkit.getDefaultToolkit();

      // Return the image
      currentImage = toolkit.getImage(url);
    }
    catch (Exception ex) { }
    repaint();
  }

  public String getImageFilename() {
    return imageFilename;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (currentImage != null)
      if (isStrectched())
        g.drawImage(currentImage, 0, 0,
          getSize().width, getSize().height, this);
      else
        g.drawImage(currentImage, 0, 0, this);
   }

  public void setStrectched(boolean newStrectched) {
    strectched = newStrectched;
  }

  public boolean isStrectched() {
    return strectched;
  }
}