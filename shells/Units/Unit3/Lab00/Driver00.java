package Lab00;
import javax.swing.JFrame;

public class Driver00 {
    public Driver00() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Button");
        frame.setSize(200, 120);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new Panel00());
        frame.setVisible(true);
    }
}
