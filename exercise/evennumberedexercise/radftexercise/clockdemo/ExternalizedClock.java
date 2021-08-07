package clockdemo;

import java.awt.*;
import java.io.*;

public class ExternalizedClock extends PersistentClock
  implements Externalizable {
  // Restore clock
  public void readExternal(ObjectInput in)
    throws IOException, ClassNotFoundException {
    setShowingDigitalDateTime(in.readBoolean());
    setTimeZoneID(in.readUTF());
    setSecondHandColor((Color)in.readObject());
    setMinuteHandColor((Color)in.readObject());
    setHourHandColor((Color)in.readObject());
    setDigitalDateTimeColor((Color)in.readObject());
    setRunning(in.readBoolean());
    thread = new Thread(this);
    thread.start();
  }

  /**Store clock*/
  public void writeExternal(ObjectOutput out) throws IOException {
    thread = null;
    out.writeBoolean(isShowingDigitalDateTime());
    out.writeUTF(getTimeZoneID());
    out.writeObject(getSecondHandColor());
    out.writeObject(getMinuteHandColor());
    out.writeObject(getHourHandColor());
    out.writeObject(getDigitalDateTimeColor());
    out.writeBoolean(isRunning());
  }
}