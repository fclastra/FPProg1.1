import java.awt.Graphics;
import java.util.Date;
public class Applet2 extends java.applet.Applet {
  String message;
  public void init () {
    Date date = new Date (System.currentTimeMillis());
    message = "I was born at: " + date.toString();
  }
  public void paint (Graphics g) {
    g.drawString (message, 10, 20);
  }
}
