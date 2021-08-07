package exercise13_8;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.table.*;
import exercise8_9.ImageViewer;
import java.awt.*;

public class MyImageCellRenderer extends DefaultTableCellRenderer {
  public Component getTableCellRendererComponent
    (JTable table, Object value, boolean isSelected,
     boolean isFocused, int row, int column) {
    Image image = ((ImageIcon)value).getImage();
    ImageViewer imageViewer = new ImageViewer(image);
    return imageViewer;
  }
}