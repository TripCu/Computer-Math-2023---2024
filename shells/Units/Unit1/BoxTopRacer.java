import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class BoxTopRacer extends Racer {
    public BoxTopRacer(int y) {
        super(1);
    }

    // Method to make the racer jump left
    public void jumpLeft() {
        int up = 0;
        turnLeft();
        while (!rightIsClear()) {
            move();
            up++;
        }
        turnRight();
        move();
        while (!rightIsClear()) {
            move();
        }
        turnRight();
        for (int i = 1; i <= up; i++) {
            move();
        }
        turnLeft();
    }

    // Method to make the racer jump right
    public void jumpRight() {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }

    // Method to make the racer sprint a given number of spaces
    public void sprint(int n) {
        for (int k = 1; k <= n; k++) {
            move();
        }
    }

    // Method to make the racer pick a given number of beepers
    public void pick(int n) {
        for (int k = 1; k <= n; k++) {
            pickBeeper();
        }
    }

    // Method to make the racer put a given number of beepers
    public void put(int n) {
        for (int k = 1; k <= n; k++) {
            putBeeper();
        }
    }

    // Method to shuttle the racer forward, pick beepers, turn around, and put beepers
    public void shuttle(int spaces, int beepers) {
        move();
        jumpLeft();
        sprint(spaces);
        pick(beepers);
        turnAround();
        sprint(spaces);
        jumpRight();
        move();
        put(beepers);
        turnAround();
    }
}
