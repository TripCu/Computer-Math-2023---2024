import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Carpeter extends Robot implements Workable {

   // Constructors
   public Carpeter(int x, int y) {
      super(x, y, Display.EAST, Display.INFINITY);
   }

   public Carpeter() {
      super(2, 2, Display.EAST, Display.INFINITY);
   }

   // Method to place a beeper in the current corner until a beeper is present
   public void workCorner() {
      while (!nextToABeeper()) {
         putBeeper();
      }
   }

   // Method to move one block and place a beeper until a beeper is present
   public void moveOneBlock() {
      move();
      while (!nextToABeeper()) {
         putBeeper();
      }
   }

   // Method to turn the robot to the right
   public void turnToTheRight() {
      for (int i = 0; i < 3; i++) {
         turnLeft();
      }
   }

   // Method to turn the robot to face North
   public void turnToTheNorth() {
      if (!facingNorth()) {
         turnLeft();
      }
   }
}
