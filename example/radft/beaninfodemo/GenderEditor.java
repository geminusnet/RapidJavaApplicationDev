package beaninfodemo;

import java.beans.PropertyEditorSupport;

public class GenderEditor extends PropertyEditorSupport {
  /** Override this method from PropertyEditorSupport */
  public String[] getTags() {
    String[] choices = {"Male", "Female"};
    return choices;
  }

  /** Override this method from PropertyEditorSupport */
  public String getJavaInitializationString() {
    return "\"" + getValue().toString() + "\"";
  }
}