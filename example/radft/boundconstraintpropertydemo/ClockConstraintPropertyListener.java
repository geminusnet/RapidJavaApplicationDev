package boundconstraintpropertydemo;

import java.awt.*;
import java.beans.*;

public class ClockConstraintPropertyListener
  extends ClockBoundPropertyListener
  implements VetoableChangeListener {
  public ClockConstraintPropertyListener() {
  }

  public void vetoableChange(PropertyChangeEvent e)
    throws PropertyVetoException {
    if (e.getPropertyName().equals("timeZoneOffset")) {
      int timeZoneOffset = ((Integer)e.getNewValue()).intValue();
      if (timeZoneOffset > 12 || timeZoneOffset < -12)
        throw new PropertyVetoException("Invalid timeZoneOffset", e);
    }
  }
}