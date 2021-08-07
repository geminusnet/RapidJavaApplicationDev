package beaninfodemo;

import java.beans.*;
import java.awt.event.MouseListener;
import java.awt.Image;

public class CircleBeanInfo extends SimpleBeanInfo {
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor pdsRadius = new PropertyDescriptor
        ("radius", Circle.class, "readRadius", "writeRadius");
      PropertyDescriptor pdsFilled = new PropertyDescriptor
        ("filled", Circle.class);
      PropertyDescriptor[] pds = {pdsRadius, pdsFilled};
      return pds;
    }
    catch (IntrospectionException e) {
      return null;
    }
  }

  public EventSetDescriptor[] getEventSetDescriptors() {
    try {
      String[] methodNames = {"mouseClicked", "mouseEntered",
        "mouseExited", "mousePressed", "mouseReleased"};
      EventSetDescriptor esMouseEvent = new EventSetDescriptor
        (Circle.class, "MouseEvent", MouseListener.class,
          methodNames, "addMouseListener", "removeMouseListener");
      EventSetDescriptor[] es = {esMouseEvent};
      return es;
    }
    catch (IntrospectionException e) {
      return null;
    }
  }

  public Image getIcon(int iconKind) {
    if (iconKind == BeanInfo.ICON_COLOR_16x16)
      return loadImage("circle16.gif");
    else if (iconKind == BeanInfo.ICON_COLOR_32x32)
      return loadImage("circle32.gif");
    return null;
  }
}