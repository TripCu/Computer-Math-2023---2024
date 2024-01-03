package Christmas_Tree_Compettion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RGB extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawOrnaments(g);
    }

    public void drawOrnaments(Graphics g) {
        int r = 0;
        int green= 0;
        int b = 0;
        Timer timer = new Timer(-1000000000 ,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int r=0;r<=10;r++)
                {
                    g.setColor(new Color(r, green, b)); // Gold color for ornaments
                }
                for (int green=0;green<=10;green++)
                {
                    g.setColor(new Color(r, green, b)); // Gold color for ornaments
                }
                for (int r=0;r<=10;r++)
                {
                    g.setColor(new Color(r, green, b)); // Gold color for ornaments
                }
            }

        });


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

