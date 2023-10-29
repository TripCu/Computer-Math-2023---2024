import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class SteepleChaseRacer extends Racer
{
   public SteepleChaseRacer(int y)
   {
      super(1);
   }
   public void jumpLeft()
   {
      int up = 0;
      turnLeft();
      while(!rightIsClear())
      {
         move();
         up++;
      }
      turnRight();
      move();
      turnRight();
      for(int i = 1; i <= up; i++)
      {
         move();
      }
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