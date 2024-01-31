package Pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//This class must extend JPanel, so we can use paintComponent and implement MouseMotionListener to track mouse
public class PongGame extends JPanel implements MouseMotionListener {

    // Constants for window width and height, in case we want to change the
    // width/height later
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    private Ball gameBall, futureBall;
    private Paddle userPaddle, pcPaddle;
    private int userScore, pcScore;

    private int userMouseY;
    private int bounceCount;

    private int detectedCollideY;
    private boolean pcGotToTarget;
    private boolean pcAccidentalMiss;

    public PongGame() {

        gameBall = new Ball(300, 200, 3, 3, 3, Color.white, 10);
        futureBall = new Ball(gameBall);
        userPaddle = new Paddle(10, 200, 75, 3, Color.white);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.white);
        userMouseY = 0;
        userScore = 0;
        pcScore = 0;
        bounceCount = 0;
        detectedCollideY = -1;
        pcGotToTarget = false;
        pcAccidentalMiss = false;
        addMouseMotionListener(this);

    }

    public void reset() {

        gameBall = new Ball(320, 220, 3, 3, 3, Color.white, 10);
        userPaddle = new Paddle(10, 200, 75, 3, Color.white);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.white);
        bounceCount = 0;
        pcAccidentalMiss = false;

        futureBall = new Ball(gameBall);
        detectedCollideY = -1;
        pcGotToTarget = false;

    }


    public void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        gameBall.paint(g);

        userPaddle.paint(g);
        pcPaddle.paint(g);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score - User [ " + userScore + " ]   BOT [ " + pcScore + " ]", 200, 20);

    }

    public void gameLogic() {

        gameBall.handleAllMovement(0, WINDOW_HEIGHT);

        if (detectedCollideY == -1) {
            for (int i = 0; i < 10; i++) {
                futureBall.handleAllMovement(0, WINDOW_HEIGHT, userPaddle);
                if (futureBall.getX() > pcPaddle.getX()) {
                    detectedCollideY = futureBall.getY();
                    if (pcAccidentalMiss) {
                        detectedCollideY += 75;
                    }
                    break;
                }
            }
        }

        movePaddles();

        checkPaddleBounces();

        checkLosses();

    }

    private void movePaddles(){
        if (pcPaddle.isNear(detectedCollideY, 3) && !pcGotToTarget) {
            pcGotToTarget = true;
        }

        if (!pcGotToTarget) {
            pcPaddle.moveTowards(detectedCollideY);
        } else {
            pcPaddle.oscillate(10, 10, detectedCollideY);
        }
        userPaddle.moveTowards(userMouseY);
    }

    private void checkPaddleBounces(){
        if (userPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
            gameBall.setX(userPaddle.getX() + Paddle.PADDLE_WIDTH + 1);
            bounceCount++;
        }
        if (pcPaddle.checkCollision(gameBall)) {
            gameBall.reverseX();
            gameBall.setX(pcPaddle.getX() - 10);
            futureBall = new Ball(gameBall);
            detectedCollideY = -1;
            pcGotToTarget = false;
            bounceCount++;
            if ((int) (Math.random() * 3) == 0) {
                pcAccidentalMiss = true;
            }
        }

        if (bounceCount == 3) {
            bounceCount = 0;
            gameBall.increaseSpeed();
        }
    }

    private void checkLosses(){
        if (gameBall.getX() < 0) {
            pcScore++;
            reset();
        } else if (gameBall.getX() > WINDOW_WIDTH) {
            userScore++;
            reset();
        }
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        userMouseY = e.getY();

    }
}