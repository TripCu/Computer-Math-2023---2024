<<<<<<< HEAD:shells/Units/Unit2/Christmas_Tree_Compettion/ChristmasTree.java
package Christmas_Tree_Compettion;

=======
package Discared;
>>>>>>> 3709b315d623135050adf1f4530b71ad602bc8e9:shells/Units/Unit2/Discared/ChristmasTree.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ChristmasTree extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        int r = 0;
        int green= 0;
        int b = 0;
        Timer timer = new Timer(-1000000000 ,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int r=0;r<=10;r++)
                {
                    private void drawTree(Graphics g) {


                }
                    g.setColor(new Color(r, green, b)); // Gold color for ornaments
                    int[] xPoints = {250, 150, 350};
                    int[] yPoints = {100, 400, 400};
                    g.fillPolygon(xPoints, yPoints, 3); // top part

                    int[] xPoints2 = {250, 125, 375};
                    int[] yPoints2 = {200, 450, 450};
                    g.fillPolygon(xPoints2, yPoints2, 3); // middle part

                    int[] xPoints3 = {250, 100, 400};
                    int[] yPoints3 = {300, 500, 500};
                    g.fillPolygon(xPoints3, yPoints3, 3); // bottom part

                    g.setColor(new Color(139, 69, 19)); // Brown color for the trunk
                    g.fillRect(225, 500, 50, 100);
                    }
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
        super.paintComponent(g);
        timer.start();
        drawTree(g);
        drawOrnaments(g);
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