import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09 {
   public static void main(String[] args) {
      String filename = JOptionPane.showInputDialog("What robot world?");
         
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
   
      Athlete robo = new Athlete(1, 1, Display.EAST, 0); 

      int pile1 = 0;
      int pile2 = 0;
      
      // Move the robot until it finds a beeper
      while (!robo.nextToABeeper()) {
         robo.move();
      }
      
      int a;
      for (a = 1; a <= 4; a++) {
         // Collect beepers into pile1 and put beepers from pile2
         while (robo.nextToABeeper()) {
            robo.pickBeeper();
            pile1++;
         }
         while (pile2 > 0) {
            robo.putBeeper();
            pile2--;
         }
      
         robo.move();
           
         // Collect beepers into pile2 and put beepers from pile1
         while (robo.nextToABeeper()) {
            robo.pickBeeper();
            pile2++;
         }
         while (pile1 > 0) {
            robo.putBeeper();
            pile1--;
         }
         robo.move();
      }
      
      // Turn the robot around and move it to the starting position
      robo.turnAround();
      while (robo.frontIsClear()) {
         robo.move();
      }
      robo.turnAround();
   }
}
