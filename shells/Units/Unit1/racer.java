import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 

public class Racer extends Athlete
 {
  public Racer(int y)
 {
 super(1, y, Display.EAST,
Display.INFINITY);
 }
 public void jumpRight()
 {
//pseudocode: tL, m, tR, m, tR, m, tL
 }
 public void jumpLeft()
 {
 }
 public void sprint(int n)
 {
 for(int k=1; k <= n; k++)
 move();
 }
 public void put(int n)
 {

 }
 public void pick(int n)
 {

 }
 public void shuttle(int spaces,
int beepers)

{

}

}