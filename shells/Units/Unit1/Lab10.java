import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab10 {
   
   // Method for the robot to follow the right wall
   public static void followWallsRight(Athlete arg) {
      if (!arg.rightIsClear()) {
         if (arg.frontIsClear()) {
            arg.move();
         } else {
            arg.turnLeft();
         }
      } else {
         arg.turnRight();
         arg.move();
      }
   }

   public static void main(String[] args) {
      String filename = JOptionPane.showInputDialog("What robot world?");
         
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
   
      Athlete mazerunner = new Athlete(1, 1, Display.NORTH, 0); 
      
      mazerunner.turnRight();
      while (!mazerunner.nextToABeeper()) {
         followWallsRight(mazerunner);
      }
   }
}
