package Pong;// Name: 				Date:

import Lab14.Ball;

import java.awt.*;

public class Bumper
{
   private int myX;
   private int myY;
   private int myXWidth;
   private int myYWidth;
   private Color myColor;
   public Bumper()         //default constructor
  {
      this.myX = 200;
      this.myY = 200;
      this.myXWidth = 25;
      this.myYWidth = 50;
      this.myColor = Color.BLUE;
  }
   public Bumper(int x, int y, int xWidth, int yWidth, Color c)
  {
      this.myX = x;
      this.myY = y;
      this.myXWidth = xWidth;
      this.myYWidth = yWidth;
      this.myColor = c;
  }

   public int getX() {
       return this.myX;
   }
   public int getY() {
       return this.myY;
   }
   public int getXWidth() {
       return this.myXWidth;
   }

   public int getYWidth() {
       return this.myYWidth;
   }

   public Color getColor() {
       return this.myColor;
   }

   public void setX(int x) {
       this.myX = x;
   }

   public void setY(int y) {
       this.myY = y;
   }

   public void setXWidth(int xWidth) {
       this.myXWidth = xWidth;
   }

   public void setYWidth(int yWidth) {
       this.myYWidth = yWidth;
   }

   public void setColor(Color c) {
       this.myColor = c;
   }
    public void jump(int rightEdge, int bottomEdge)
  {
      this.myX = (int)(Math.random() * (double)(rightEdge - this.myXWidth));
      this.myY = (int)(Math.random() * (double)(bottomEdge - this.myYWidth));
  }

   // draws a rectangular bumper on the buffer
   public void draw(Graphics myBuffer)
  {
      myBuffer.setColor(this.getColor());
      myBuffer.fillRect(this.getX(), this.getY(), this.getXWidth(), this.getYWidth());
  }
   // returns true if any part of the polkadot is inside the bumper
public boolean inBumper(Ball dot) {
    for(int x = this.getX(); x <= this.getX() + this.getXWidth(); ++x) {
        for(int y = this.getY(); y <= this.getY() + this.getYWidth(); ++y) {
            if (this.distance((double)x, (double)y, dot.getX(), dot.getY()) <= dot.getRadius()) {
                return true;
            }
        }
    }

    return false;
}

   private double distance(double x1, double y1, double x2, double y2) {
       return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
   }
}
