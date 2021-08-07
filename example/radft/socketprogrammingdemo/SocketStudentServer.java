// SocketStudentServer.java
package socketprogrammingdemo;

import java.io.*;
import java.net.*;
import java.util.*;

public class SocketStudentServer {
  private HashMap scores = new HashMap();
  
  /** Constructor */
  public SocketStudentServer() {
    // Initialize scores hashtable
    initializeStudent();
    
    try {
      // Create a server socket
      ServerSocket serverSocket = new ServerSocket(8000);
      
      // Server the clients
      while (true) {
        // Listen for a new connection request
        Socket connectToClient = serverSocket.accept();
        System.out.println(
        "Starting a new server thread for a new client");
        
        // Create a new thread for the connection
        ThreadHandler thread = new ThreadHandler(connectToClient);
        
        // Start the new thread
        thread.start();
      }
    }
    catch(IOException ex) {
      System.err.println(ex);
    }
  }
  
  public static void main(String[] args) {
    // Initialize SocketStudentServer
    new SocketStudentServer();
  }
  
  /** Initialize student information */
  protected void initializeStudent() {
    scores.put("John", new Double(90.5));
    scores.put("Michael", new Double(100));
    scores.put("Michelle", new Double(98.5));
  }
  
  /** Get student score. Return -1 if score is not found */
  public double findScore(String name) {
    Double d = (Double)scores.get(name);
    
    if (d == null) {
      System.out.println("Student " + name + " is not found ");
      return -1;
    }
    else {
      System.out.println("Student " + name + "\'s score is "
      + d.doubleValue());
      return d.doubleValue();
    }
  }
  
  /** The server for handling a client, an inner class */
  class ThreadHandler extends Thread {
    private Socket connectToClient; // A connected socket
    
    public ThreadHandler(Socket socket) {
      connectToClient = socket;
    }
    
    public void run() {
      try {
        // Create data input and print streams
        BufferedReader isFromClient = new BufferedReader(
        new InputStreamReader(connectToClient.getInputStream()));
        PrintWriter osToClient =
        new PrintWriter(connectToClient.getOutputStream(), true);
        
        // Continuously serve the client
        while (true) {
          // Receive student name from the client in string
          String name = isFromClient.readLine();
          System.out.println(
          "Student name received from client is " + name);
          
          // Find score
          double score = findScore(name);
          
          // Send score back to the client
          osToClient.println(score);
        }
      }
      catch(IOException ex) {
        System.err.println(ex);
      }
    }
  } // End of the inner class
}
