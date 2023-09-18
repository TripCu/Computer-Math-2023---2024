//9/17/2023 Trip cubbison
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
  public class Lab04
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   public static void main(String[] args)
   {  Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(5);
      
      Athlete fred = new Athlete();
      
      
      }
}