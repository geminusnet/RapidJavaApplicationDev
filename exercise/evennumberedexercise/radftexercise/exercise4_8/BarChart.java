package exercise4_8;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.*;

/**
 * Title:        Chart Demo
 * Description:  Define a chart model
 * Create several chart views
 * Copyright:    Copyright (c) 2000
 * Company:      Armstrong Atlantic State University
 * @author Y. Daniel Liang
 * @version 1.0
 */

public class BarChart extends JPanel implements ActionListener {
  BorderLayout borderLayout1 = new BorderLayout();
  Color[] colors = {Color.red, Color.yellow, Color.green, Color.blue,
    Color.cyan, Color.magenta, Color.orange, Color.pink,
    Color.darkGray};
  private exercise4_8.ChartModel model;

  public BarChart()
  {
    try
    {
      jbInit();
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
  }

  private void jbInit() throws Exception
  {
    this.setLayout(borderLayout1);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    if (model == null) return;

    String[] dataName = model.getDataName();
    double[] data = model.getData();

    // Find the maximum value in the data
    double max = data[0];
    for (int i=1; i<data.length; i++)
      max = Math.max(max, data[i]);

    int barWidth = (int)((getWidth() - 10.0)/data.length - 10);
    int maxBarHeight = getHeight() - 30;

    g.drawLine(5, getHeight()-10, getWidth()-5, getHeight()-10);

    int x = 15;
    for (int i=0; i<data.length; i++)
    {
      g.setColor(colors[i%colors.length]);
      int newHeight = (int)(maxBarHeight*data[i]/max);
      int y = getHeight()-10-newHeight;
      g.fillRect(x, y, barWidth, newHeight);
      g.setColor(Color.black);
      g.drawString(dataName[i], x, y - 7);
      x += barWidth + 10;
    }
  }

  public void setModel(exercise4_8.ChartModel newModel)
  {
    model = newModel;
    model.addActionListener(this);
  }

  public exercise4_8.ChartModel getModel()
  {
    return model;
  }

  public void actionPerformed(ActionEvent e)
  {
    repaint();
  }
}