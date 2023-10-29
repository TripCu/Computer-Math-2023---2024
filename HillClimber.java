import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class HillClimber extends Climber 
{
   public HillClimber()
  {
   super(8, 1, Display.NORTH, 1);
  }
   public HillClimber(int x, int y, int dir, int beep)
  {
   super(x, y, dir, beep);
  }
  
   public void climbUpLeft()
  {
   turnRight();
   move();
   turnLeft();
   move();
   move();
  }
  
   public void climbDownLeft()
  {
   move();
   move();
   turnLeft();
   move();
   turnRight();
  }
  
   public void climbUpRight()
  {
   turnLeft();
   move();
   turnRight();
   move();
   move();
  }
  
   public void climbDownRight()
  {
   move();
   move();
   turnRight();
   move();
   turnLeft();
  }
  
}