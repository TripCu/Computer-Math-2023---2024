   //Name______________________________ Date_____________
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
      
         task_01(); //go to the end of the row of beepers
         task_02(); //go to the beeper
         task_03(); //go to the wall
         task_04(); //go to the wall, pick up all the beepers (max one per pile)
         task_05(); //go to the wall, pick up all the beepers
         task_06(); //go to the end of the row of beepers, there is one gap
      }
       public static void task_01()	
      { //go to the end of the row of beepers
         Robot r1 = new Robot(1, 1, Display.EAST, 0);
         while(r1.nextToABeeper())
            r1.move();
      }
       public static void task_02()	
      { //go to the beeper
         Robot r2 = new Robot(1, 2, Display.EAST, 0);
      	while(!r2.nextToABeeper())
            r2.move();
      }
       public static void task_03()	
      { //go to the wall
         Robot r3 = new Robot(1, 3, Display.EAST, 0);
       while(r3.frontIsClear())
            r3.move();
      }
       public static void task_04()	
      { //go to the wall, picking up the single beepers 
         Robot r4 = new Robot(1, 4, Display.EAST, 0);
         while(r4.frontIsClear())
         {
            if(r4.nextToABeeper())
               r4.pickBeeper();
          
            r4.move();
         }
         //standing in  front of a wall
         while(r4.nextToABeeper())
            r4.pickBeeper();

      }
       public static void task_05()	
      { //go to the wall, picking up the piles of beepers
         Robot r5 = new Robot(1, 5, Display.EAST, 0);
         while(r5.frontIsClear())
         {
            while(r5.nextToABeeper())
               r5.pickBeeper();
          
            r5.move();
         }
         //standing in  front of a wall
         while(r5.nextToABeeper())
            r5.pickBeeper();

      }
       public static void task_06()
      { //go to the end of the row of beepers, there is one gap
         Robot r6 = new Robot(1, 6, Display.EAST, 0);
         while(r6.nextToABeeper())
         {
            r6.move();
         }
         if(!r6.nextToABeeper())
            r6.move();
         
         while(r6.nextToABeeper())
         r6.move();

      }
   }