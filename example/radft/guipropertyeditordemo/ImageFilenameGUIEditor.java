package guipropertyeditordemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ImageFilenameGUIEditor extends JPanel
  implements MouseListener {
  private ImageViewer selectedImageViewer = new ImageViewer();
  String imageFilename = "/image/us.gif";

  public ImageFilenameGUIEditor() {
    this("/image/us.gif");
  }

  public ImageFilenameGUIEditor(String imageFilename) {
    // Create panel p for holding images for selection
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2, 4, 5, 5));
    p.setBorder(new TitledBorder("Choose an Image"));

    // Place images in the panel p
    ImageViewer[] imageViewers = new ImageViewer[8];
    for (int i=0; i<8; i++) {
      imageViewers[i] = new ImageViewer();
      imageViewers[i].addMouseListener(this);
      p.add(imageViewers[i]);
    }

    imageViewers[0].setImageFilename("/image/us.gif");
    imageViewers[1].setImageFilename("/image/uk.gif");
    imageViewers[2].setImageFilename("/image/ca.gif");
    imageViewers[3].setImageFilename("/image/india.gif");
    imageViewers[4].setImageFilename("/image/china.gif");
    imageViewers[5].setImageFilename("/image/germany.gif");
    imageViewers[6].setImageFilename("/image/denmark.gif");
    imageViewers[7].setImageFilename("/image/norway.gif");

    // Panel p1 for organizing the selected image
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());

    // Create a label
    JLabel jlbl;
    p1.add(jlbl = new JLabel("Image Selected:"), BorderLayout.WEST);
    jlbl.setFont(new Font("TimesRoman", Font.BOLD, 24));

    // Create selectedImageViewer
    selectedImageViewer.setBackground(Color.yellow);
    selectedImageViewer.setImageFilename(imageFilename);
    p1.add(selectedImageViewer, BorderLayout.CENTER);

    // Place p and p1 in the main panel
    this.setLayout(new BorderLayout());
    this.add(p1, BorderLayout.NORTH);
    this.add(p, BorderLayout.CENTER);
    
    repaint();
  }

  /** Override this method from JPanel */
  public Dimension getPreferredSize() {
    return new Dimension(350, 150);
  }

  public void mouseClicked(MouseEvent e) {
    ImageViewer imageViewer = (ImageViewer)e.getComponent();
    imageFilename = imageViewer.getImageFilename();
    selectedImageViewer.setImageFilename(imageFilename);
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }
}