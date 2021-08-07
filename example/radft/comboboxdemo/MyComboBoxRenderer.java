package comboboxdemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import imageviewerdemo.ImageViewer;

public class MyComboBoxRenderer implements ListCellRenderer {
  JPanel listCellPanel = new JPanel();
  ImageViewer imageViewer = new ImageViewer();
  JLabel jlbl = new JLabel(" ", JLabel.LEFT);
  Border lineBorder =
    BorderFactory.createLineBorder(Color.black, 1);
  Border emptyBorder =
    BorderFactory.createEmptyBorder(2, 2, 2, 2);

  public MyComboBoxRenderer() {
    jlbl.setPreferredSize(new Dimension(100, 60));
    listCellPanel.setLayout(new BorderLayout());
    listCellPanel.add(imageViewer, BorderLayout.CENTER);
    listCellPanel.add(jlbl, BorderLayout.EAST);
  }

  /** Override this method in ListCellRenderer */
  public Component getListCellRendererComponent
    (JList list, Object value, int index, boolean isSelected,
     boolean cellHasFocus) {
    MyComboBoxModel listModel =
      (MyComboBoxModel)list.getModel();
    String country = listModel.getName(value);
    Image image = listModel.getImage(value);
    jlbl.setText(country);
    imageViewer.setImage(image);

    if (isSelected) {
      listCellPanel.setForeground(list.getSelectionForeground());
      listCellPanel.setBackground(list.getSelectionBackground());
    }
    else {
      listCellPanel.setForeground(list.getForeground());
      listCellPanel.setBackground(list.getBackground());
    }

    if (cellHasFocus)
      listCellPanel.setBorder(lineBorder);
    else
      listCellPanel.setBorder(emptyBorder);

    return listCellPanel;
  }
}