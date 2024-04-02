package Lab05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel05 extends JPanel {
    private Display05 displayPanel;
    private Timer time;
    private JButton repeatedRunButton;

    public Panel05() {
        // Set the layout of the panel to FlowLayout
        this.setLayout(new FlowLayout());
        // Initialize displayPanel and add it to the panel
        this.displayPanel = new Display05();
        this.add(this.displayPanel);
        // Create a new button, add an action listener to it, and add it to the panel
        JButton pressYourLuckButton = new JButton("Press Your Luck");
        pressYourLuckButton.addActionListener(new UpdateListener());
        this.add(pressYourLuckButton);
        // Initialize repeatedRunButton, add an action listener to it, and add it to the panel
        this.repeatedRunButton = new JButton("Run Repeatedly");
        this.repeatedRunButton.addActionListener(new TimerListener());
        this.add(this.repeatedRunButton);
        // Initialize time with a delay of 500 milliseconds and an action listener
        this.time = new Timer(500, new UpdateListener());
    }

    // TimerListener: Starts or stops the timer when the "Run Repeatedly" button is clicked
    private class TimerListener implements ActionListener {
        private TimerListener() {
        }

        public void actionPerformed(ActionEvent e) {
            if (Panel05.this.time.isRunning()) {
                // If the timer is running, stop it and update the text of repeatedRunButton
                Panel05.this.time.stop();
                Panel05.this.repeatedRunButton.setText("Start Again");
            } else {
                // If the timer is not running, start it and update the text of repeatedRunButton
                Panel05.this.time.start();
                Panel05.this.repeatedRunButton.setText("Pause Run");
            }
        }
    }

    // UpdateListener: Updates displayPanel when an action is performed
    private class UpdateListener implements ActionListener {
        private UpdateListener() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel05.this.displayPanel.update();
        }
    }
}