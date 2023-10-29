import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Harvester extends Robot implements Workable {
   
   // Constructors
   public Harvester(int x, int y) {
      super(x, y, Display.EAST, 0);
   }
   
   public Harvester() {
      super(2, 2, Display.EAST, 0);
   }

   // Method to pick up all beepers in the current corner
   public void workCorner() {
      while (nextToABeeper()) {
         pickBeeper();
      }
   }

   // Method to move one block while picking up beepers along the way
   public void moveOneBlock() {
      move();
      while (nextToABeeper()) {
         pickBeeper();
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
