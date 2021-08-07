package guipropertyeditordemo;

import java.beans.*;

public class ImageViewerBeanInfo extends SimpleBeanInfo {
  Class beanClass = ImageViewer.class;

  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _image = new PropertyDescriptor("image",
        beanClass, "getImage", "setImage");
      PropertyDescriptor _imageFilename = new PropertyDescriptor(
        "imageFilename", beanClass, "getImageFilename",
        "setImageFilename");
      _imageFilename.setPropertyEditorClass(
        ImageFilenameEditor.class);
      PropertyDescriptor _stretched = new PropertyDescriptor(
        "stretched", beanClass, "isStretched", "setStretched");
      PropertyDescriptor _XCoordinate = new PropertyDescriptor(
        "XCoordinate", beanClass, "getXCoordinate",
        "setXCoordinate");
      PropertyDescriptor _YCoordinate = new PropertyDescriptor(
        "YCoordinate", beanClass, "getYCoordinate",
          "setYCoordinate");
      PropertyDescriptor[] pds = new PropertyDescriptor[] {
	      _image,
	      _imageFilename,
	      _stretched,
	      _XCoordinate,
	      _YCoordinate};
      return pds;
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }

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
}  