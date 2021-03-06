package imageviewerdemo;

import java.awt.*;
import java.net.URL;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class ImageViewer extends Component {
  /** Holds value of property image. */
  private java.awt.Image image;
  
  /** Holds value of property imageFilename. */
  private String imageFilename = " ";
  
  /** Holds value of property stretched. */
  private boolean stretched =true;
  
  /** Holds value of property xCoordinate. */
  private int xCoordinate;
  
  /** Holds value of property yCoordinate. */
  private int yCoordinate;
  
  public ImageViewer() {
  }

  public ImageViewer(Image image) {
    this.image = image;
    repaint();
  }

  /**Create an image icon from an image file through the resource
   * of the object.
   */
  public static ImageIcon createImageIcon(String imageFilename,
    Object object) {
    try {
      URL url = object.getClass().getResource(imageFilename);
      return new ImageIcon(url);
    }
    catch (Exception ex) {
    }     
      
    return null;
  }

  /**Create an image from an image file through the resource
   * of the object.
   */
  public static Image createImage(String imageFilename,
    Object object) {
    ImageIcon imageIcon = createImageIcon(imageFilename, object);
    if (imageIcon != null)
      return imageIcon.getImage();
    else
      return null;
  }

  public void paint(Graphics g) {
    if (image != null)
      if (isStretched())
        g.drawImage(image, xCoordinate, yCoordinate,
          getSize().width, getSize().height, this);
      else
        g.drawImage(image, xCoordinate, yCoordinate, this);
  }

  /** Getter for property image.
   * @return Value of property image.
   */
  public java.awt.Image getImage() {
    return image;
  }
  
  /** Setter for property image.
   * @param image New value of property image.
   */
  public void setImage(java.awt.Image image) {
    this.image = image;
    repaint();
  }
  
  /** Getter for property imageFilename.
   * @return Value of property imageFilename.
   */
  public String getImageFilename() {
    return imageFilename;
  }
  
  /** Setter for property imageFilename.
   * @param imageFilename New value of property imageFilename.
   */
  public void setImageFilename(String imageFilename) {
    this.imageFilename = imageFilename;
    image = createImage(imageFilename, this);
    repaint();
  }
  
  /** Getter for property stretched.
   * @return Value of property stretched.
   */
  public boolean isStretched() {
    return stretched;
  }
  
  /** Setter for property stretched.
   * @param stretched New value of property stretched.
   */
  public void setStretched(boolean stretched) {
    this.stretched = stretched;
    repaint();
  }
  
  /** Getter for property xCoordinate.
   * @return Value of property xCoordinate.
   */
  public int getXCoordinate() {
    return xCoordinate;
  }
  
  /** Setter for property xCoordinate.
   * @param xCoordinate New value of property xCoordinate.
   */
  public void setXCoordinate(int xCoordinate) {
    this.xCoordinate = xCoordinate;
    repaint();
  }
  
  /** Getter for property yCoordinate.
   * @return Value of property yCoordinate.
   */
  public int getYCoordinate() {
    return yCoordinate;
  }
  
  /** Setter for property yCoordinate.
   * @param yCoordinate New value of property yCoordinate.
   */
  public void setYCoordinate(int yCoordinate) {
    this.yCoordinate = yCoordinate;
    repaint();
  }
}