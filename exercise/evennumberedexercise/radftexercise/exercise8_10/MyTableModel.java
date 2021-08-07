package exercise8_10;

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
import java.util.*;

public class MyTableModel extends DefaultTableModel { 
  /**Override this method to return a class for the column*/
  public Class getColumnClass(int column) {
    return getValueAt(0, column).getClass();
  }
}