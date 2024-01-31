package Pong;

import java.awt.*;

public class Paddle {

    private final int height;
    private final int x;
    private int y;
    private final int speed;
    private int oscillateTowards;
    private final Color color;

    static final int PADDLE_WIDTH = 15;

    public Paddle(int x, int y, int height, int speed, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed*2;
        this.color = color;
        this.oscillateTowards = 0;
    }

    public void paint(Graphics g){

        //set brush color to whatever this paddle's color is
        g.setColor(color);
        //paint the rectangle, starting in the upper left corner at x, y
        g.fillRect(x, y, PADDLE_WIDTH, height);

    }


    public void moveTowards(int moveToY) {
        int centerY = y + height / 2;
        if(Math.abs(centerY - moveToY) > speed){
            if(centerY > moveToY){
                y -= speed;
            }
            if(centerY < moveToY){
                y += speed;
            }
        }

    }

    public boolean checkCollision(Ball b){

        int rightX = x + PADDLE_WIDTH;
        int bottomY = y + height;
        if(b.getX() > (x - b.getSize()) && b.getX() < rightX){
            return b.getY() > y && b.getY() < bottomY;
        }
        return false;

    }

    public int getX(){
        return x;
    }

    public int getCenterY(){
        return y + height / 2;
    }
    public boolean isNear(int y, int tolerance){
        return Math.abs(getCenterY() - y) < tolerance;
    }



    public void oscillate(int top, int bottom, int detectedCollideY){
         if (getCenterY() > (detectedCollideY + top)) {
                oscillateTowards = 0;
            } else if (getCenterY() < (detectedCollideY - bottom)) {
                oscillateTowards = 10000;
            }
            moveTowards(oscillateTowards);
    }

    



}