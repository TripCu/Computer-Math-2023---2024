import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;  
  
  
  public class Lab04
{
   
   public static void main(String[] args)
   {  Display.openWorld("shuttle/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      Racer a = new Racer();
      Racer b = new Racer();
      Racer c = new Racer();
      