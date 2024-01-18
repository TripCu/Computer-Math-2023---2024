package Lab14;//
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BumperPanel extends JPanel {
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private static final Color BALL_COLOR;
   private static final Color PRIZE_COLOR;
   private static final Color BUMPER_COLOR;
   private static final double BALL_DIAM = 50.0;
   private static final double PRIZE_DIAM = 25.0;
   private static final int BUMPER_X_WIDTH = 75;
   private static final int BUMPER_Y_WIDTH = 125;
   private BufferedImage myImage = new BufferedImage(400, 400, 1);
   private Graphics myBuffer;
   private Ball ball;
   private Ball prize;
   private Bumper bumper;
   private int hits;
   private Timer timer;

   public BumperPanel() {
      this.myBuffer = this.myImage.getGraphics();
      this.ball = new Ball(0.0, 0.0, 50.0, BALL_COLOR);
      this.ball.jump(400, 400);
      this.prize = new Ball(0.0, 0.0, 25.0, PRIZE_COLOR);
      this.prize.jump(400, 400);
      this.bumper = new Bumper(100, 100, 75, 125, BUMPER_COLOR);
      this.bumper.jump(400, 400);

      while(this.bumper.inBumper(this.ball)) {
         this.ball.jump(400, 400);
      }

      while(this.bumper.inBumper(this.prize)) {
         this.prize.jump(400, 400);
      }

      this.hits = 0;
      this.timer = new Timer(5, new Listener());
      this.timer.start();
   }

   public void paintComponent(Graphics g) {
      g.drawImage(this.myImage, 0, 0, this.getWidth(), this.getHeight(), (ImageObserver)null);
   }

   public void collide(Ball b, Ball p) {
      double dist = this.distance(b.getX(), b.getY(), p.getX(), p.getY());
      if (dist < p.getRadius() + b.getRadius()) {
         ++this.hits;
         p.jump(400, 400);
      }

   }

   private double distance(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
   }

   static {
      BALL_COLOR = Color.black;
      PRIZE_COLOR = Color.RED;
      BUMPER_COLOR = Color.BLUE;
   }

   private class Listener implements ActionListener {
      private Listener() {
      }

      public void actionPerformed(ActionEvent e) {
         BumperPanel.this.myBuffer.setColor(BumperPanel.BACKGROUND);
         BumperPanel.this.myBuffer.fillRect(0, 0, 400, 400);
         BumperPanel.this.ball.move(400.0, 400.0);
         BumperPanel.this.collide(BumperPanel.this.ball, BumperPanel.this.prize);
         BumperCollision.collide(BumperPanel.this.bumper, BumperPanel.this.ball);
         BumperPanel.this.ball.draw(BumperPanel.this.myBuffer);
         BumperPanel.this.prize.draw(BumperPanel.this.myBuffer);
         BumperPanel.this.bumper.draw(BumperPanel.this.myBuffer);

         while(BumperPanel.this.bumper.inBumper(BumperPanel.this.prize)) {
            BumperPanel.this.prize.jump(400, 400);
         }

         BumperPanel.this.myBuffer.setColor(Color.black);
         BumperPanel.this.myBuffer.setFont(new Font("Monospaced", 1, 24));
         BumperPanel.this.myBuffer.drawString("Count: " + BumperPanel.this.hits, 250, 25);
         BumperPanel.this.repaint();
      }
   }
}
