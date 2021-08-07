package servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import Acme.JPM.Encoders.GifEncoder;
import clockdemo.Clock;

public class ImageContentFromComponent extends HttpServlet {
  /** Initialize global variables */
  private final static int width = 300;
  private final static int height = 300;

  // Create image
  private Image image = new BufferedImage(width, height,
    BufferedImage.TYPE_INT_ARGB);

  // Get Graphics context of the image
  private Graphics g = image.getGraphics();

  // Create clock
  private Clock clock = new Clock();

  // Create a frame to provide graphics environment for rendering
  // the clock
  private JFrame frame = new JFrame();

  /** Initialize global variables */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    frame.setSize(width, height); // Set the frame size
    frame.getContentPane().add(clock); // Add clock to the frame
  }

  /** Process the HTTP Get request */
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("image/gif");
    OutputStream out = response.getOutputStream();

    frame.setVisible(true);
    g.setColor(Color.white);
    g.fillRect(0, 0, width, height);
    clock.paint(g);
    frame.setVisible(false);

    // Encode the image and send to the output stream
    new GifEncoder(image, out, true).encode();

    out.close(); // Close stream
  }
}