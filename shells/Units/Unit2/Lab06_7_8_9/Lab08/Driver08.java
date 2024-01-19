package Lab06_7_8_9.Lab08;
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {


         JFrame frame = new JFrame("Flower Turtle");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(3);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         FlowerTurtle smidge = new FlowerTurtle(60.0, 50.0, Color.PINK);
         FlowerTurtle lisa = new FlowerTurtle(175.0, 50.0, Color.BLACK);
         FlowerTurtle2 pete = new FlowerTurtle2();
         FlowerTurtle mary = new FlowerTurtle(425.0, 50.0, Color.BLUE);
         smidge.drawShape();
         lisa.drawShape();
         pete.drawShape();
         mary.drawShape();
      
      }
   }