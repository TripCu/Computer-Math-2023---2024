package Lab02;
import javax.swing.JFrame;

public class Driver02 {
    public Driver02() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Buttons");
        frame.setSize(500, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel02());
        frame.setVisible(true);
    }
}
