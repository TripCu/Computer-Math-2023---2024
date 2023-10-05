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
   
   public static void coachpostion(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
   }

   public static void main(String[] args)
   {  Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      Athlete a = new Athlete();
      Athlete b = new Athlete();
      Athlete c = new Athlete();
      Athlete d = new Athlete();
      Athlete e = new Athlete();
      Athlete f = new Athlete();
      Athlete coach = new Athlete();
      
      //athletes take the field
      takeTheField(a);
      takeTheField(b);
      takeTheField(c);
      takeTheField(d);
      takeTheField(e);
      takeTheField(f);
      
   
   coachpostion(coach);
   
   
      for (int i = 0; i < 2; i++) {
         a.move();
         a.turnLeft();
      }
      a.turnLeft();
      
      
      for (int i = 0; i < 2; i++) {
         b.move();
      }
      b.turnRight();
      
      
      for (int i = 0; i < 3; i++) {
         c.move();
      }
      c.turnRight();
      
      for (int i = 0; i < 4; i++) {
         e.move();
      }
      e.turnRight();
      
      for (int i = 0; i < 5; i++) {
         d.move();
      }
      d.turnLeft();
      d.move();
      d.turnLeft();
      d.turnLeft();
      
      //goalie moves to goal
      for (int i = 0; i < 3; i++) {
         f.move();
      }
      
      f.turnLeft();
      
      for (int i = 0; i < 2; i++) {
         f.move();
      }
      f.turnLeft();      
      f.turnLeft();  
      
      
   }
}