import javax.swing.JFrame;

public class Driver06 {
    public Driver06() {
    }

    public static void main(String[] args) {
        // Create a new JFrame with the title "Luck of the Roll"
        JFrame frame = new JFrame("Luck of the Roll");
        // Set the size of the frame to 225x200
        frame.setSize(225, 200);
        // Set the location of the frame on the screen to x=200, y=100
        frame.setLocation(200, 100);
        // Set the default close operation to EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(3);
        // Set the content pane of the frame to a new instance of Panel06
        frame.setContentPane(new Panel06());
        // Make the frame visible
        frame.setVisible(true);
    }
}