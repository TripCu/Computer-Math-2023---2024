// 9/6/2023 Trip cubbison
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
public class Lab02
{ 
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      Athlete fred = new Athlete();
      
      
      fred.putAndMove();
      fred.turnRight();
      fred.putAndMove();
      fred.turnRight();
      fred.putAndMove();
      fred.turnLeft();
      fred.putAndMove();
      fred.turnLeft();
      fred.putAndMove();
      fred.turnRight();
      fred.putAndMove();
      fred.putAndMove();
      fred.turnRight();
      fred.putAndMove();
      fred.turnLeft();
      fred.putAndMove();
      fred.turnLeft();
      fred.putAndMove4();
      fred.turnRight();
      fred.putAndMove2();
   
      
   
      
     
   }
}   

