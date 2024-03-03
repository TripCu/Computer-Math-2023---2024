package Lab01;


import javax.swing.*;

public class Driver01 {
    public Driver01() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Button");
        frame.setSize(200, 120);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel01());
        frame.setVisible(true);
    }
}
