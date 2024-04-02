package Lab07;

import javax.swing.JFrame;

public class Driver07 {
    public Driver07() {
    }

    public static void main(String[] args) {
        // Create a new JFrame with the title "GCD and LCM"
        JFrame frame = new JFrame("GCD and LCM");
        // Set the size of the frame to 220x200
        frame.setSize(220, 200);
        // Set the location of the frame on the screen to x=200, y=100
        frame.setLocation(200, 100);
        // Set the default close operation to EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(3);
        // Set the content pane of the frame to a new instance of Panel07
        frame.setContentPane(new Panel07());
        // Make the frame visible
        frame.setVisible(true);
    }
}