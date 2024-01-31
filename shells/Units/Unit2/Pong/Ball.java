package Pong;

import java.awt.*;

public class Ball {

    static final int MAX_SPEED = 14;
    private int x;
    private int y;
    private int cx;
    private int cy;
    private int speed;
    private final int size;
    private final Color color;

    public Ball(int x, int y, int cx, int cy, int speed, Color color, int size) {
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public Ball(Ball b){
        this.x = b.x;
        this.y = b.y;
        this.cx = b.cx;
        this.cy = b.cy;
        this.speed = b.speed;
        this.color = Color.WHITE;
        this.size = b.size;
    }


    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, size, size);

    }
    public void moveBall(){
        x += cx;
        y += cy;
    }

    public void bounceOffEdges(int top, int bottom){

        //if the y value is at the bottom of the screen
        if (y > bottom - size){
            reverseY();
        }
        //if y value is at top of screen
        else if(y < top){
            reverseY();
        }

    }
    public void handleAllMovement(int top, int bottom){
        moveBall();
        bounceOffEdges(top, bottom);
    }

    public void handleAllMovement(int top, int bottom, Paddle userPaddle){
        moveBall();
        bounceOffEdges(top, bottom);
        if(x < userPaddle.getX() + Paddle.PADDLE_WIDTH){
            reverseX();
        }

    }
    public void reverseX(){
        cx *= -1;
    }
    public void reverseY(){
        cy *= -1;
    }
    public void increaseSpeed(){
        if(speed < MAX_SPEED){
            speed ++;
            cx = (cx / Math.abs(cx)*speed);
            cy = (cy / Math.abs(cy)*speed);


        }
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getSize(){
        return size;
    }

}