package Lab00;
import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel
{
   public void paintComponent (Graphics g)
   {
      g.setColor(Color.red);
      g.fillRect(0, 0, 250, 250);
      g.setColor(Color.GREEN);
      g.fillRect(0, 250, 250, 250);
      g.setColor(Color.BLUE);
      g.fillRect(250, 0, 250, 250);
      g.setColor(Color.YELLOW);
      g.fillRect(250, 250, 250, 250);

      g.setFont(new Font ("Arial", Font.BOLD, 50));
      g.setColor(new Color(0, 0, 0));
      g.drawString("BOLD", 200, 200);
      
      g.setFont(new Font ("SansSerif", Font.ITALIC, 25));
      g.setColor(new Color(255, 155, 0));
      g.drawString("Italic", 50, 40);
      
      g.setFont(new Font ("Serif", Font.PLAIN, 150));
      g.setColor(new Color(196, 171, 180));
      g.drawString("big", 100, 100);
      
      g.setFont(new Font("Monospaced", Font.ITALIC, 75));
      g.setColor(new Color(50, 50, 0));
      g.drawString("Monospaced", 0, 300);
       }
}