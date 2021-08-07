package beaninfodemo;
import java.beans.PropertyEditorSupport;

public class AgeEditor extends PropertyEditorSupport {
  /** Override this method from PropertyEditorSupport */
  public String getAsText() {
    return getValue().toString();
  }

  /** Override this method from PropertyEditorSupport */
  public void setAsText(String text) 
    throws IllegalArgumentException {
    Integer val = new Integer(text);
    if (val.intValue()<= 0)
      throw new IllegalArgumentException(
        "Age may not be negative or zero");
    else if (val.intValue() >= 150)
      throw 
        new IllegalArgumentException(
          "Age may not be greater than or equal to 150");
    setValue(val);
  }

  /** Override this method from PropertyEditorSupport */
  public String getJavaInitializationString() {
    return getAsText();
  }
}