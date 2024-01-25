package Lab06_7_8_9.Lab07;//
import edu.fcps.Turtle;

public class PolygonTurtle extends Turtle {
    private double mySize;
    private int mySides;

    public PolygonTurtle() {
        this.mySize = 50.0;
        this.mySides = 6;
    }

    public PolygonTurtle(double n, int s) {
        this.mySize = n;
        this.mySides = s;
    }

    public PolygonTurtle(double x, double y, double h, double n, int s) {
        super(x, y, h);
        this.mySize = n;
        this.mySides = s;
    }

    public void setSize(double n) {
        this.mySize = n;
    }

    public void setSides(int s) {
        this.mySides = s;
    }

    public void drawShape() {
        for(int k = 1; k <= this.mySides; ++k) {
            this.forward(this.mySize);
            this.turnLeft(360.0 / (double)this.mySides);
        }

    }

    public void drawShape(int s) {
        this.mySides = s;

        for(int k = 1; k <= this.mySides; ++k) {
            this.forward(this.mySize);
            this.turnLeft(360.0 / (double)this.mySides);
        }

    }

    public void star() {
        for(int k = 1; k <= this.mySides; ++k) {
            this.forward(this.mySize);
            this.turnLeft(1080.0 / (double)this.mySides);
        }

    }
}
