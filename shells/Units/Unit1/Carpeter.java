import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Carpeter extends Robot implements Workable
{
   public Carpeter(int x, int y)
   {
      super(x, y, Display.EAST, Display.INFINITY);
   }
   public Carpeter()
   {
      super(2, 2, Display.EAST, Display.INFINITY);
   }
   public void workCorner()
   {
      while(!nextToABeeper())
      {
         putBeeper();
      }
   }
   public void moveOneBlock()
   {
      move();
      while(!nextToABeeper())
      {
         putBeeper();
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