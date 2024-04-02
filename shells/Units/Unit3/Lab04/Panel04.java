package Lab04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel04 extends JPanel {
    private Odometer odometer;

    public Panel04() {
        this.setLayout(new FlowLayout());
        this.odometer = new Odometer();
        this.add(this.odometer);
        JButton button = new JButton("Step");
        button.addActionListener(new Listener());
        this.add(button);
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            Panel04.this.odometer.update();
        }
    }
}
