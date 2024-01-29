package Pong;
import java.awt.*;

public class Ball extends Polkadot
{
    private double dx;       // pixels to move each time step() is called.
    private double dy;
    // constructors
    public Ball()         //default constructor
    {
        super(200, 200, 50, Color.BLACK);
        dx = Math.random() * 12 - 6;          // to move horizontally
        dy = Math.random() * 12 - 6;          // to move vertically
    }
    public Ball(double x, double y, double dia, Color c)
    {
        super(x, y, dia, c);
        dx = Math.random()* 12 - 6;
        dy = Math.random() * 12 - 6;
    }

    //modifier methods
    public void setdx(double x)
    {
        dx = x;
    }
    public void setdy(double y)
    {
        dy = y;
    }

    //accessor methods
    public double getdx()
    {
        return dx;
    }
    public double getdy()
    {
        return dy;
    }

    //instance methods
    public void move(double rightEdge, double bottomEdge)
    {
        this.setX(this.getX() + this.dx);
        this.setY(this.getY() + this.dy);
        if (this.getX() >= rightEdge - this.getRadius()) {
            this.setX(rightEdge - this.getRadius());
            this.dx *= -1.0;
        } else if (this.getX() <= this.getRadius()) {
            this.setX(this.getRadius());
            this.dx *= -1.0;
        }

        if (this.getY() >= bottomEdge - this.getRadius()) {
            this.setY(bottomEdge - this.getRadius());
            this.dy *= -1.0;
        } else if (this.getY() <= this.getRadius()) {
            this.setY(this.getRadius());
            this.dy *= -1.0;
        }

    }
}