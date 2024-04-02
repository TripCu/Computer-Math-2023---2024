package Lab05;

import javax.swing.JFrame;

public class Driver05 {
    public Driver05() {
    }

    public static void main(String[] args) {
        // Create a new JFrame with the title "Press Your Luck"
        JFrame frame = new JFrame("Press Your Luck");
        // Set the size of the frame to 300x250
        frame.setSize(300, 250);
        // Set the location of the frame on the screen to x=200, y=100
        frame.setLocation(200, 100);
        // Set the default close operation to EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(3);
        // Set the content pane of the frame to a new instance of Panel05
        frame.setContentPane(new Panel05());
        // Make the frame visible
        frame.setVisible(true);
    }
}