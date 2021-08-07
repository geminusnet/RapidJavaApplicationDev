package exercise5_6;

// Exercise5_6.java: Display HTML file in JEditorPane
// This program can display a local or a remote resource
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.net.URL;
import javax.swing.event.*;
import java.io.*;

public class Exercise5_6 extends JApplet
  implements ActionListener, HyperlinkListener {
  // JEditor pane to view HTML files
  JEditorPane jep = new JEditorPane();

  // Label for URL
  JLabel jlblURL = new JLabel("URL");

  // Text field for entering URL
  JTextField jtfURL = new JTextField();

  // Initialize the applet
  public void init() {
    // Create a panel jpURL to hold the label and text field
    JPanel jpURL = new JPanel();
    jpURL.setLayout(new BorderLayout());
    jpURL.add(jlblURL, BorderLayout.WEST);
    jpURL.add(jtfURL, BorderLayout.CENTER);

    // Create a scroll pane to hold JEditorPane
    JScrollPane jspViewer = new JScrollPane();
    jspViewer.getViewport().add(jep, null);

    // Place jpURL and jspViewer in the applet
    this.getContentPane().add(jspViewer, BorderLayout.CENTER);
    this.getContentPane().add(jpURL, BorderLayout.NORTH);

    // Set jep noneditable
    jep.setEditable(false);

    // Register listener
    jep.addHyperlinkListener(this);
    jtfURL.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    // TODO: Implement this java.awt.event.ActionListener method

    String urlString = jtfURL.getText().trim();
    if (isSubstring("www", urlString)) {
      urlString = "http://" + urlString;
    }

    URL url;
    try {
      if (isSubstring("http", urlString)) {
        // Get the URL from remote Web server
        url = new URL(urlString);
      }
      else {
        // Get the URL from local host
        url = this.getClass().getResource(urlString);
      }

      System.out.println("urlString " + urlString);

      // Display the HTML file
      jep.setPage(url);
    }
    catch (IOException ex) {
      System.out.println(ex);
    }
  }

  public void hyperlinkUpdate(HyperlinkEvent e) {
    // TODO: Implement HyperlinkListener method
    try {
      jep.setPage(e.getURL());
    }
    catch (IOException ex) {
      System.out.println(ex);
    }
  }

  /**Main method*/
  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Exercise5_6");

    // Create an instance of the applet
    Exercise5_6 applet = new Exercise5_6();

    // Add the applet instance to the frame
    frame.getContentPane().add(applet, BorderLayout.CENTER);

    // Invoke init() and start()
    applet.init();
    applet.start();

    // Display the frame
    frame.setSize(600, 600);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  // Check if the first string is a substring of the second string
  public static boolean isSubstring(String first, String second) {
    int remainingLength = second.length();
    int startingIndex = 0;

    // Note toWhile is a label. You can use break with a label
    // attached.
    toWhile: while (first.length() <= remainingLength) {
      // What is wrong if the following line is used
      // for (int i=startingIndex; i<=first.length(); i++)
      for (int i=0; i<first.length(); i++) {
        if (first.charAt(i) != second.charAt(startingIndex+i)) {
          startingIndex++;
          remainingLength--;
          continue toWhile;
        }
      }

      return true;
    }

    return false;
  }
}