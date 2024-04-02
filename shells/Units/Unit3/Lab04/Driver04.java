package Lab04;

import javax.swing.JFrame;

public class Driver04 {
    public Driver04() {
    }

    public static void main(String[] args) {
        // Create a new JFrame with the title "Odometer"
        JFrame frame = new JFrame("Odometer");
        // Set the size of the frame to 125x125
        frame.setSize(125, 125);
        // Set the location of the frame on the screen to x=200, y=100
        frame.setLocation(200, 100);
        // Set the default close operation to EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(3);
        // Set the content pane of the frame to a new instance of Panel04
        frame.setContentPane(new Panel04());
        // Make the frame visible
        frame.setVisible(true);
    }
}