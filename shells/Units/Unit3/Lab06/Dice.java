

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dice extends JPanel {
   private JLabel label1;
   private JLabel label2;

   public Dice() {
      // Set the layout of the panel to GridLayout with 1 row and 2 columns
      this.setLayout(new GridLayout(1, 2, 5, 5));
      // Initialize label1, set its icon, and add it to the panel
      this.label1 = new JLabel();
      this.label1.setIcon(new ImageIcon("Lab06/one.jpg"));
      this.add(this.label1);
      // Initialize label2, set its icon, and add it to the panel
      this.label2 = new JLabel();
      this.label2.setIcon(new ImageIcon("Lab06/one.jpg"));
      this.add(this.label2);
   }

   public int roll() {
      // Roll two dice and return the sum
      int a = this.rollOne(this.label1);
      int b = this.rollOne(this.label2);
      return a + b;
   }

   private int rollOne(JLabel label) {
    // Generate a random number between 1 and 6
    int x = (int)(Math.random() * 6.0 + 1.0);
    // Update the icon of the label based on the random number
    switch (x) {
        case 1:
            label.setIcon(new ImageIcon(getClass().getResource("one.jpg")));
            break;
        case 2:
            label.setIcon(new ImageIcon(getClass().getResource("two.jpg")));
            break;
        case 3:
            label.setIcon(new ImageIcon(getClass().getResource("three.jpg")));
            break;
        case 4:
            label.setIcon(new ImageIcon(getClass().getResource("four.jpg")));
            break;
        case 5:
            label.setIcon(new ImageIcon(getClass().getResource("five.jpg")));
            break;
        case 6:
            label.setIcon(new ImageIcon(getClass().getResource("six.jpg")));
    }

    // Return the random number
    return x;
}
}