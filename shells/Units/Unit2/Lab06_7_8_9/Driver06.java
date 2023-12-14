package Lab06_7_8_9;

import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.JFrame;

public class Driver06 {
    public Driver06() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Turtles");
        frame.setSize(400, 400);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new TurtlePanel());
        frame.setVisible(true);
        SquareTurtle smidge = new SquareTurtle();
        SquareTurtle pete = new SquareTurtle(100.0);
        SquareTurtle lisa = new SquareTurtle(600.0, 200.0, 135.0);
        SquareTurtle mary = new SquareTurtle(100.0, 300.0, 45.0, 25.0);
        Turtle.setCrawl(true);
        smidge.setColor(Color.BLUE);
        lisa.setColor(Color.RED.darker());
        mary.setColor(Color.BLUE.brighter());
        smidge.setThickness(6);
        mary.setThickness(10);
        smidge.drawShape();
        pete.drawShape();
        lisa.drawShape();
        lisa.setSize(40.0);
        lisa.drawShape();
        lisa.setSize(30.0);
        lisa.drawShape();
        lisa.setSize(20.0);
        lisa.drawShape();
        lisa.setSize(10.0);
        lisa.drawShape();
        mary.drawShape();
    }
}
