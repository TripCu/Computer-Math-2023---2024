package Christmas_Tree_Compettion;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ChristmassTree extends JPanel {



    public void paintComponent(Graphics g)

    {
        g.setColor(new Color(24, 215, 209));
        g.fillRect(0, this.getHeight()-600, this.getWidth(), 600);

        g.setColor(new Color(35, 94, 5));
        int[] xp  = {250, 150, 350};
        int[] yp = {150, 400, 400};
        g.fillPolygon(xp, yp, 3);

        int[] xp1 = {250, 135, 365};
        int[] yp1 = {200, 450, 450};
        g.fillPolygon(xp1,yp1,3);

        int[] xp2 = {250, 100, 400};
        int[] yp2 = {300, 500, 500};
        g.fillPolygon(xp2,yp2,3);

        g.setColor(new Color(94, 49, 5));
        g.fillRect(225, 500, 50, 100);

        g.setColor(new Color(239, 185, 12));
        g.fillOval(240, 200, 25, 25);
        g.fillOval(215, 300, 25, 25);
        g.fillOval(275, 380, 25, 25);
        g.fillOval(200, 455, 25, 25);
        g.fillOval(330, 455, 25, 25);







    }
}