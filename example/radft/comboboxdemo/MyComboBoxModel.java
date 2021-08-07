package comboboxdemo;

import javax.swing.*;
import java.awt.*;

public class MyComboBoxModel extends DefaultComboBoxModel {
  public MyComboBoxModel(String[] name, Image[] image) {
    for (int i=0; i<name.length; i++) {
      addElement(new Object[] {name[i], image[i]});
    }
  }

  /** Override this method in DefaultComoboBoxModel */
  public String getName(Object value) {
    Object[] array = (Object[])value;
    return (String)array[0];
  }

  /** Override this method in DefaultComoboBoxModel */
  public Image getImage(Object value) {
    Object[] array = (Object[])value;
    return (Image)array[1];
  }
}