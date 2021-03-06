package boundconstraintpropertydemo;

import clockdemo.Clock;
import java.awt.*;
import java.beans.*;

public class ClockBoundPropertyListener
  extends Clock implements PropertyChangeListener {
  public ClockBoundPropertyListener() {
  }

  public void propertyChange(PropertyChangeEvent e) {
    if (e.getPropertyName().equals("hourHandColor"))
      setHourHandColor((Color)e.getNewValue());

    if (e.getPropertyName().equals("showingDigitalDateTime"))
      setShowingDigitalDateTime(
        ((Boolean)e.getNewValue()).booleanValue());

    if (e.getPropertyName().equals("timeZoneID"))
      setTimeZoneID((String)e.getNewValue());

    if (e.getPropertyName().equals("timeZoneOffset"))
      setTimeZoneOffset(
        ((Integer)e.getNewValue()).intValue());

    if (e.getPropertyName().equals("usingTimeZoneID")) 
      setUsingTimeZoneID(((Boolean)e.getNewValue()).booleanValue());
    
    repaint();
  }
}