import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameCharacterExample {
    private static final int FRAME_WIDTH = 32; // Width of a single sprite frame
    private static final int FRAME_HEIGHT = 32; // Height of a single sprite frame
    private static final int CHARACTER_SPEED = 3; // Character movement speed

    private BufferedImage spriteSheet;
    private int characterX = 100; // Initial character position X
    private int characterY = 100; // Initial character position Y
    private int currentFrame = 0;
    private Timer animationTimer;
    private JFrame frame;
    private JPanel panel;

    public GameCharacterExample() {
        // Load the sprite sheet
        try {
            spriteSheet = ImageIO.read(new File("Sprites.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a Swing window
        frame = new JFrame("Game Character Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw the character
                g.drawImage(spriteSheet.getSubimage(currentFrame * FRAME_WIDTH, 0, FRAME_WIDTH, FRAME_HEIGHT), characterX, characterY, null);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

        // Create a timer for character animation
        animationTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % (spriteSheet.getWidth() / FRAME_WIDTH);
                panel.repaint();
            }
        });

        animationTimer.start();

        // Add keyboard and mouse listeners
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    characterX -= CHARACTER_SPEED;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    characterX += CHARACTER_SPEED;
                } else if (keyCode == KeyEvent.VK_UP) {
                    characterY -= CHARACTER_SPEED;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    characterY += CHARACTER_SPEED;
                }
                panel.repaint();
            }
        });

        frame.setFocusable(true);
        frame.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameCharacterExample());
    }
}
