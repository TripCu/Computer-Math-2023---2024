package Lab01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class FancyHouse extends JFrame {
    private int xPosition = 0;
    private Color houseColor;
    private List<Point> cloudPositions;

    public FancyHouse() {
        setTitle("Fancy Side-Scrolling House");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cloudPositions = new ArrayList<>();
        cloudPositions.add(new Point(50, 50));
        cloudPositions.add(new Point(300, 100));
        cloudPositions.add(new Point(500, 30));

        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xPosition += 1;
                if (xPosition > getWidth()) {
                    xPosition = -200;
                    houseColor = getRandomColor();
                }
                repaint();
            }
        });

        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        BufferedImage buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = buffer.createGraphics();

        // Draw background gradient
        Color color1 = new Color(135, 206, 250); // Light blue color
        Color color2 = new Color(255, 255, 255); // White color
        GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw clouds
        for (Point cloudPosition : cloudPositions) {
            drawCloud(g2d, xPosition + cloudPosition.x, cloudPosition.y);
        }

        // Draw ground
        g2d.setColor(new Color(34, 139, 34)); // Forest green color
        g2d.fillRect(0, getHeight() - 50, getWidth(), 50);

        // Draw house
        g2d.setColor(houseColor);
        g2d.fillRect(xPosition + 100, getHeight() - 200, 200, 150);

        // Draw roof
        int[] xPoints = {xPosition + 100, xPosition + 200, xPosition + 300};
        int[] yPoints = {getHeight() - 200, getHeight() - 250, getHeight() - 200};
        g2d.setColor(new Color(210, 105, 30)); // Chocolate color
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Draw door
        g2d.setColor(new Color(139, 69, 19)); // Saddle brown color
        g2d.fillRect(xPosition + 180, getHeight() - 120, 40, 70);

        // Draw window
        g2d.setColor(new Color(173, 216, 230)); // Light blue color
        g2d.fillRect(xPosition + 250, getHeight() - 150, 50, 50);

        // Draw the buffered image onto the screen
        g.drawImage(buffer, 0, 0, this);
    }

    private void drawCloud(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 50, 30);
        g.fillOval(x + 20, y - 10, 50, 30);
        g.fillOval(x + 40, y, 50, 30);
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FancyHouse fancyHouse = new FancyHouse();
            fancyHouse.setVisible(true);
        });
    }
}
