package listdemo;

import javax.swing.*;
import java.awt.*;

public class MyListModel extends DefaultListModel {
  public MyListModel(String[] name, Image[] image) {
    for (int i=0; i<name.length; i++) {
      addElement(new Object[] {name[i], image[i]});
    }
  }

  /** Override the getName method in DefaultListModel */
  public String getName(Object value) {
    Object[] array = (Object[])value;
    return (String)array[0];
  }

  /** Override the getImage method in DefaultListModel */
  public Image getImage(Object value) {
    Object[] array = (Object[])value;
    return (Image)array[1];
  }
}