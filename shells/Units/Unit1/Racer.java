import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 

public class Racer extends Athlete
{
   public Racer(int y)
   {
      super(1, y, Display.EAST,
         Display.INFINITY);
   }
   public void jumpRight()
   {
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
   }
   public void jumpLeft()
   {
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();
   }

   public void sprint(int n)
   {
      for(int k=1; k <= n; k++)
         move();
   }
   public void put(int n)
   {
   
   }
   public void pick(int n)
   {
   
   }
   public void shuttle(int spaces,
   int beepers)
   
   {
   
   }

}