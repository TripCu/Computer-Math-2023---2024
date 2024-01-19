package Lab06_7_8_9.Lab07;

import edu.fcps.Turtle;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TurtlePanel extends JPanel {
    public TurtlePanel() {
        Timer t = new Timer(10, new Listener());
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(Turtle.getImage(), 0, 0, this.getWidth(), this.getHeight(), (ImageObserver)null);
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            TurtlePanel.this.repaint();
        }
    }
}
