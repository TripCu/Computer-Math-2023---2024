package Lab04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel04 extends JPanel {
    private Odometer odometer;

    public Panel04() {
        // Set the layout of the panel to FlowLayout
        this.setLayout(new FlowLayout());
        // Initialize odometer
        this.odometer = new Odometer();
        // Add odometer to the panel
        this.add(this.odometer);
        // Create a new button and add an action listener to it
        JButton button = new JButton("Step");
        button.addActionListener(new Listener());
        // Add the button to the panel
        this.add(button);
    }

    // Listener: Updates the odometer when the "Step" button is clicked
    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel04.this.odometer.update();
        }
    }
}