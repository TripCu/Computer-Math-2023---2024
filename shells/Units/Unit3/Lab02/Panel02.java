package Lab02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel02 extends JPanel {
    private JLabel label;
    private double number;

    public Panel02() {
        this.setLayout(new FlowLayout());
        this.number = Math.random();
        this.label = new JLabel("" + this.number);
        this.label.setFont(new Font("Serif", 1, 50));
        this.label.setForeground(Color.blue);
        this.add(this.label);
        JButton button1 = new JButton("Random");
        button1.addActionListener(new Listener1());
        this.add(button1);
        JButton button2 = new JButton("Cube Root");
        button2.addActionListener(new Listener2());
        this.add(button2);
        JButton button3 = new JButton("Reciprocal");
        button3.addActionListener(new Listener3());
        this.add(button3);
        JButton button4 = new JButton("Quit");
        button4.addActionListener(new Listener4());
        this.add(button4);
    }

    private class Listener4 implements ActionListener {
        private Listener4() {
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class Listener3 implements ActionListener {
        private Listener3() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel02.this.number = 1.0 / Panel02.this.number;
            Panel02.this.label.setText("" + Panel02.this.number);
        }
    }

    private class Listener2 implements ActionListener {
        private Listener2() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel02.this.number = Math.pow(Panel02.this.number, 0.3333333333333333);
            Panel02.this.label.setText("" + Panel02.this.number);
        }
    }

    private class Listener1 implements ActionListener {
        private Listener1() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel02.this.number = Math.random();
            Panel02.this.label.setText("" + Panel02.this.number);
        }
    }
}