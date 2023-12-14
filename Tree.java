import javax.swing.*;
import java.awt.*;

public class ChristmasTree extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g);
        drawOrnaments(g);
    }

    private void drawTree(Graphics g) {
        g.setColor(new Color(34, 139, 34)); // Dark green color for the tree
        // Draw the tree
        int[] xPoints = {250, 150, 350};
        int[] yPoints = {100, 400, 400};
        g.fillPolygon(xPoints, yPoints, 3); // top part

        int[] xPoints2 = {250, 125, 375};
        int[] yPoints2 = {200, 450, 450};
        g.fillPolygon(xPoints2, yPoints2, 3); // middle part

        int[] xPoints3 = {250, 100, 400};
        int[] yPoints3 = {300, 500, 500};
        g.fillPolygon(xPoints3, yPoints3, 3); // bottom part

        // Draw the trunk
        g.setColor(new Color(139, 69, 19)); // Brown color for the trunk
        g.fillRect(225, 500, 50, 100);
    }

    private void drawOrnaments(Graphics g) {
        g.setColor(new Color(255, 215, 0)); // Gold color for ornaments
        // Draw a few ornaments
        g.fillOval(180, 350, 20, 20); // Ornament 1
        g.fillOval(300, 380, 20, 20); // Ornament 2
        g.fillOval(260, 450, 20, 20); // Ornament 3
        g.fillOval(220, 320, 20, 20); // Ornament 4
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Christmas Tree with Ornaments");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.add(new ChristmasTree());
        frame.setVisible(true);
    }
}