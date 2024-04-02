package Lab05;

import javax.swing.*;
import java.awt.*;

public class Display05 extends JPanel {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private int value;
    private int total;
    private int max;

    public Display05() {
        // Set the layout of the panel to GridLayout with 3 rows and 1 column
        this.setLayout(new GridLayout(3, 1));
        // Create a new font object
        Font f = new Font("Serif", 1, 30);
        // Initialize total, value, and max to 0
        this.total = this.value = this.max = 0;
        // Initialize label1 and set its font and color
        this.label1 = new JLabel("Value: " + this.value);
        this.label1.setFont(f);
        this.label1.setForeground(Color.blue);
        // Add label1 to the panel
        this.add(this.label1);
        // Initialize label2 and set its font and color
        this.label2 = new JLabel("Total: " + this.total);
        this.label2.setFont(f);
        this.label2.setForeground(Color.blue);
        // Add label2 to the panel
        this.add(this.label2);
        // Initialize label3 and set its font and color
        this.label3 = new JLabel("High Score: " + this.max);
        this.label3.setFont(f);
        this.label3.setForeground(Color.blue);
        // Add label3 to the panel
        this.add(this.label3);
    }

    public void update() {
        // Generate a random number between 1 and 11 and assign it to value
        this.value = (int)(Math.random() * 11.0 + 1.0);
        // Update the text of label1
        this.label1.setText("Value: " + this.value);
        // If value is not 1 or 2, add it to total; otherwise, reset total to 0
        if (this.value != 1 && this.value != 2) {
            this.total += this.value;
        } else {
            this.total = 0;
        }
        // Update the text of label2
        this.label2.setText("Total: " + this.total);
        // If total is greater than max, update max and the text of label3
        if (this.total > this.max) {
            this.max = this.total;
            this.label3.setText("High Score: " + this.max);
        }
    }
}