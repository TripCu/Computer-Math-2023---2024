import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09 {
   public static void main(String[] args) {
      // Prompt the user for the robot world filename
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      // Initialize the Karel world
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
   
      // Create the robot and place it in the starting position
      Athlete jeff = new Athlete(1, 1, Display.EAST, 0);
   
      // Initialize beeper piles
      int pile1 = 0;
      int pile2 = 0;
   
      // Move the robot until it finds a beeper
      while (!jeff.nextToABeeper()) {
         jeff.move();
      }
   
      for (int a = 1; a <= 4; a++) {
         // Collect beepers into pile1 and put beepers from pile2
         while (jeff.nextToABeeper()) {
            jeff.pickBeeper();
            pile1++;
         }
         while (pile2 > 0) {
            jeff.putBeeper();
            pile2--;
         }
      
         jeff.move();
      
         // Collect beepers into pile2 and put beepers from pile1
         while (jeff.nextToABeeper()) {
            jeff.pickBeeper();
            pile2++;
         }
         while (pile1 > 0) {
            jeff.putBeeper();
            pile1--;
         }
         jeff.move();
      }
   
      // Turn the robot around and move it to the starting position
      jeff.turnAround3();
      while (jeff.frontIsClear()) {
            jeff.move();
        }
        jeff.turnAround3();
   
   }
}
