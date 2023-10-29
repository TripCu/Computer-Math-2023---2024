import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06p2 {
   public static void main(String[] args) {
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

   // Task 7: Move until a beeper or a wall is reached, and print the number of steps taken.
   public static void task_07() {  
      Robot r7 = new Robot(1, 1, Display.EAST, 0);
      int steps = 0;
      while (r7.frontIsClear() && !r7.nextToABeeper()) {
         r7.move();
         steps++;
      }
      System.out.println("Task 7: Took " + steps + " steps.");
   }

   // Task 8: Move until next to another robot and put down all beepers.
   public static void task_08() { 
      Robot r8 = new Robot(1, 2, Display.EAST, 5);
      Robot r8v = new Robot(6, 2, Display.EAST, 0);
      while (!r8.nextToARobot()) {
         r8.move();
      }
      while (r8.hasBeepers()) {
         r8.putBeeper();
      }
   }

   // Task 9: Put down 5 different piles, each with 4 beepers using definite loops.
   public static void task_09() {
      Robot r9 = new Robot(1, 3, Display.EAST, 20);
      for (int b = 1; b <= 5; b++) {
         for (int a = 1; a <= 4; a++) {
            r9.putBeeper();
         }
         r9.move();
      }
   }

   // Task 10: Fill gaps with a beeper and stop when reaching a wall.
   public static void task_10() {
      Robot r10 = new Robot(1, 4, Display.EAST, 10);
      while (r10.frontIsClear()) {
         while (r10.nextToABeeper()) {
            r10.move();
         }
         while (!r10.nextToABeeper()) {
            r10.putBeeper();
            r10.move();
         }
      }
   }

   // Task 11: Put down one beeper at each step while a wall is to the right.
   public static void task_11() {
      Robot r11 = new Robot(1, 5, Display.EAST, 10);
      while (!r11.rightIsClear()) {
         r11.putBeeper();
         r11.move();
      }
   }

   // Task 12: Go until there is a wall to the right and you are standing on a beeper.
   public static void task_12() {
      Robot r12 = new Robot(1, 6, Display.EAST, 0);
      while (!(r12.rightIsClear() && r12.nextToABeeper())) {
         r12.move();
      }
   }
}
