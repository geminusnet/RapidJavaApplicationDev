package clockdemo;

import java.applet.*;
import java.net.*;

public class TestClockWithAlarm extends javax.swing.JApplet {
  /** Declare alarmSound */
  AudioClip alarmSound;
  
  public TestClockWithAlarm() {
    initComponents();
    
    // Get the URL for the file name
    URL url = this.getClass().getResource("alarmSound.au");
    
    // Get the audio clip
    alarmSound = Applet.newAudioClip(url);
  }
  
  private void initComponents() {//GEN-BEGIN:initComponents
    clockWithAlarm1 = new clockdemo.ClockWithAlarm();

    clockWithAlarm1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clockWithAlarm1ActionPerformed(evt);
      }
    });

    getContentPane().add(clockWithAlarm1, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents
    
    private void clockWithAlarm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockWithAlarm1ActionPerformed
      alarmSound.play();
    }//GEN-LAST:event_clockWithAlarm1ActionPerformed
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private clockdemo.ClockWithAlarm clockWithAlarm1;
  // End of variables declaration//GEN-END:variables
}