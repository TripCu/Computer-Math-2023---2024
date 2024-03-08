package Lab03;

import javax.swing.JFrame;

public class Driver03 {
    public Driver03() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hailstone Numbers");
        frame.setSize(300, 250);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel03());
        frame.setVisible(true);
    }
}
