package clockdemo;

import java.io.*;

public class PersistentClock extends Clock {

  // Restore clock to the persistent state
  private void readObject(ObjectInputStream in)
    throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    thread = new Thread(this);
    thread.start();
  }

  // Store clock
  private void writeObject(ObjectOutputStream out)
    throws IOException {
    thread = null;
    out.defaultWriteObject();
  }
}