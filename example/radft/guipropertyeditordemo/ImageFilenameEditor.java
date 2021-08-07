package guipropertyeditordemo;

import java.awt.*;
import java.beans.*;

public class ImageFilenameEditor extends PropertyEditorSupport {
  private String imageFilename = "/image/us.gif";
  private ImageFilenameGUIEditor guiEditor;

  /** Override this method from PropertyEditorSupport */
  public void setAsText(String text) {
    setValue(text);
  }

  /** Override this method from PropertyEditorSupport */
  public void setValue(Object o) {
    imageFilename = (String)o;
    if (guiEditor != null)
    	  guiEditor.imageFilename = imageFilename;

    firePropertyChange();
  }

  /** Override this method from PropertyEditorSupport */
  public Object getValue() {
    if (guiEditor != null)
      this.imageFilename = guiEditor.imageFilename;

    return imageFilename;
  }

  /** Override this method from PropertyEditorSupport */
  public String getAsText() {
    return imageFilename;
  }

  /** Override this method from PropertyEditorSupport */
  public boolean supportsCustomEditor() {
    return true;
  }

  /** Override this method from PropertyEditorSupport */
  public Component getCustomEditor() {
    if (guiEditor == null)
      guiEditor =  new ImageFilenameGUIEditor(imageFilename);
    return guiEditor;
  }

  /** Override this method from PropertyEditorSupport */
  public String getJavaInitializationString() {
    return "\"" + getAsText() + "\"";
  }
}