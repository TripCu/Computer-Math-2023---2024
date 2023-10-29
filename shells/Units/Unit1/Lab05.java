import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
public class Lab05
{
   public static void coachpostion(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.move();
   }
   
   public static void main(String[] args)
   {  Display.openWorld("maps/shuttle.map");
      Display.setSize(10,10); 
      Display.setSpeed(5);
      
      Racer mary = new Racer(7);
      Racer b = new Racer(4);
      Racer c = new Racer(1);
      
     

   }
}