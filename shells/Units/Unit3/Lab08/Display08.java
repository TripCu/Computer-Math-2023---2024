package Lab08;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display08 extends JPanel {
   private JLabel label;
   private JTextField box1;
   private JTextField box2;
   private JTextField box3;

   public Display08() {
      // Set the layout of the panel to GridLayout with 4 rows and 2 columns
      this.setLayout(new GridLayout(4, 2));
      // Add a label for "Terms"
      this.add(new JLabel("Terms:", 4));
      // Initialize box1 for input of terms, set its horizontal alignment, and add it to the panel
      this.box1 = new JTextField("", 5);
      this.box1.setHorizontalAlignment(2);
      this.add(this.box1);
      // Add a label for "First"
      this.add(new JLabel("First:", 4));
      // Initialize box2 for input of first term, set its horizontal alignment, and add it to the panel
      this.box2 = new JTextField("", 5);
      this.box2.setHorizontalAlignment(2);
      this.add(this.box2);
      // Add a label for "Ratio"
      this.add(new JLabel("Ratio:", 4));
      // Initialize box3 for input of ratio, set its horizontal alignment, and add it to the panel
      this.box3 = new JTextField("", 5);
      this.box3.setHorizontalAlignment(2);
      this.add(this.box3);
      // Add a label for "Sum"
      this.add(new JLabel("Sum:", 4));
      // Initialize label for displaying the sum, set its font and color, and add it to the panel
      this.label = new JLabel("");
      this.label.setFont(new Font("Serif", 1, 20));
      this.label.setForeground(Color.blue);
      this.add(this.label);
   }

   public void sumFinite() {
      // Parse the text in box1, box2, and box3 as integers
      int n = Integer.parseInt(this.box1.getText());
      double a = Double.parseDouble(this.box2.getText());
      double r = Double.parseDouble(this.box3.getText());
      // Initialize sum and term
      double sum = 0.0;
      double term = a;
      // Calculate the sum of the geometric series
      for(int k = 1; k <= n; ++k) {
         sum += term;
         term *= r;
      }
      // Update the text of the label to the sum
      this.label.setText("" + sum);
   }

   public void sumInfinite() {
      // Parse the text in box2 and box3 as doubles
      double a = Double.parseDouble(this.box2.getText());
      double r = Double.parseDouble(this.box3.getText());
      // If the absolute value of r is less than 1, calculate the sum of the infinite geometric series
      if (Math.abs(r) < 1.0) {
         double sum = a / (1.0 - r);
         // Update the text of the label to the sum
         this.label.setText("" + sum);
      } else {
         // If the absolute value of r is not less than 1, update the text of the label to "NONE"
         this.label.setText("NONE");
      }
   }
}