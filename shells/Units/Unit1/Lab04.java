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
      
      a.move();
      a.turnLeft();
      a.move();
      a.turnLeft();
      a.turnLeft();
      
      b.move2();
      b.turnRight();
      
      c.move2();
      c.move();
      c.turnRight();
      
      e.move2();
      e.move2();
      e.turnRight();

      f.move2();
      f.move2();
      
      f.move();
      f.turnLeft();
      f.move();
      f.turnLeft();
      f.turnLeft();
      
      
      
      }
}