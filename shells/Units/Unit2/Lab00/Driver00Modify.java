package Lab00;

import javax.swing.*;

public class Driver00Modify
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame ("Panel00modify");
      frame.setSize(500, 500);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00modify());
      frame.setVisible(true); 
   }
}