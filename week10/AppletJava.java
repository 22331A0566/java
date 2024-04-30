import java.applet.Applet;
import java.awt.Graphics;
 @SuppressWarnings("removal")
public class AppletJava extends Applet{
    public void paint (Graphics g){
        g.drawString("Hello Java",100,100);
    }
 }
 /*
    <applet width="500" height="500" code="AppletJava.class"></applet>
*/
