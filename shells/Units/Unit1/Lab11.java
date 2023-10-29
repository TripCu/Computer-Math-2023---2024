import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import edu.fcps.Digit;
public class Lab11
{  
   public static void main(String[] args) 
   {
      Display.setSize(42, 37);
      Display.setSpeed(10);
      
      Digit first = new One_1(1, 9);
      Digit second = new Zero(10, 9);
      Digit third = new Six(17, 9);
      Digit fourth = new Zero(24, 9);
      Digit fifth = new Zero(31, 9);
      Digit sixth = new Zero(38, 9);
      Digit seventh = new Nine(38, 18);
      
      first.display();
      second.display();
      third.display();
      fourth.display();
      fifth.display();
      sixth.display();
      seventh.display();
   }
}
