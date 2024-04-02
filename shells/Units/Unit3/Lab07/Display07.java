package Lab07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display07 extends JPanel {
   private JLabel label;
   private JTextField box1;
   private JTextField box2;

   public Display07() {
      // Set the layout of the panel to FlowLayout
      this.setLayout(new FlowLayout());
      // Set the preferred size of the panel to 200x125
      this.setPreferredSize(new Dimension(200, 125));
      // Create a new subpanel, set its layout, and add it to the main panel
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new FlowLayout());
      subpanel.add(new JLabel("One: "));
      // Initialize box1, set its horizontal alignment, and add it to the subpanel
      this.box1 = new JTextField("", 5);
      this.box1.setHorizontalAlignment(0);
      subpanel.add(this.box1);
      subpanel.add(new JLabel("Two: "));
      // Initialize box2, set its horizontal alignment, and add it to the subpanel
      this.box2 = new JTextField("", 5);
      this.box2.setHorizontalAlignment(0);
      subpanel.add(this.box2);
      // Add the subpanel to the main panel
      this.add(subpanel);
      // Initialize label, set its font and color, and add it to the main panel
      this.label = new JLabel("?");
      this.label.setFont(new Font("Serif", 1, 75));
      this.label.setForeground(Color.blue);
      this.add(this.label);
   }

   public void showGCD() {
      // Parse the text in box1 and box2 as integers
      int x = Integer.parseInt(this.box1.getText());
      int y = Integer.parseInt(this.box2.getText());
      // Calculate the greatest common divisor (GCD) of x and y
      int z = this.gcd(x, y);
      // Update the text of the label to the GCD
      this.label.setText("" + z);
   }

   public void showLCM() {
      // Parse the text in box1 and box2 as integers
      int x = Integer.parseInt(this.box1.getText());
      int y = Integer.parseInt(this.box2.getText());
      // Calculate the least common multiple (LCM) of x and y
      int z = x * y / this.gcd(x, y);
      // Update the text of the label to the LCM
      this.label.setText("" + z);
   }

   private int gcd(int a, int b) {
      // Calculate the greatest common divisor (GCD) of a and b
      int n;
      for(n = Math.min(Math.abs(a), Math.abs(b)); a % n != 0 || b % n != 0; --n) {
      }

      return n;
   }
}