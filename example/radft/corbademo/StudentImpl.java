// StudentImpl.java: The Student Server Implementation
package corbademo;

import java.util.*;

public class StudentImpl extends _StudentImplBase {
  private Dictionary scores = new Hashtable();
  
  // Constructors
  StudentImpl() {   
    // Initialize student information
    initializeStudent();
  }
  
  // Initialize student information
  protected void initializeStudent() {
    scores.put("John", new Double(90.5));
    scores.put("Michael", new Double(100));
    scores.put("Michelle", new Double(98.5));
  }
  
  // Get student score. Return -1 if score is not found.
  public double findScore(String name) {
    Double d = (Double)scores.get(name);
    
    if (d == null) {
      System.out.println("Student "+name+" is not found ");
      return -1;
    }
    else {
      System.out.println("Student " + name + "\'s score is "
      + d.doubleValue());
      return d.doubleValue();
    }
  }
}