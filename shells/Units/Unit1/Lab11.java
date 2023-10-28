//Thomas G 10/26/23

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import edu.fcps.Digit;
public class Lab11
{  
   public static void main(String[] args) 
   {
      Display.setSize(42, 37);
      Display.setSpeed(10);
      
      Digit first = new Eight(1, 9);
      Digit second = new Nine(7, 9);
      Digit third = new Six(13, 9);
      Digit fourth = new One(19, 9);
      Digit fifth = new Seven(25, 9);
      Digit sixth = new Zero(31, 9);
      
      first.display();
      second.display();
      third.display();
      fourth.display();
      fifth.display();
      sixth.display();
   }
}
