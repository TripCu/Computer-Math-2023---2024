import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheetExample {
    private static final int FRAME_WIDTH = 32; // Width of a single sprite frame
    private static final int FRAME_HEIGHT = 32; // Height of a single sprite frame

    private BufferedImage spriteSheet;
    private int currentFrame = 0;
    private Timer animationTimer;

    public SpriteSheetExample() {
        // Load the sprite sheet
        try {
            spriteSheet = ImageIO.read(new File("Sprites.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a Swing window
        JFrame frame = new JFrame("Sprite Sheet Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw the current sprite frame on the panel
                g.drawImage(spriteSheet.getSubimage(currentFrame * FRAME_WIDTH, 0, FRAME_WIDTH, FRAME_HEIGHT), 100, 100, null);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

        // Create a timer for animation (you can adjust the delay)
        animationTimer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % (spriteSheet.getWidth() / FRAME_WIDTH);
            panel.repaint();
        });

        animationTimer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SpriteSheetExample());
    }
}
