package Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel01 extends JPanel {
   public Panel01() {
   }

   public void paintComponent(Graphics g) {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(0, 0, 400, 400);
      g.setColor(Color.GREEN.darker());
      g.drawLine(0, 350, 400, 350);
      g.setColor(Color.RED);
      g.drawRect(100, 200, 150, 150);
      g.setColor(Color.BLACK);
      g.fillRect(150, 275, 50, 75);
      int[] xPoints = new int[]{75, 175, 275};
      int[] yPoints = new int[]{200, 150, 200};
      g.drawPolygon(xPoints, yPoints, 3);
      g.setColor(Color.YELLOW);
      g.fillOval(300, 75, 50, 50);
      g.setFont(new Font("Serif", 3, 30));
      g.setColor(Color.WHITE);
      g.drawString("Welcome Home", 50, 50);
   }
}
