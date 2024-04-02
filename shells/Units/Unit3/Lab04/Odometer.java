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
        this.setLayout(new FlowLayout());
        this.setBackground(Color.black);
        Font f = new Font("Serif", 1, 30);
        this.total = 0;
        this.label1 = new JLabel("0");
        this.label1.setFont(f);
        this.label1.setForeground(Color.white);
        this.add(this.label1);
        this.label2 = new JLabel("0");
        this.label2.setFont(f);
        this.label2.setForeground(Color.white);
        this.add(this.label2);
        this.label3 = new JLabel("0");
        this.label3.setFont(f);
        this.label3.setForeground(Color.black);
        this.label3.setBackground(Color.white);
        this.label3.setOpaque(true);
        this.add(this.label3);
    }

    public void update() {
        ++this.total;
        this.label3.setText("" + this.total % 10);
        this.label2.setText("" + this.total % 100 / 10);
        this.label1.setText("" + this.total % 1000 / 100);
    }
}