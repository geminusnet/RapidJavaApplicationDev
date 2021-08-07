package clockdemo;

import java.beans.*;

public class ClockBeanInfo extends SimpleBeanInfo {
  Class beanClass = Clock.class;

  public ClockBeanInfo() {
  }

  /** Specify the customizer (to be introduced in Example 11.6 */
  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Clock.class, ClockCustomizer.class);
  }

  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _dateStyle = new PropertyDescriptor
        ("dateStyle", beanClass, "getDateStyle", "setDateStyle");
      PropertyDescriptor _digitalDateTimeColor =
        new PropertyDescriptor("digitalDateTimeColor", beanClass,
          "getDigitalDateTimeColor", "setDigitalDateTimeColor");
      PropertyDescriptor _header = new PropertyDescriptor
        ("header", beanClass, "getHeader", "setHeader");
      PropertyDescriptor _headerColor = new PropertyDescriptor
        ("headerColor", beanClass, "getHeaderColor",
        "setHeaderColor");
      PropertyDescriptor _hourHandColor = new PropertyDescriptor
        ("hourHandColor", beanClass,
         "getHourHandColor", "setHourHandColor");
      PropertyDescriptor _minuteHandColor = new PropertyDescriptor
        ("minuteHandColor", beanClass,
         "getMinuteHandColor", "setMinuteHandColor");
      PropertyDescriptor _preferredSize = new PropertyDescriptor
        ("preferredSize", beanClass, "getPreferredSize", null);
      PropertyDescriptor _running = new PropertyDescriptor
        ("running", beanClass, "isRunning", "setRunning");
      _running.setDisplayName("Enable the clock to run");
      PropertyDescriptor _secondHandColor = new PropertyDescriptor
        ("secondHandColor", beanClass,
         "getSecondHandColor", "setSecondHandColor");
      PropertyDescriptor _showingDigitalDateTime =
        new PropertyDescriptor("showingDigitalDateTime", beanClass,
         "isShowingDigitalDateTime", "setShowingDigitalDateTime");
      PropertyDescriptor _showingHeader = new PropertyDescriptor
        ("showingHeader", beanClass,
         "isShowingHeader", "setShowingHeader");
      PropertyDescriptor _timeStyle =
        new PropertyDescriptor("timeStyle",
          beanClass, "getTimeStyle", "setTimeStyle");
      PropertyDescriptor _timeZoneID = new PropertyDescriptor
        ("timeZoneID", beanClass, "getTimeZoneID", "setTimeZoneID");
      _timeZoneID.setPropertyEditorClass(
        clockdemo.TimeZoneIDEditor.class);
      PropertyDescriptor _timeZoneOffset = new PropertyDescriptor
        ("timeZoneOffset", beanClass,
         "getTimeZoneOffset", "setTimeZoneOffset");
      PropertyDescriptor _usingTimeZoneID = new PropertyDescriptor
        ("usingTimeZoneID", beanClass, "isUsingTimeZoneID",
        "setUsingTimeZoneID");

      // Set the enumeration values in the timeStyle property
      _timeStyle.setValue("enumerationValues", new Object[] {
        "FULL - 0", new Integer(0), "0",
        "LONG - 1", new Integer(1), "1",
        "MEDIUM - 2", new Integer(2), "2",
        "SHORT - 3", new Integer(3), "3",
      });

      // Set the enumeration values in the dateStyle property
      _dateStyle.setValue("enumerationValues", new Object[] {
        "FULL - 0", new Integer(0), "0",
        "LONG - 1", new Integer(1), "1",
        "MEDIUM - 2", new Integer(2), "2",
        "SHORT - 3", new Integer(3), "3",
      });

      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _dateStyle,
        _digitalDateTimeColor,
        _header,
        _headerColor,
        _hourHandColor,
        _minuteHandColor,
        _preferredSize,
        _running,
        _secondHandColor,
        _showingDigitalDateTime,
        _showingHeader,
        _timeStyle,
        _timeZoneID,
        _timeZoneOffset,
        _usingTimeZoneID,};
      return pds;
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }

  /** Expose PME( Properties, Methods, and Events in the superclass */
  public BeanInfo[] getAdditionalBeanInfo() {
    Class superclass = beanClass.getSuperclass();
    try {
      BeanInfo superBeanInfo = Introspector.getBeanInfo(superclass);
      return new BeanInfo[] { superBeanInfo };
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }
  
  /** Specify an image icon */
  public java.awt.Image getIcon(int iconKind) {
    if (iconKind == BeanInfo.ICON_COLOR_16x16)
      return loadImage("clock16.gif");
    else if (iconKind == BeanInfo.ICON_COLOR_32x32)
      return loadImage("clock32.gif");
    return null;
  }
}