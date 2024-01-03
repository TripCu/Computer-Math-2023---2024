package Lab03;

import javax.swing.JFrame;

public class Driver03 {
    public Driver03() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Webbing and Sunshine");
        frame.setSize(400, 400);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel03());
        frame.setVisible(true);
    }
}
