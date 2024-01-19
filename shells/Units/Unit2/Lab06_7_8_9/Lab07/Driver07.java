package Lab06_7_8_9.Lab07;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.JFrame;

public class Driver07 {
    public Driver07() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Polygon Turtles");
        frame.setSize(400, 400);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new TurtlePanel());
        frame.setVisible(true);
        Turtle.clear(Color.GREEN.brighter());
        PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
        smidge.setColor(Color.BLUE);
        smidge.drawShape();
        PolygonTurtle pete = new PolygonTurtle(100.0, 5);
        pete.drawShape();
        PolygonTurtle lisa = new PolygonTurtle(550.0, 225.0, 135.0, 1000.0, 8);
        lisa.setColor(Color.RED.darker());
        lisa.setSize(40.0);
        lisa.drawShape();
        lisa.setSize(30.0);
        lisa.drawShape();
        lisa.setSize(20.0);
        lisa.drawShape();
        lisa.setSize(10.0);
        lisa.drawShape();
        PolygonTurtle mary = new PolygonTurtle(115.0, 425.0, -45.0, 25.0, 6);
        mary.setColor(Color.BLUE.brighter());
        mary.setThickness(10);
        mary.drawShape();
        PolygonTurtle j = new PolygonTurtle(500.0, 500.0, 90.0, 100.0, 3);
        j.setColor(Color.YELLOW);

        for(int k = 3; k <= 8; ++k) {
            j.drawShape();
        }

    }
}
