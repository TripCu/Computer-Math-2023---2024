   //Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06p2
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      task_07(); 
      task_08(); 
      task_09(); 
      task_10(); 
      task_11(); 
      task_12(); 
   }
   public static void task_07()	
   {  
      Robot r7 = new Robot(1, 1, Display.EAST, 0);
      int steps = 0;
      while(r7.frontIsClear() && !r7.nextToABeeper())
      {
         r7.move();
         steps++;
      }
      System.out.println("Took "+ steps +" steps.");
   }
   public static void task_08()	
   { //go until you are next to another robot, then put all your beepers down.
      Robot r8 = new Robot(1, 2, Display.EAST, 5);
      Robot r8v = new Robot(6, 2, Display.EAST, 0);
      while(!r8.nextToARobot())
      {
         r8.move();
      }
      while(r8.hasBeepers())
         r8.putBeeper();
      
   }
   public static void task_09()	
   { //put down 5 different piles with 4 beepers in each pile. Use definite loops.
      Robot r9 = new Robot(1, 3, Display.EAST, 20);
      int b;
      for(b=1; b<=5; b++)
      {
         int a;
         for(a=1; a<=4; a++)
         {
            r9.putBeeper();
         }
         r9.move();
      }
   }   
   public static void task_10()	
   { //fill in gaps with a beeper. Stop when you reach a wall.
      Robot r10 = new Robot(1, 4, Display.EAST, 10);
      while(r10.frontIsClear())
      {
         while(r10.nextToABeeper())
         {
            r10.move();
         }
         while(!r10.nextToABeeper())
         {
            r10.putBeeper();
            r10.move();
         }
      }
   }
   public static void task_11()	
   { //while there is a wall to your right, put down one beeper at each step
      Robot r11 = new Robot(1, 5, Display.EAST, 10);
      while(!r11.rightIsClear())
      {
         r11.putBeeper();
         r11.move();
      }
   }
   public static void task_12()
   {//go until there is a wall to your right and you are standing on a beeper
      Robot r12 = new Robot(1, 6, Display.EAST, 0);
      while(!  (   !r12.rightIsClear() && r12.nextToABeeper()))
      {
         r12.move();
      }
   
   }
}