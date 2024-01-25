package Lab04;

import edu.fcps.Bucket;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BucketPanel extends JPanel {
    public BucketPanel() {
        Timer t = new Timer(10, new Listener());
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(Bucket.getImage(), 0, 0, this.getWidth(), this.getHeight(), (ImageObserver)null);
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            BucketPanel.this.repaint();
        }
    }
}
