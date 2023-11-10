import javax.swing.*;
import java.awt.*;
public class PanelStopInTheNameOfLove extends JPanel
{
   public void paintComponent (Graphics g)
   { 
   g.setColor(Color.RED);
   int xPoints[] = {300, 500, 700, 700, 500,300, 100, 100};
   int yPoints[] = {100, 100, 200, 680, 700, 700, 680, 200};
   
   g.filPolygon(xPoints, yPoints, 8);
   }
  
}