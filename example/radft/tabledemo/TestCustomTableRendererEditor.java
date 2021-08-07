package tabledemo;

import imageviewerdemo.ImageViewer;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class TestCustomTableRendererEditor extends javax.swing.JApplet {
  // Create images
  ImageIcon intro1eImageIcon = ImageViewer.createImageIcon(
  "/image/intro1e.gif", this);
  ImageIcon intro2eImageIcon = ImageViewer.createImageIcon(
  "/image/intro2e.gif", this);
  ImageIcon intro3eImageIcon = ImageViewer.createImageIcon(
  "/image/intro3e.jpg", this);
  ImageIcon introjb3ImageIcon = ImageViewer.createImageIcon(
  "/image/introjb3.jpg", this);
  ImageIcon introvj6ImageIcon = ImageViewer.createImageIcon(
  "/image/introvj6.jpg", this);
  ImageIcon introjb4ImageIcon = ImageViewer.createImageIcon(
  "/image/introjb4.jpg", this);
  ImageIcon radjb3ImageIcon = ImageViewer.createImageIcon(
  "/image/radjb3.jpg", this);
  ImageIcon radjb5ImageIcon = ImageViewer.createImageIcon(
  "/image/radjb5.gif", this);
  
  // Create table column names
  String[] columnNames =
  {"Title", "Author", "Publisher", "Date Published", "In-stock",
   "Book Photo"};
   
   // Create table data
   Object[][] data = {
     {"Introduction to Java Programming", "Y. Daniel Liang",
      "Que Eduction & Training",
      new GregorianCalendar(1998, 1-1, 6).getTime(),
      new Boolean(false), intro1eImageIcon},
      {"Introduction to Java Programming, Second Edition",
       "Y. Daniel Liang",
       "Que Eduction & Training",
       new GregorianCalendar(1999, 1-1, 6).getTime(),
       new Boolean(true), intro2eImageIcon},
       {"Introduction to Java Programming, Third Edition",
        "Y. Daniel Liang", "Prentice Hall",
        new GregorianCalendar(2000, 1-1, 6).getTime(),
        new Boolean(true), intro3eImageIcon},
        {"Introduction to Java Programming With Visual J++ 6",
         "Y. Daniel Liang", "Prentice Hall",
         new GregorianCalendar(2000, 1-1, 6).getTime(),
         new Boolean(true), introvj6ImageIcon},
         {"Introduction to Java Programming with JBuilder 3",
          "Y. Daniel Liang", "Prentice Hall",
          new GregorianCalendar(2000, 1-1, 6).getTime(),
          new Boolean(true), introjb3ImageIcon},
          {"Rapid Java Application Development Using JBuilder 3",
           "Y. Daniel Liang", "Prentice Hall",
           new GregorianCalendar(2000, 1-1, 6).getTime(),
           new Boolean(true), radjb3ImageIcon},
           {" Introduction to Java Programming with JBuilder 4",
            "Y. Daniel Liang", "Prentice Hall",
            new GregorianCalendar(2001, 7-1, 22).getTime(),
            new Boolean(true), introjb4ImageIcon},
            {"Rapid Java Application Development Using JBuilder 4 and 5",
             "Y. Daniel Liang", "Prentice Hall",
             new GregorianCalendar(2001, 12-1, 16).getTime(),
             new Boolean(true), radjb5ImageIcon},
   };
   
   // Create table model
   MyTableModel tableModel = new MyTableModel(data, columnNames);
   
   /** Creates new form TestCustomTableRendererEditor */
   public TestCustomTableRendererEditor() {
     initComponents();
     // Set custom renderer for displaying images
     TableColumn bookCover = jTable1.getColumn("Book Photo");
     bookCover.setCellRenderer(new MyImageCellRenderer());
     
     // Create a combo box for publishers
     JComboBox jcboPublishers = new JComboBox();
     jcboPublishers.addItem("Prentice Hall");
     jcboPublishers.addItem("Que Education & Training");
     jcboPublishers.addItem("McGraw-Hill");
     
     // Set combo box as the editor for the publisher column
     TableColumn publisherColumn = jTable1.getColumn("Publisher");
     publisherColumn.setCellEditor(
     new DefaultCellEditor(jcboPublishers));
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   private void initComponents() {//GEN-BEGIN:initComponents
       jScrollPane1 = new javax.swing.JScrollPane();
       jTable1 = new javax.swing.JTable(tableModel);
       
       jScrollPane1.setViewportView(jTable1);
       
       getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
     
   }//GEN-END:initComponents
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   // End of variables declaration//GEN-END:variables
}