package Lab01;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel01 extends JPanel {
    private JLabel label;
    private JTextField box;

    public Panel01() {
        this.setLayout(new FlowLayout());
        this.box = new JTextField("0.0", 10);
        this.box.setHorizontalAlignment(4);
        this.add(this.box);
        JButton button = new JButton("SQRT");
        button.addActionListener(new Listener());
        this.add(button);
        this.label = new JLabel("0.0");
        this.label.setFont(new Font("Serif", 1, 20));
        this.label.setForeground(Color.blue);
        this.add(this.label);
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            double x = Double.parseDouble(Panel01.this.box.getText());
            double y = Math.sqrt(Math.abs(x));
            if (x >= 0.0) {
                Panel01.this.label.setText("" + y);
            } else {
                Panel01.this.label.setText(y + "i");
            }

        }
    }
}
