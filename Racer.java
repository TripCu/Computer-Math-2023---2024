//Thomas Gibbs 9/18/23
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Racer extends Athlete
{
   public Racer(int y)
   {
      super(1, y, Display.EAST, Display.INFINITY);
   }
   public void jumpLeft()
   {
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
      turnLeft();
   }
   public void jumpRight()
   {
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();      
      
   }
   public void sprint(int n)
   {
      for(int k=1; k<= n; k++)
         move();
   }
   public void pick(int n)
   {
      for(int k=1; k<= n; k++)
       pickBeeper();
   }
   public void put(int n)
   {
      for(int k=1; k<= n; k++)
       putBeeper();
   }
   public void shuttle(int spaces, int beepers)
   {
   move();
   jumpLeft();
   sprint(spaces);
   pick(beepers);
   turnAround();
   sprint(spaces);
   jumpRight();
   move();
   put(beepers);
   turnAround();
   }
}