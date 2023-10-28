//Trip Cubbison 
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
   
      task_01(); 
      task_02(); 
      task_03(); 
      task_04(); 
      task_05();
      task_06(); 
   }
   public static void task_01()	
   { 
      Robot Robot1 = new Robot(1, 1, Display.EAST, 0);
      while(Robot1.nextToABeeper())
         Robot1.move();
   }
   public static void task_02()	
   { 
      Robot Robot2 = new Robot(1, 2, Display.EAST, 0);
      while(!Robot2.nextToABeeper())
         Robot2.move();
   }
   public static void task_03()	
   { 
      Robot Robot3 = new Robot(1, 3, Display.EAST, 0);
      while(Robot3.frontIsClear())
         Robot3.move();
   }
   public static void task_04()	
   { 
      Robot Robot4 = new Robot(1, 4, Display.EAST, 0);
      while(Robot4.frontIsClear())
      {
         if(Robot4.nextToABeeper())
            Robot4.pickBeeper();
       
         Robot4.move();
      }
      while(Robot4.nextToABeeper())
         Robot4.pickBeeper();
   
   }
   public static void task_05()	
   { 
      Robot Robot5 = new Robot(1, 5, Display.EAST, 0);
      while(Robot5.frontIsClear())
      {
         while(Robot5.nextToABeeper())
            Robot5.pickBeeper();
       
         Robot5.move();
      }
      while(Robot5.nextToABeeper())
         Robot5.pickBeeper();
   
   }
   public static void task_06()
   {          
   Robot Robot6 = new Robot(1, 6, Display.EAST, 0);
      while(Robot6.nextToABeeper())
      {
         Robot6.move();
      }
      if(!Robot6.nextToABeeper())
         Robot6.move();
      
      while(Robot6.nextToABeeper())
         Robot6.move();
   
   }
}