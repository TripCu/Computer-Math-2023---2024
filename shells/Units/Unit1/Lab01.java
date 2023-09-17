//Trip 8-29-2023
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot; 

   public class Lab01
   { 
     public static void main(String[] args)
      {
         Display.openWorld("maps/school.map");
         Display.setSize(10, 10);
         Display.setSpeed(5);
         
         Robot pete = new Robot(4, 5, Display.SOUTH, 0);
         Robot lisa = new Robot();
               
         // code for lisa to pikc up beeper       
         lisa.move();
         lisa.move();
         lisa.turnLeft();
         lisa.move();
         lisa.turnLeft();
         lisa.move();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.pickBeeper();
         
         //code to give beeper to pete
         lisa.move();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.move();
         lisa.turnLeft();
         lisa.move();
         lisa.move();
         lisa.move();
         lisa.turnLeft();
         lisa.move();
         lisa.move();
         lisa.move();
         lisa.turnLeft();
         lisa.move();
         lisa.move();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.move();
         //transfering the beeper
         lisa.putBeeper();
         pete.pickBeeper();
         pete.move();
         //pete moving the beeper
         pete.turnLeft();
         pete.move();
         pete.move();
         pete.turnLeft();
         pete.move();
         pete.move();
         pete.turnLeft();
         pete.turnLeft();
         pete.turnLeft();
         pete.move();
         pete.move();
         pete.turnLeft();
         pete.move();
         pete.turnLeft();
         pete.move();
         pete.move();
         pete.turnLeft();
         pete.turnLeft();
         pete.turnLeft();
         pete.move();
         pete.move();
         pete.turnLeft();
         pete.move();
         pete.move();
         //placing the beeper
         pete.putBeeper();
         //moveing pete in to place 
         pete.turnLeft();
         pete.turnLeft();
         pete.move();
         
         

         
         
         

         
        
      }
     }   

      
