package Christmas_Tree_Compettion;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


class ChristmasTree extends JPanel {

    public static void main(String[] args) throws IOException {
        String batchFilePath = "C:\\Users\\wolfp\\OneDrive\\Documents\\GitHub\\Computer-Math-2023---2024\\shells\\Units\\Unit2\\Christmas_Tree_Compettion\\music.bat";
        Process process = Runtime.getRuntime().exec(batchFilePath);

        JFrame frame = new JFrame("Simple Christmas Tree with Ornaments");
        frame.setBackground(Color.BLUE);
        frame.setSize(500, 600);
        frame.add(new ChristmasTree());
        frame.setVisible(true);


    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawall(g);
    }

    private void drawall(Graphics g) {
        g.setColor(new Color(34, 139, 34)); // Dark green color for the tree
        // Draw the tree
        int[] xPoints = {250, 150, 350};
        int[] yPoints = {150, 400, 400}; // increased y value for the top point to make it less tall
        g.fillPolygon(xPoints, yPoints, 3); // top part

        int[] xPoints2 = {250, 135, 365};
        int[] yPoints2 = {200, 450, 450};
        g.fillPolygon(xPoints2, yPoints2, 3); // middle part

        int[] xPoints3 = {250, 100, 400};
        int[] yPoints3 = {300, 500, 500};
        g.fillPolygon(xPoints3, yPoints3, 3); // bottom part

        // Draw the trunk
        g.setColor(new Color(139, 69, 19)); // Brown color for the trunk
        g.fillRect(225, 500, 50, 100);

        g.setColor(new Color(224, 181, 28));
        g.fillOval(240, 200, 25, 25); // Ornament 1
        g.fillOval(215, 300, 25, 25); // Ornament 1
        g.fillOval(275, 380, 25, 25); // Ornament 2
        g.fillOval(200, 455, 25, 25); // Ornament 3
        g.fillOval(330, 455, 25, 25); // Ornament 4


    }
}