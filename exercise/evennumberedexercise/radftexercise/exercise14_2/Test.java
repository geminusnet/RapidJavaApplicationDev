/*
 * Test.java
 *
 * Created on June 21, 2002, 8:09 PM
 */

package exercise14_2;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Test extends HttpServlet {
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
    out.println("<head><title>Exercise16_2</title></head>");
    out.println("<body>");

    String course = request.getParameter("course");
    String ssn = request.getParameter("ssn");

    System.out.println("Servlet path " + request.getServletPath());

    BufferedReader in = null;

    boolean found = false;
    try {
      in = new BufferedReader(new FileReader(
        "c:\\radftexercise\\exercise14_2\\" + course + ".txt"));

      String line;
      while ( (line = in.readLine()) != null) {
        StringTokenizer st = new StringTokenizer(line, "#\n\r\t");

        String name = st.nextToken();
        String ssnFromFile = st.nextToken();
        String score = st.nextToken();

        System.out.println(name + " " + ssnFromFile + " " + score);
        if (ssn.equals(ssnFromFile)) {
          out.print(name + " " + score);
          found = true;
          break;
        }
      }

      if (!found) {
        out.print(ssn + " not found in " + course);
      }
      out.println("</body></html>");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
    finally {
      try {
        if (in != null) in.close();
        if (out != null) out.close();
      }
      catch (Exception ex) { }
    }
  }
  /**Clean up resources*/
  public void destroy()
  {
  }
}