//Thomas 8/31/23
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class StepClimber extends Climber
{
   public StepClimber()
   {
      super();
   }
   public StepClimber(int x)
   {
      super(x);
   }
   public void climbUpRight()
   {
   turnLeft();
   move();
   turnRight();
   move();
   }
   public void climbDownRight()
   {
   move();
   turnRight();
   move();
   turnLeft();
   }
   public void climbUpLeft()
   {
   turnRight();
   move();
   turnLeft();
   move();
   }
   public void climbDownLeft()
   {
   move();
   turnLeft();
   move();
   turnRight();
   }
}