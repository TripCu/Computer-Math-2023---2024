package Lab07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel07 extends JPanel {
    private Display07 display;

    public Panel07() {
        // Set the layout of the panel to FlowLayout
        this.setLayout(new FlowLayout());
        // Initialize display and add it to the panel
        this.display = new Display07();
        this.add(this.display);
        // Create a new button, add an action listener to it, and add it to the panel
        JButton button1 = new JButton("GCD");
        button1.addActionListener(new Listener1());
        this.add(button1);
        // Create another button, add an action listener to it, and add it to the panel
        JButton button2 = new JButton("LCM");
        button2.addActionListener(new Listener2());
        this.add(button2);
    }

    // Listener2: Calls the showLCM method of display when the "LCM" button is clicked
    private class Listener2 implements ActionListener {
        private Listener2() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel07.this.display.showLCM();
        }
    }

    // Listener1: Calls the showGCD method of display when the "GCD" button is clicked
    private class Listener1 implements ActionListener {
        private Listener1() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel07.this.display.showGCD();
        }
    }
}