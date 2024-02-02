package Breakout2024;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BreakoutCameron extends GraphicsProgram {
   private static final int WIDTH = 400;
   private static final int HEIGHT = 600;
   private static final int PADDLE_WIDTH = 60;
   private static final int PADDLE_HEIGHT = 10;
   private static final int PADDLE_Y_OFFSET = 30;
   private static final int NBRICKS_PER_ROW = 10;
   private static final int NBRICK_ROWS = 10;
   private static final int BRICK_SEP = 4;
   private static final int BRICK_WIDTH = 36;
   private static final int BRICK_HEIGHT = 8;
   private static final int BALL_RADIUS = 6;
   private static final int BRICK_Y_OFFSET = 70;
   private static int NTURNS = 3;
   private GRect paddle;
   private GLabel loser;
   private GLabel win;
   private GLabel turns;
   int bricks = 100;
   private GOval ball;
   private double vx;
   private double vy;
   private double lastX;
   private int toggle = 0;
   private RandomGenerator rgen = new RandomGenerator();

   public BreakoutCameron() {
   }

   public static void main(String[] args) {
      String[] sizeArgs = new String[]{"width=400", "height=600"};
      BreakoutCameron b = new BreakoutCameron();
      Key key = new Key(b.paddle);
      b.addKeyListener(key);
      b.setFocusable(true);
      b.start(sizeArgs);
   }

   public void run() {
      this.setup();
      this.play();
   }

   public void setup() {
      this.createBricks();
      this.createPaddle();
      this.createBall();
   }

   public void createBricks() {
      for(int x = 0; x < 10; ++x) {
         for(int y = 0; y < 10; ++y) {
            GRect brick = new GRect((double)(y * 36 + 4 * y + 2), (double)(70 + 8 * x + 4 * x), 36.0, 8.0);
            brick.setFilled(true);
            if (x == 0) {
               brick.setColor(Color.RED);
            }

            if (x == 1) {
               brick.setColor(Color.YELLOW.darker());
            }

            if (x == 2) {
               brick.setColor(Color.ORANGE);
            }

            if (x == 3) {
               brick.setColor(Color.YELLOW.brighter());
            }

            if (x == 4) {
               brick.setColor(Color.GREEN.brighter());
            }

            if (x == 5) {
               brick.setColor(Color.GREEN.darker());
            }

            if (x == 6) {
               brick.setColor(Color.BLUE);
            }

            if (x == 7) {
               brick.setColor(Color.BLUE.darker());
            }

            if (x == 8) {
               brick.setColor(Color.MAGENTA);
            }

            if (x == 9) {
               brick.setColor(Color.MAGENTA.darker());
            }

            this.add(brick);
         }
      }

   }

   public void createPaddle() {
      this.paddle = new GRect(200.0, 570.0, 36.0, 8.0);
      this.paddle.setColor(Color.BLACK);
      this.add(this.paddle);
   }

   public void createBall() {
      this.ball = new GOval(200.0, 400.0, 6.0, 6.0);
      this.ball.setColor(Color.BLACK);
      this.add(this.ball);
   }

   public void play() {
      this.startTheBall();
      this.playBall();
   }

   public void startTheBall() {
      this.vx = this.rgen.nextDouble(0.1, 0.3);
      if (this.rgen.nextBoolean(0.5)) {
         this.vx = -this.vy;
      }

      this.vy = 0.3;
   }

   public void playBall() {
      this.turns = new GLabel("Turns: " + NTURNS, 0.0, 600.0);
      this.turns.setFont("Seriff");
      this.turns.setColor(Color.BLACK);
      this.add(this.turns);

      while(true) {
         this.ball.move(this.vx, this.vy);
         this.pause(1.0);
         if (this.ball.getY() >= 594.0) {
            this.remove(this.ball);
            this.createBall();
            this.pause(1000.0);
            this.startTheBall();
            --NTURNS;
            this.turns.setLabel("Turns: " + NTURNS);
         }

         if (this.ball.getX() <= 6.0) {
            this.vx = -this.vx;
         }

         if (this.ball.getX() >= 394.0) {
            this.vx = -this.vx;
         }

         if (this.ball.getY() <= 6.0) {
            this.vy = -this.vy;
         }

         if (NTURNS == 0) {
            this.loser = new GLabel("LOSER", 100.0, 300.0);
            this.loser.setFont(new Font("Seriff", 1, 50));
            this.loser.setColor(Color.BLACK);
            this.add(this.loser);
            this.remove(this.paddle);
            this.remove(this.ball);
            return;
         }

         GObject collider = this.getCollidingObject();
         if (collider == this.paddle) {
            this.vy = -this.vy;
         } else if (collider instanceof GRect) {
            this.vy = -this.vy;
            this.remove(collider);
            --this.bricks;
         }

         if (this.bricks == 0) {
            this.win = new GLabel("WINNER", 100.0, 300.0);
            this.win.setFont(new Font("Seriff", 1, 50));
            this.win.setColor(Color.BLACK);
            this.add(this.win);
            this.remove(this.paddle);
            this.remove(this.ball);
         }
      }
   }

   private GObject getCollidingObject() {
      if (this.getElementAt(this.ball.getX(), this.ball.getY()) != null) {
         return this.getElementAt(this.ball.getX(), this.ball.getY());
      } else if (this.getElementAt(this.ball.getX() + 12.0, this.ball.getY()) != null) {
         return this.getElementAt(this.ball.getX() + 12.0, this.ball.getY());
      } else if (this.getElementAt(this.ball.getX() + 12.0, this.ball.getY() + 12.0) != null) {
         return this.getElementAt(this.ball.getX() + 12.0, this.ball.getY() + 12.0);
      } else {
         return this.getElementAt(this.ball.getX(), this.ball.getY() + 12.0) != null ? this.getElementAt(this.ball.getX(), this.ball.getY() + 12.0) : null;
      }
   }

   private static final class Key extends KeyAdapter {
      final GRect paddle;

      public Key(GRect paddle) {
         this.paddle = paddle;
      }

      public void keyPressed(KeyEvent e) {
         System.out.println("Hello");
         if (e.getKeyCode() == 39) {
            this.paddle.move(20.0, 0.0);
         }

         if (e.getKeyCode() == 37) {
            this.paddle.move(-20.0, 0.0);
         }

      }
   }
}
