import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09 {
    public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("What robot world?");
         
        // Initialize the world and robot
        Display.openWorld("maps/" + filename + ".map");
        Display.setSize(10, 10);
        Display.setSpeed(15);
   
        Athlete jeff = new Athlete(1, 1, Display.EAST, 0); 

        // Initialize two piles for beepers
        int pile1 = 0;
        int pile2 = 0;
      
        // Move the robot until it finds a beeper
        while (!jeff.nextToABeeper()) {
            jeff.move();
        }
      
        // Perform a series of actions four times
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
      
            // Move the robot forward
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
            
            // Move the robot forward for the next iteration
            jeff.move();
        }
      
        // Turn the robot around and move it to the starting position
        jeff.turnAround();
        while (jeff.frontIsClear()) {
            jeff.move();
        }
        jeff.turnAround();
   }
}
