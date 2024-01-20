package Lab06_7_8_9.Lab06;

import edu.fcps.Turtle;

public class SquareTurtle extends Turtle {
    private double mySize;

    public SquareTurtle() {
        this.mySize = 10.0;
    }

    public SquareTurtle(double n) {
        this.mySize = n;
    }

    public SquareTurtle(double x, double y, double h) {
        super(x, y, h);
        this.mySize = 50.0;
    }

    public SquareTurtle(double x, double y, double h, double n) {
        super(x, y, h);
        this.mySize = n;
    }

    public void setSize(double n) {
        this.mySize = n;
    }

    public void drawShape() {
        for(int k = 1; k <= 4; ++k) {
            this.forward(this.mySize);
            this.turnLeft(90.0);
        }

    }
}
