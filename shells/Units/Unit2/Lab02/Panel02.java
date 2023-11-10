//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
    public Panel02() {
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.RED.darker());
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.YELLOW.darker());
        g.fillRect(135, 60, 140, 180);

        int x;
        for(x = 125; x <= 265; x += 20) {
            g.fillOval(x, 50, 20, 20);
        }

        for(x = 125; x <= 265; x += 20) {
            g.fillOval(x, 230, 20, 20);
        }

        int y;
        for(y = 50; y <= 230; y += 20) {
            g.fillOval(125, y, 20, 20);
        }

        for(y = 50; y <= 230; y += 20) {
            g.fillOval(265, y, 20, 20);
        }

        ImageIcon i = new ImageIcon("tj.jpg");
        g.drawImage(i.getImage(), 150, 75, 110, 150, (ImageObserver)null);
        g.setFont(new Font("Serif", 3, 30));
        g.setColor(Color.WHITE);
        g.drawString("Our Fearless Leader", 75, 300);
    }
}
