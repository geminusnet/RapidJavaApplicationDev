package guipropertyeditordemo;

import java.awt.*;
import java.net.URL;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class ImageViewer extends Component {
  private Image image = null;
  private String imageFilename = "";
  private boolean stretched = true;
  private int xCoordinate;
  private int yCoordinate;

  public ImageViewer() {
  }

  public ImageViewer(Image image) {
    this.image = image;
    repaint();
  }

  public void setImageFilename(String imageFilename) {
    this.imageFilename = imageFilename;
    Class myClass = getClass();
    try {
      URL url = myClass.getResource(imageFilename);
      image = new ImageIcon(url).getImage();
    }
    catch (Exception ex) {
    }
    repaint();
  }

  public String getImageFilename() {
    return imageFilename;
  }

  public void paint(Graphics g) {
    if (image != null)
      if (isStretched())
        g.drawImage(image, xCoordinate, yCoordinate,
          getSize().width, getSize().height, this);
      else
        g.drawImage(image, xCoordinate, yCoordinate, this);
   }

  public void setStretched(boolean newStretched) {
    stretched = newStretched;
  }

  public void setImage(Image image) {
    this.image = image;
    repaint();
  }

  public Image getImage() {
    return image;
  }

  public boolean isStretched() {
    return stretched;
  }

  public void setXCoordinate(int newXCoordinate) {
    xCoordinate = newXCoordinate;
    repaint();
  }

  public int getXCoordinate() {
    return xCoordinate;
  }

  public void setYCoordinate(int newYCoordinate) {
    yCoordinate = newYCoordinate;
  }

  public int getYCoordinate() {
    return yCoordinate;
  }
}