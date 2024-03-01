package Lab00;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel00 extends JPanel {
    private JLabel label;

    public Panel00() {
        this.setLayout(new FlowLayout());
        this.label = new JLabel("0.0000000000000000");
        this.label.setFont(new Font("Serif", 1, 20));
        this.label.setForeground(Color.blue);
        this.add(this.label);
        JButton button = new JButton("Random");
        button.addActionListener(new Listener());
        this.add(button);
    }

    private class Listener implements ActionListener {
        private Listener() {
        }

        public void actionPerformed(ActionEvent e) {
            double x = Math.random();
            Panel00.this.label.setText("" + x);
        }
    }
}
