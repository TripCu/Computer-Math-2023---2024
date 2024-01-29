package Pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PrizePanel extends JPanel {
    private static final int FRAME_WIDTH = 400;
    private static final Color BACKGROUND = new Color(204, 204, 204);
    private static final Color BALL_COLOR;
    private static final Color PRIZE_COLOR;
    private static final int BALL_DIAM = 50;
    private static final int PRIZE_DIAM = 25;
    private static final int PRIZE_SHIFT = 10;
    private BufferedImage myImage = new BufferedImage(400, 400, 1);
    private Graphics myBuffer;
    private Ball ball;
    private Polkadot prize;
    private Timer t;
    private int hits;

    public PrizePanel() {
        this.myBuffer = this.myImage.getGraphics();
        this.myBuffer.setColor(BACKGROUND);
        this.myBuffer.fillRect(0, 0, 400, 400);
        this.ball = new Ball(0, 0, 50, BALL_COLOR);
        this.ball.jump(400, 400);
        this.prize = new Polkadot(0, 0, 25, PRIZE_COLOR);
        this.prize.jump(400, 400);
        this.hits = 0;
        this.t = new Timer(5, new Listener());
        this.t.start();
        this.addMouseListener(new Mouse());
    }

    public void paintComponent(Graphics g) {
        g.drawImage(this.myImage, 0, 0, this.getWidth(), this.getHeight(), (ImageObserver)null);
    }

    public void collide(Ball b, Polkadot p) {
        double dist = this.distance((double)b.getX(), (double)b.getY(), (double)p.getX(), (double)p.getY());
        if (dist < 37.0) {
            ++this.hits;
            p.jump(400, 400);
        }

    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
    }

    static {
        BALL_COLOR = Color.BLACK;
        PRIZE_COLOR = Color.RED;
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            PrizePanel.this.myBuffer.setColor(PrizePanel.BACKGROUND);
            PrizePanel.this.myBuffer.fillRect(0, 0, 400, 400);
            PrizePanel.this.ball.move(400, 400);
            PrizePanel.this.collide(PrizePanel.this.ball, PrizePanel.this.prize);
            PrizePanel.this.ball.draw(PrizePanel.this.myBuffer);
            PrizePanel.this.prize.draw(PrizePanel.this.myBuffer);
            PrizePanel.this.myBuffer.setColor(Color.BLACK);
            PrizePanel.this.myBuffer.setFont(new Font("Monospaced", 1, 24));
            PrizePanel.this.myBuffer.drawString("Count: " + PrizePanel.this.hits, 250, 25);
            PrizePanel.this.repaint();
        }
    }

    private class Mouse extends MouseAdapter {
        private Mouse() {
        }

        public void mouseClicked(MouseEvent e) {
            if (e.isMetaDown()) {
                PrizePanel.this.ball.setX(e.getX());
                PrizePanel.this.ball.setY(e.getY());
            } else if (e.isShiftDown()) {
                PrizePanel.this.ball.setdx((int)(Math.random() * 11.0 - 6.0));
                PrizePanel.this.ball.setdy((int)(Math.random() * 11.0 - 6.0));
            } else {
                PrizePanel.this.prize.setX(e.getX());
                PrizePanel.this.prize.setY(e.getY());
            }

        }
    }
}
