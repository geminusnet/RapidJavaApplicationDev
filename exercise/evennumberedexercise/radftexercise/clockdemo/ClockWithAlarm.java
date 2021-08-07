package clockdemo;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ClockWithAlarm extends Clock {
  /** Utility field used by event firing mechanism. */
  private javax.swing.event.EventListenerList listenerList =  null;
  
  /** Holds value of property alarmDate. */
  private String alarmDate;
  
  /** Holds value of property alarmTime. */
  private String alarmTime;
  
  public ClockWithAlarm() {
    super();

    // Get initial date and time
    GregorianCalendar cal = new GregorianCalendar(tz);

    // Initialize alarm date, which consists of current
    // year, month, and date, separated by commas.
    alarmDate = cal.get(cal.YEAR) + "," + cal.get(cal.MONTH)
      + "," + cal.get(cal.DATE);

    // Initialize alarm time, which consists of current
    // hour, minute, and second, separated by commas.
    alarmTime = cal.get(cal.HOUR) + "," + cal.get(cal.MINUTE)
      + "," + cal.get(cal.SECOND);
  }

  public void run() {
    while (true) {
      try {
        thread.sleep(1000);
      }
      catch (InterruptedException e) {}
      repaint();

      // Fire tick event if the current time matches alarm time
      GregorianCalendar rightNow = new GregorianCalendar(tz);
      String rightNowDate = rightNow.get(rightNow.YEAR)
        + "," +  rightNow.get(rightNow.MONTH) + "," +
        rightNow.get(rightNow.DATE);
      String rightNowTime = rightNow.get(rightNow.HOUR)
        + "," +  rightNow.get(rightNow.MINUTE) + "," +
        rightNow.get(rightNow.SECOND);
      if (rightNowDate.equals(alarmDate)
        && rightNowTime.equals(alarmTime))
        fireActionListenerActionPerformed(new ActionEvent
          (this, ActionEvent.ACTION_PERFORMED, null));
    }
  }

  /** Registers ActionListener to receive events.
   * @param listener The listener to register.
   */
  public synchronized void addActionListener(java.awt.event.ActionListener listener) {
    if (listenerList == null ) {
      listenerList = new javax.swing.event.EventListenerList();
    }
    listenerList.add(java.awt.event.ActionListener.class, listener);
  }
  
  /** Removes ActionListener from the list of listeners.
   * @param listener The listener to remove.
   */
  public synchronized void removeActionListener(java.awt.event.ActionListener listener) {
    listenerList.remove(java.awt.event.ActionListener.class, listener);
  }
  
  /** Notifies all registered listeners about the event.
   *
   * @param e The event to be fired
   */
  private void fireActionListenerActionPerformed(java.awt.event.ActionEvent event) {
    if (listenerList == null) return;
    Object[] listeners = listenerList.getListenerList();
    for (int i = listeners.length-2; i>=0; i-=2) {
      if (listeners[i]==java.awt.event.ActionListener.class) {
        ((java.awt.event.ActionListener)listeners[i+1]).actionPerformed(event);
      }
    }
  }
  
  /** Getter for property alarmDate.
   * @return Value of property alarmDate.
   */
  public String getAlarmDate() {
    return alarmDate;
  }
  
  /** Setter for property alarmDate.
   * @param alarmDate New value of property alarmDate.
   */
  public void setAlarmDate(String alarmDate) {
    this.alarmDate = alarmDate;
  }
  
  /** Getter for property alarmTime.
   * @return Value of property alarmTime.
   */
  public String getAlarmTime() {
    return alarmTime;
  }
  
  /** Setter for property alarmTime.
   * @param alarmTime New value of property alarmTime.
   */
  public void setAlarmTime(String alarmTime) {
    this.alarmTime = alarmTime;
  }
}