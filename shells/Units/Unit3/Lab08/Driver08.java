package Lab08;

import javax.swing.JFrame;

public class Driver08 {
   public Driver08() {
   }

   public static void main(String[] args) {
      // Create a new JFrame with the title "Sum the Series"
      JFrame frame = new JFrame("Sum the Series");
      // Set the size of the frame to 200x200
      frame.setSize(200, 200);
      // Set the location of the frame on the screen to x=200, y=100
      frame.setLocation(200, 100);
      // Set the default close operation to EXIT_ON_CLOSE
      frame.setDefaultCloseOperation(3);
      // Set the content pane of the frame to a new instance of Panel08
      frame.setContentPane(new Panel08());
      // Make the frame visible
      frame.setVisible(true);
   }
}