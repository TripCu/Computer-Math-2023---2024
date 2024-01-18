package Lab14;//


import javax.swing.JFrame;

public class Driver14 {
    public Driver14() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab14: Hit the Bumper");
        frame.setSize(400, 400);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new BumperPanel());
        frame.setVisible(true);
    }
}
