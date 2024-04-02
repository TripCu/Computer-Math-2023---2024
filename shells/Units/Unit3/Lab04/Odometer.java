package Lab04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Odometer extends JPanel {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private int total;

    public Odometer() {
        // Set the layout of the panel to FlowLayout
        this.setLayout(new FlowLayout());
        // Set the background color of the panel to black
        this.setBackground(Color.black);
        // Create a new font object
        Font f = new Font("Serif", 1, 30);
        // Initialize total to 0
        this.total = 0;
        // Initialize label1 and set its font and color
        this.label1 = new JLabel("0");
        this.label1.setFont(f);
        this.label1.setForeground(Color.white);
        // Add label1 to the panel
        this.add(this.label1);
        // Initialize label2 and set its font and color
        this.label2 = new JLabel("0");
        this.label2.setFont(f);
        this.label2.setForeground(Color.white);
        // Add label2 to the panel
        this.add(this.label2);
        // Initialize label3 and set its font, color, and background
        this.label3 = new JLabel("0");
        this.label3.setFont(f);
        this.label3.setForeground(Color.black);
        this.label3.setBackground(Color.white);
        this.label3.setOpaque(true);
        // Add label3 to the panel
        this.add(this.label3);
    }

    public void update() {
        // Increment total
        ++this.total;
        // Update the text of label3, label2, and label1 based on the value of total
        this.label3.setText("" + this.total % 10);
        this.label2.setText("" + this.total % 100 / 10);
        this.label1.setText("" + this.total % 1000 / 100);
    }
}