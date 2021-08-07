package servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import Acme.JPM.Encoders.GifEncoder;

public class ImageContent extends HttpServlet {
  /** Process the HTTP Get request */
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("image/gif");
    OutputStream out = response.getOutputStream();

    // Obtain an image icon
    ImageIcon imageIcon = new ImageIcon("c:\\radjb\\image\\" +
      request.getParameter("country") + ".gif");

    // Obtain image from image icon
    Image image = imageIcon.getImage(); // Get the image

    // Encode the image and send to the output stream
    new GifEncoder(image, out, true).encode();

    out.close(); // Close stream
  }
}