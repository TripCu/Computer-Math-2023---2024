package Breakout2024;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Breakoutv2 extends GraphicsProgram {
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
    private static final int NTURNS = 3;
    private GRect paddle;
    private GOval ball;
    private double vx;
    private double vy;
    private double lastX;
    private int toggle = 0;
    private int scoreCount = 0;
    private int bricksLeft = 100;
    private int gameLives = 3;
    private GLabel score;
    private GLabel amountLeft;
    private GLabel win;
    private GLabel lives;

    public Breakoutv2() {
    }

    public static void main(String[] args) {
        String[] sizeArgs = new String[]{"width=400", "height=600"};
        (new Breakoutv2()).start(sizeArgs);
    }

    public void run() {
        this.score = new GLabel("Score: " + this.scoreCount);
        this.score.isVisible();
        this.score.setLocation(50.0, 50.0);
        this.add(this.score);
        this.lives = new GLabel("Lives: " + this.gameLives);
        this.lives.isVisible();
        this.lives.setLocation(150.0, 50.0);
        this.add(this.lives);
        this.amountLeft = new GLabel("Bricks Left: " + this.bricksLeft);
        this.amountLeft.isVisible();
        this.amountLeft.setLocation(300.0, 50.0);
        this.add(this.amountLeft);
        this.setup();
        this.play();
    }

    public void setup() {
        this.createBricks();
        this.createPaddle();
        this.createBall();
        this.addMouseListeners();
    }

    public void createBricks() {
        for(int x = 0; x < 10; ++x) {
            for(int y = 0; y < 10; ++y) {
                GRect brick = new GRect((double)(y * 36 + 4 * y + 2), (double)(70 + 8 * x + 4 * x), 36.0, 8.0);
                brick.setFilled(true);
                if (x == 0 || x == 1) {
                    brick.setColor(Color.RED);
                }

                if (x == 2 || x == 3) {
                    brick.setColor(Color.ORANGE);
                }

                if (x == 4 || x == 5) {
                    brick.setColor(Color.YELLOW);
                }

                if (x == 6 || x == 7) {
                    brick.setColor(Color.GREEN);
                }

                if (x == 8 || x == 9) {
                    brick.setColor(Color.CYAN);
                }

                this.add(brick);
            }
        }

    }

    public void createPaddle() {
        this.paddle = new GRect(170.0, 560.0, 60.0, 10.0);
        this.paddle.setFilled(true);
        this.add(this.paddle);
    }

    public void createBall() {
        this.ball = new GOval(194.0, 294.0, 12.0, 12.0);
        this.ball.setFilled(true);
        this.add(this.ball);
    }

    public void play() {
        this.waitForClick();
        this.startTheBall();
        this.playBall();
    }

    public void startTheBall() {
        RandomGenerator rgen = new RandomGenerator();
        this.vy = 0.3;
        this.vx = rgen.nextDouble(0.1, 0.4);
        if (rgen.nextBoolean(0.5)) {
            this.vx = -this.vx;
        }

    }

    public void playBall() {
        while(true) {
            this.ball.move(this.vx, this.vy);
            this.pause(1.0);
            if (this.ball.getY() <= -6.0) {
                this.vy *= -1.0;
            } else if (this.ball.getX() >= 394.0) {
                this.vx *= -1.0;
            } else if (this.ball.getX() <= -6.0) {
                this.vx *= -1.0;
            } else if (this.ball.getY() >= 594.0) {
                this.vy *= -1.0;
                --this.gameLives;
                this.lives.setLabel("Lives: " + this.gameLives);
                if (this.gameLives >= 1) {
                    this.remove(this.ball);
                    this.createBall();
                    this.waitForClick();
                    this.startTheBall();
                } else {
                    this.remove(this.ball);
                    this.remove(this.paddle);
                    GLabel loss = new GLabel("Game Over", 200.0, 300.0);
                    loss.isVisible();
                    loss.setColor(Color.BLACK);
                    this.add(loss);
                    this.pause(5000.0);
                    this.gameLives = 3;
                    this.scoreCount = 0;
                    this.bricksLeft = 100;
                    this.remove(loss);
                    this.setup();
                    this.waitForClick();
                    this.play();
                }
            }

            GObject collider = this.getCollidingObject();
            if (collider == this.paddle) {
                if (this.vx > 0.0) {
                    if (this.ball.getX() < collider.getX() + 30.0) {
                        this.vx = -this.vx;
                    } else {
                        this.vx = this.vx;
                    }
                } else if (this.ball.getX() > collider.getX() + 30.0) {
                    this.vx = -this.vx;
                } else {
                    this.vx = this.vx;
                }

                this.vy = -this.vy;
            } else if (collider instanceof GRect) {
                this.vy = -this.vy;
                this.remove(collider);
                this.score.setLabel("Score: " + this.scoreCount);
                this.amountLeft.setLabel("Bricks Left: " + this.bricksLeft);
                if (collider != null) {
                    --this.bricksLeft;
                    this.amountLeft.setLabel("Bricks Left: " + this.bricksLeft);
                }

                if (collider.getColor() == Color.CYAN) {
                    this.scoreCount += 2;
                    this.score.setLabel("Score: " + this.scoreCount);
                } else if (collider.getColor() == Color.GREEN) {
                    this.scoreCount += 5;
                    this.score.setLabel("Score: " + this.scoreCount);
                } else if (collider.getColor() == Color.YELLOW) {
                    this.scoreCount += 7;
                    this.score.setLabel("Score: " + this.scoreCount);
                } else if (collider.getColor() == Color.ORANGE) {
                    this.scoreCount += 10;
                    this.score.setLabel("Score: " + this.scoreCount);
                } else if (collider.getColor() == Color.RED) {
                    this.scoreCount += 10;
                    this.score.setLabel("Score: " + this.scoreCount);
                }

                if (this.bricksLeft < 1) {
                    GLabel winner = new GLabel("WINNER!", 200.0, 300.0);
                    winner.isVisible();
                    winner.setColor(Color.GREEN);
                    this.add(winner);
                    this.remove(this.ball);
                    this.pause(5000.0);
                    this.remove(winner);
                    this.setup();
                    this.waitForClick();
                    this.play();
                }

                this.remove(collider);
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

    public void mouseMoved(MouseEvent e) {
        if (e.getX() < this.getWidth() - 30 && e.getX() > 30) {
            this.paddle.setLocation((double)(e.getX() - 30), (double)(this.getHeight() - 30 - 10));
        }

    }
}
