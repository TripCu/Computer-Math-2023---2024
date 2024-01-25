package Lab02;

import javax.swing.*;

public class Driver02 {
    public Driver02() {
    }

    public static void main(String[] var0) {
        JFrame var1 = new JFrame("Our Fearless Leader");
        var1.setSize(400, 350);
        var1.setLocation(100, 50);
        var1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var1.setContentPane(new Panel02());
        var1.setVisible(true);
    }
}
