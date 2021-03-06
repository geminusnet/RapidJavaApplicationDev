package chartdemo;

import clockdemo.Clock;
import java.awt.event.*;
import java.util.*;

/**
 * Title:        Chart Demo
 * Description:  Define a chart model
 * Create several chart views
 * Copyright:    Copyright (c) 2000
 * Company:      Armstrong Atlantic State University
 * @author Y. Daniel Liang
 * @version 1.0
 */

public class ChartModel
{
  public ChartModel()
  {
  }

  private double[] data = {200, 40, 50, 100, 40, 10};
  private String[] dataName = {"CS", "Math", "Chem", "Biol", "Phys", "Buss"};

  private transient Vector actionListeners;

  public double[] getData()
  {
    return data;
  }

  public void setData(double[] newData)
  {
    data = newData;
    // System.arraycopy(newData, 0, data, 0, newData.length);
    fireActionPerformed(new ActionEvent(this,
      ActionEvent.ACTION_PERFORMED, null));
  }

  public synchronized void removeActionListener(ActionListener l)
  {
    if (actionListeners != null && actionListeners.contains(l))
    {
      Vector v = (Vector) actionListeners.clone();
      v.removeElement(l);
      actionListeners = v;
    }
  }

  public synchronized void addActionListener(ActionListener l)
  {
    Vector v = actionListeners == null ? new Vector(2) : (Vector) actionListeners.clone();
    if (!v.contains(l))
    {
      v.addElement(l);
      actionListeners = v;
    }
  }

  protected void fireActionPerformed(ActionEvent e)
  {
    if (actionListeners != null)
    {
      Vector listeners = actionListeners;
      int count = listeners.size();
      for (int i = 0; i < count; i++)
      {
        ((ActionListener) listeners.elementAt(i)).actionPerformed(e);
      }
    }
  }

  public void setDataName(String[] newDataName)
  {
    dataName = newDataName;
  }

  public String[] getDataName()
  {
    return dataName;
  }
}