package messagepaneldemo;

import java.awt.*;

public class MultipleMessagePanel extends MessagePanel {
  private String[] messages =
    {"message1", "message2", "message3", "message4"};
  private boolean displayed = true;
  private boolean showingSingleMessage = false;
  
  public MultipleMessagePanel() {
  }
  
  public boolean isDisplayed() {
    return displayed;
  }
  
  public void setDisplayed(boolean displayed) {
    this.displayed = displayed;
  }
  
  public int getMessageLength() {
    return getMessage().length();
  }
  
  public void setMessageLength(int dummy) {
  }
  
  public boolean isShowingSingleMessage() {
    return showingSingleMessage;
  }
  
  public void setShowingSingleMessage(boolean b) {
    this.showingSingleMessage = b;
  }
  
  public String[] getMessages() {
    return messages;
  }
  
  public void setMessages(String[] messages) {
    System.arraycopy(messages, 0, this.messages, 0, messages.length);
    repaint();
  }

  public void paintComponent(Graphics g) {
    // Clear the panel
    g.clearRect(0, 0, getSize().width, getSize().height);
    
    // Things to display
    String thingsToDisplay = new String();
    
    if (displayed) {
      if (showingSingleMessage)
        thingsToDisplay = getMessage();
      else {
        for (int i=0; i<messages.length; i++)
          thingsToDisplay += messages[i] + " ";
      }
    }
    
    if (isCentered()) {
      // Get font metrics for the font
      FontMetrics fm = g.getFontMetrics(getFont());
      
      // Find the center location to display
      int w = fm.stringWidth(thingsToDisplay); // Get the width
      int h = fm.getAscent(); // Get the string height
      setXCoordinate((getSize().width-w)/2);
      setYCoordinate((getSize().height+h)/2);
    }
    
    g.drawString(thingsToDisplay,
    getXCoordinate(), getYCoordinate());
  }
}