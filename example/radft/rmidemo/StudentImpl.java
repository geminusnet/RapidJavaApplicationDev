package rmidemo;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.MalformedURLException;
import java.util.*;

public class StudentImpl extends UnicastRemoteObject implements Student {
  // Stores scores in a map indexed by name
  private HashMap scores = new HashMap();
  
  /** Constructor */
  public StudentImpl() throws RemoteException {
    initializeStudent();
  }
  
  /** Initialize student information */
  protected void initializeStudent() {
    scores.put("John", new Double(90.5));
    scores.put("Michael", new Double(100));
    scores.put("Michelle", new Double(98.5));
  }
  
  /** Implement the findScore method from the Student interface */
  public double findScore(String name) throws RemoteException {
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
  
  /** Register StudentImpl object with the RMI registry.
   * @param name - name identifying the service in the RMI registry
   * @param create - create local registry if necessary
   * @throw RemoteException if cannot be exported or bound to RMI registry
   * @throw MalformedURLException if name cannot be used to construct a valid URL
   * @throw IllegalArgumentException if null passed as name
   */
  public static void registerToRegistry(String name, Remote obj, boolean create) throws RemoteException, MalformedURLException{
    
    if (name == null) throw new IllegalArgumentException("registration name can not be null");
    
    try {
      Naming.rebind(name, obj);
    } catch (RemoteException ex){
      if (create) {
        Registry r = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        r.rebind(name, obj);
      } else throw ex;
    }
  }
  
  /** Main method.
   */
  public static void main(String[] args) {
    System.setSecurityManager(new RMISecurityManager());
    
    try {
      StudentImpl obj = new StudentImpl();
      registerToRegistry("StudentImpl", obj, true);
      System.out.println("Student server " + obj + " registered");
    } catch (RemoteException ex) {
      ex.printStackTrace();
    } catch (MalformedURLException ex) {
      ex.printStackTrace();
    }
  }
}