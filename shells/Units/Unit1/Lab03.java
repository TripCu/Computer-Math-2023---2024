// 9/6/2023 Trip cubbison
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
public class Lab03
{ 
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(5);
      
      Climber a = new Climber(100);
      Climber b = new Climber(100);
     
     

      a.climbrightV1();

      a.climbUpLeft();
      
      a.climbrightV1();
      
      a.climbUpLeft(); 
      
      a.climbrightV1();
      
      a.climbUpLeft();
      
      a.ClimbUpRight();
      
      a.ClimbUpRight();
      
      a.climbLeftdown();
      
      a.ClimbDownLeft();

      //pick up beeper 
      a.turnLeft();
      //addpickupbeeper 
      
      a.ClimbDownLeft();
      
      a.move();
      a.turnRight();
      
      a.ClimbDownLeft();
      
      
      a.ClimbDownLeft();

      
      a.ClimbDownRight();
      
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      
      a.turnRight();
      a.move();
      a.turnLeft();
      a.move();


      
      

      
   
      
     
   }
}   

