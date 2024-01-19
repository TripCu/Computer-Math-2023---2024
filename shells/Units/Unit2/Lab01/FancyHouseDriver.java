package Lab01;

import javax.swing.*;

public class FancyHouseDriver {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FancyHouse fancyHouse = new FancyHouse();
            fancyHouse.setVisible(true);
        });
    }
}
