package clockdemo;

import java.beans.*;
import java.util.TimeZone;

public class TimeZoneIDEditor extends PropertyEditorSupport {
  public TimeZoneIDEditor() {
  }

  /** Override this method from PropertyEditorSupport */
  public String[] getTags() {
    return TimeZone.getAvailableIDs();
  }

  /** Override this method from PropertyEditorSupport */
  public String getJavaInitializationString() {
    return "\"" + getAsText() + "\"";
  }

  public void setAsText(String text) 
    throws IllegalArgumentException {
    setValue(text);
  }
} 