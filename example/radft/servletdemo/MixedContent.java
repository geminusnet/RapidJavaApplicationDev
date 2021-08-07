package servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import Acme.JPM.Encoders.GifEncoder;

public class MixedContent extends HttpServlet {
  /** Process the HTTP Get request */
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String country = request.getParameter("country");

    out.println("<img src = \"/servlet/servletdemo.ImageContent" +
      "?country=" + country + "\" align=left>");

    // Read description from a file and send it to the browser
    BufferedReader in = new BufferedReader(new FileReader(
      "c:\\radjb\\servletdemo\\" + country + ".txt"));

    // Text line from the text file for flag description
    String line;

    // Read a line from the text file and send it to the browser
    while ((line = in.readLine()) != null) {
      out.println(line);
    }

    out.close();
  }
}