import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {
    public static void main(String[] args) {
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

    // Task 1: Move the robot until it finds a beeper
    public static void task_01() { 
        Robot robot1 = new Robot(1, 1, Display.EAST, 0);
        while (robot1.nextToABeeper()) {
            robot1.move();
        }
    }

    // Task 2: Move the robot until it doesn't find a beeper
    public static void task_02() { 
        Robot robot2 = new Robot(1, 2, Display.EAST, 0);
        while (!robot2.nextToABeeper()) {
            robot2.move();
        }
    }

    // Task 3: Move the robot while the path in front is clear
    public static void task_03() { 
        Robot robot3 = new Robot(1, 3, Display.EAST, 0);
        while (robot3.frontIsClear()) {
            robot3.move();
        }
    }

    // Task 4: Move the robot, picking up beepers, until an obstacle is encountered
    public static void task_04() { 
        Robot robot4 = new Robot(1, 4, Display.EAST, 0);
        while (robot4.frontIsClear()) {
            if (robot4.nextToABeeper()) {
                robot4.pickBeeper();
            }
            robot4.move();
        }
        while (robot4.nextToABeeper()) {
            robot4.pickBeeper();
        }
    }

    // Task 5: Move the robot, picking up beepers, until an obstacle is encountered
    public static void task_05() { 
        Robot robot5 = new Robot(1, 5, Display.EAST, 0);
        while (robot5.frontIsClear()) {
            while (robot5.nextToABeeper()) {
                robot5.pickBeeper();
            }
            robot5.move();
        }
        while (robot5.nextToABeeper()) {
            robot5.pickBeeper();
        }
    }

    // Task 6: Move the robot, skip one space, and then continue picking up beepers
    public static void task_06() {          
        Robot robot6 = new Robot(1, 6, Display.EAST, 0);
        while (robot6.nextToABeeper()) {
            robot6.move();
        }
        if (!robot6.nextToABeeper()) {
            robot6.move();
        }
        while (robot6.nextToABeeper()) {
            robot6.move();
        }
    }
}
