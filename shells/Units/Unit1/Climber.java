// Trip Cubbison 9/8/23

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Athlete
{
   public Climber()
    {
       super();
       
    }
    
  public Climber(int x)
   {
      super(8, 1, Display.NORTH, 1);
   }

    
   public void climbLeftdown()
   {
      turnLeft();
      move();
      turnRight();
      
   }
   
     public void climbright()
   {  turnRight();
      move();
   }

      public void climbUpLeft()
   {
      turnLeft();
      move();
      move();
   }
   
     public void ClimbDownLeft()
   {  move();
      move();
      turnLeft();
   }
   
   public void ClimbDownRight()
   {  move();
      move();
      turnRight();
   }

   public void ClimbUpRight()  
   { turnRight();
      move();
      move();
      
   }


}
