
import javax.swing.JFrame;

public class Driver01 {
    public Driver01() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Build a House");
        frame.setSize(800, 800);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new  PanelStopInTheNameOfLove());
        frame.setVisible(true);
    }
}
