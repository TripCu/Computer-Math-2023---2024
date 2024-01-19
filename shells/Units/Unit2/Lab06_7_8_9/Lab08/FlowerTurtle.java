package Lab06_7_8_9.Lab08;//

import edu.fcps.Turtle;
import java.awt.Color;

public class FlowerTurtle extends Turtle {
    private double mySize;
    private Color myColor;

    public FlowerTurtle() {
        this.mySize = 50.0;
        this.myColor = Color.RED;
    }

    public FlowerTurtle(double x, double n, Color c) {
        super(x, 300.0, 90.0);
        this.mySize = n;
        this.myColor = c;
    }

    public void setSize(double n) {
        this.mySize = n;
    }

    public void setColor(Color c) {
        this.myColor = c;
    }

    private void drawPetals() {
        super.setColor(this.myColor);

        for(int x = 1; x <= 30; ++x) {
            this.forward(this.mySize);
            this.back(this.mySize);
            this.turnLeft(12.0);
        }

        this.turnLeft(180.0);
        this.forward(this.mySize);
    }

    private void drawStem() {
        super.setColor(Color.GREEN.darker());
        double part = this.mySize / 2.0;
        this.forward(part * 2.0);
        this.turnLeft(135.0);
        this.forward(part * 2.0);
        this.back(part * 2.0);
        this.turnLeft(90.0);
        this.forward(part);
        this.back(part);
        this.turnLeft(135.0);
        this.forward(part);
    }

    public void drawShape() {
        this.drawPetals();
        this.drawStem();
    }
}
