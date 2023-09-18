//Trip 9-6-2023
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot; 
     public class Athlete extends Robot
   { 
       public Athlete()
      {
           super(1,  1, Display.NORTH, Display.INFINITY);
      }
       public Athlete(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);   
      }  
       public void turnAround()
      {
         turnLeft();
         turnLeft();
         turnLeft();
         turnLeft();
      
      
      }
       public void turnRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();
        
      
      }
       public void putAndMove()
      {
         putBeeper();
         move();
      
      }
       public void putAndMove2()
      {
         putBeeper();
         move();
         putBeeper();
         move();
      }

        public void putAndMove4()
      {
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         
        }
        
         public void turnAround2()
         {
            turnLeft();
            turnLeft();
            turnLeft();
         
         
         }
         
          public void move2()
         {
             move();
             move();
         
         
         }





      
      

    }   