import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class SteepleChaseRacer extends Racer {
    public SteepleChaseRacer(int y) {
        super(1);
    }

    // Method for the racer to perform a left steeplechase jump
    public void performLeftSteeplechaseJump() {
        int up = 0;
        turnLeft();
        while (!rightIsClear()) {
            move();
            up++;
        }
        turnRight();
        move();
        turnRight();
        for (int i = 1; i <= up; i++) {
            move();
        }
        turnLeft();
    }

    // Method for the racer to perform a right steeplechase jump
    public void performRightSteeplechaseJump() {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }

    // Method for the racer to sprint a given number of spaces
    public void sprint(int n) {
        for (int k = 1; k <= n; k++) {
            move();
        }
    }

    // Method for the racer to pick a given number of beepers
    public void pickBeepers(int n) {
        for (int k = 1; k <= n; k++) {
            pickBeeper();
        }
    }

    // Method for the racer to put a given number of beepers
    public void putBeepers(int n) {
        for (int k = 1; k <= n; k++) {
            putBeeper();
        }
    }

    // Method for the racer to shuttle forward, pick beepers, turn around, and put beepers
    public void shuttle(int spaces, int beepers) {
        move();
        performLeftSteeplechaseJump();
        sprint(spaces);
        pickBeepers(beepers);
        turnAround();
        sprint(spaces);
        performRightSteeplechaseJump();
        move();
        putBeepers(beepers);
        turnAround();
    }
}
