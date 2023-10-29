import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Harvester extends Robot implements Workable
{
   public Harvester(int x, int y)
   {
      super(x, y, Display.EAST, 0);
   }
   public Harvester()
   {
      super(2, 2, Display.EAST, 0);
   }
   public void workCorner()
   {
     while(nextToABeeper())
      {
         pickBeeper();
      }
   }
   public void moveOneBlock()
   {
      move();
      while(nextToABeeper())
      {
         pickBeeper();
      }
   }
   public void turnToTheRight()
   {
      for (int i = 0; i < 3; i++) {
         turnLeft();
      }
   }
   public void turnToTheNorth()
   {
      if(!facingNorth())
      {
         turnLeft();
      }
   }
}