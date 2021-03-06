package beaninfodemo;

import java.beans.*;

public class StudentBeanInfo extends SimpleBeanInfo {
  /** Override this method from PropertyEditorSupport */
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor pdsFullName = new PropertyDescriptor
        ("fullName", Student.class);
      PropertyDescriptor pdsAge = new PropertyDescriptor
        ("age", Student.class);
      pdsAge.setPropertyEditorClass(AgeEditor.class);
      PropertyDescriptor pdsGender = new PropertyDescriptor
        ("gender", Student.class);
      pdsGender.setPropertyEditorClass(GenderEditor.class);
      PropertyDescriptor[] pds = {pdsFullName, pdsAge, pdsGender};
      return pds;
    }
    catch (IntrospectionException e) {
      return null;
    }
  }
}