import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel06 extends JPanel {
   private Dice dice;
   private JLabel label;

   public Panel06() {
      // Set the layout of the panel to FlowLayout
      this.setLayout(new FlowLayout());
      // Initialize dice and add it to the panel
      this.dice = new Dice();
      this.add(this.dice);
      // Create a new button, add an action listener to it, and add it to the panel
      JButton button = new JButton("Roll");
      button.addActionListener(new Listener());
      this.add(button);
      // Initialize label, set its font and color, and add it to the panel
      this.label = new JLabel("");
      this.label.setFont(new Font("Serif", 3, 30));
      this.label.setForeground(Color.blue);
      this.add(this.label);
   }

   // Listener: Updates the label text when the "Roll" button is clicked
   private class Listener implements ActionListener {
      private Listener() {
      }

      public void actionPerformed(ActionEvent e) {
         // Roll the dice
         int d = Panel06.this.dice.roll();
         // If the dice roll is 7, update the label text to "Winner!"
         if (d == 7) {
            Panel06.this.label.setText("Winner!");
         } else {
            // If the dice roll is not 7, clear the label text
            Panel06.this.label.setText("");
         }
      }
   }
}