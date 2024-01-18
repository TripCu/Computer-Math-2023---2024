package Lab16;
import javax.swing.JFrame;

public class Driver16 {
    public Driver16() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab16");
        frame.setSize(408, 438);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
