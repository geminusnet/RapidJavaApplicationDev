package exercise14_4;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Exercise14_4 extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";
  /**Initialize global variables*/
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
  }
  /**Process the HTTP Get request*/
  public void doGet(HttpServletRequest request, HttpServletResponse
    response) throws ServletException, IOException {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Exercise14_4</title></head>");
    out.println("<body>");

    Cookie cookieColor = new Cookie("color", "red");
    cookieColor.setMaxAge(2*24*60*60);
    response.addCookie(cookieColor);
    Cookie cookieRadius = new Cookie("radius", "5.5");
    cookieRadius.setMaxAge(2*24*60*60);
    response.addCookie(cookieRadius);
    Cookie cookieCount = new Cookie("count", "2");
    cookieRadius.setMaxAge(0);
    response.addCookie(cookieCount);

    out.println("<p>The cookies have been added to your browser.</p>");
    out.println("</body></html>");
  }
  /**Clean up resources*/
  public void destroy() {
  }
}