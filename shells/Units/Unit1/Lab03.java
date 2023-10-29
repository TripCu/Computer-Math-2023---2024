// 9/6/2023 Trip cubbison
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
public class Lab03
{ 

   public static void MoveRight(ClimberV1 arg)
   {
      arg.move();
      arg.turnRight();
   }
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(5);
      
      
      
      Climber a = new Climber(100);
      Climber b = new Climber(100);
     
   
      for (int i = 0; i < 3; i++) {
         a.climbrightV1();
         b.climbrightV1();
         a.climbUpLeft();
         b.climbUpLeft();
      }
      
      for (int i = 0; i < 2; i++) {
         a.ClimbUpRight();
         b.ClimbUpRight();
      }
      
      a.turnLeft();
      b.turnLeft();
      
      MoveRight(a);
      MoveRight(b);
      a.ClimbDownLeft();
      b.ClimbDownLeft();
      a.pickBeeper();
      a.turnLeft();
      b.turnLeft();
      a.ClimbDownLeft();
      b.ClimbDownLeft(); 
      MoveRight(a);
      MoveRight(b);
             
      for (int i = 0; i < 2; i++) {
         a.ClimbDownLeft();
         b.ClimbDownLeft();         
      }
      
      for (int i = 0; i < 3; i++) {
         a.ClimbDownRight(); 
         b.ClimbDownRight();        
      } 
      a.turnRight();
      b.turnRight();
      a.putBeeper();
   
      
     
   }
}   

