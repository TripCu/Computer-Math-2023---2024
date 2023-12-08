import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;


public class GraphicImage extends JPanel {

    public static final int CLEAR_SCREEN = -1;
    public static final int VERTICAL_LINES = 0;
    public static final int HORIZONTAL_LINES = 1;
    public static final int DIAGONAL_LINES = 2;
    public static final int CORNER_LINES = 3;
    public static final int WEB_TOP_RIGHT = 4;
    public static final int WEB_TOP_LEFT = 5;
    public static final int WEB_CENTER = 6;
    public static final int STARBURST = 7;
    public static final int VERTICAL_BARS = 8;
    public static final int TRIANGLES = 9;
    public static final int BULLSEYE = 10;
    public static final int CHECKERBOARD = 11;
    public static final int DOTS = 12;
    public static final int PACMAN = 13;
    public static final int AMERICAN_FLAG = 14;
    public static final int BRICKS = 15;
    public static final int PIZZA = 16;
    public static final int PENCIL = 17;


    private int pictureName = CLEAR_SCREEN;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPicture(g, pictureName);
        repaint();
    }


    public void setPictureName(int name) {
        pictureName = name;
    }

    public void drawPicture(Graphics g, int pictureName) {

        clearScreen(g);

        switch (pictureName) {

            case VERTICAL_LINES:
                drawVerticalLines(g);
                break;

            case HORIZONTAL_LINES:
                drawHorizontalLines(g);
                break;

            case DIAGONAL_LINES:
                drawDiagonalLines(g);
                break;

            case CORNER_LINES:
                drawCornerLines(g);
                break;

            case WEB_TOP_RIGHT:
                drawWebTopRight(g);
                break;

            case WEB_TOP_LEFT:
                drawWebTopLeft(g);
                break;

            case WEB_CENTER:
                drawWebCenter(g);
                break;

            case STARBURST:
                drawStarburst(g);
                break;

            case VERTICAL_BARS:
                drawVerticalBars(g);
                break;

            case TRIANGLES:
                drawTriangles(g);
                break;

            case BULLSEYE:
                drawBullseye(g);
                break;

            case CHECKERBOARD:
                drawCheckerboard(g);
                break;

            case DOTS:
                drawDots(g);
                break;

            case PACMAN:
                drawPacMan(g);
                break;

            case AMERICAN_FLAG:
                drawAmericanFlag(g);
                break;

            case BRICKS:
                drawBricks(g);
                break;

            case PIZZA:
                drawPizza(g);
                break;

            case PENCIL:
                drawPencil(g);
                break;

            default:
                clearScreen(g);
        }
    }


    /**
     * Clears the screen
     *
     * @param g the graphic
     */
    public void clearScreen(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);
    }


    /**
     * Draws 7 - 15 vertical lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawVerticalLines(Graphics g) {
        g.setColor(Color.CYAN);
        for (int x = 0; x <= 500; x += 50)
            g.drawRect(x, 0, 50, 500);


    }


    /**
     * Draws 7 - 15 horizontal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawHorizontalLines(Graphics g) {
        g.setColor(Color.yellow);
        for (int x = 0; x <= 500; x += 50)
            g.drawLine(500, x, 0, x);

    }


    /**
     * Draw 15 - 30 diagonal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawDiagonalLines(Graphics g) {
        g.setColor(Color.red);
        int x;
        for (x = 0; x <= 500; x += 50) {
            g.drawLine(0, x, x, 0);
            g.drawLine(500, x, x, 500);
        }
            g.drawLine(0,500,500,0);

    }


    /**
     * Draw at least 15 lines all converging to the top-left corner
     *
     * @param g the graphic
     */
    public void drawCornerLines(Graphics g) {
        g.setColor(new Color(100, 100, 255));
        for(int cline = 500; cline >= 0; cline-=50){
            g.drawLine(0, 0, cline, 500);
        }
        for(int cline = 500; cline >= 0; cline-=50){
            g.drawLine(0, 0, 500, cline);
        }

    }

    /**
     * Draw the webbing pattern that appears in the top-right corner.
     *
     * @param g the graphic
     */
    public void drawWebTopRight(Graphics g) {
        g.setColor(Color.pink);
        int x;
        for (x = 0; x <= 500; x += 50) {
            g.drawLine(x, 0, 500, x);

        }

    }


    /**
     * Draw the webbing pattern that appears in the top-left corner.
     *
     * @param g the graphic
     */
    public void drawWebTopLeft(Graphics g) {
        g.setColor(Color.pink);
        int x;
        for (x = 0; x <= 500; x += 50) {
            g.drawLine(0, x, (500-x), 0);

        }

    }


    /**
     * Draw the webbing pattern that appears in the center of the screen.
     *
     * @param g the graphic
     */
    public void drawWebCenter(Graphics g) {
        for(int y =250; y >= 0; y-= 25)
        {
            g.setColor(Color.pink);
            g.drawLine(250, y, (250 + y), 250);

        }

        for(int y =250; y <= 500; y+= 25)
        {
            g.setColor(Color.pink);
            g.drawLine(250, y, (750 - y), 250);

        }

        for(int y =250; y <= 500; y+= 25)
        {
            g.setColor(Color.pink);
            g.drawLine(250, y, (y- 250), 250);



        }
        for(int y =250; y >= 0; y-= 25)
        {
            g.setColor(Color.pink);
            g.drawLine(250, y, (250 - y), 250);

        }
    }


    /**
     * Draw a starburst of lines that appear to come from the center of the screen.
     *
     * @param g the graphic
     */
    public void drawStarburst(Graphics g) {
        for( int l = 0; l<= 500; l += 36)
        {
            g.setColor(Color.orange);
            g.drawLine(0, l,500,500-l);
            g.drawLine(l, 0,500-l,500);
        }


    }


    /**
     * Draw at least 5 vertical bars of the same width across the screen.
     *
     * @param g the graphic
     */
    public void drawVerticalBars(Graphics g) {

        g.setColor(Color.red);

            for (int i = 0; i <= 500; i+= 100) {
                g.fillRect( i,0,50, 500);

            }


    }


    /**
     * Draw the triangle pattern (similar to Tri-force from Zelda games).
     *
     * @param g the graphic
     */
    public void drawTriangles(Graphics g) {
        g.setColor(Color.YELLOW);
        int xPoints[] = {130, 250, 370};
        int yPoints[] = {250, 0, 250};
        g.fillPolygon(xPoints, yPoints, 3);
        int x2Points[] = {0, 130, 250};
        int y2Points[] = {500, 250, 500};
        g.fillPolygon(x2Points, y2Points, 3);
        int x3Points[] = {250, 370, 500};
        int y3Points[] = {500, 250, 500};
        g.fillPolygon(x3Points, y3Points, 3);


    }



    /**
     * Draw a bullseye with at least 5 circles.
     *
     * @param g the graphic
     */
    public void drawBullseye(Graphics g) {
        int c = 0;
        for(int x = 0; x <= 500; x += 100){
            if(c == 0){
                g.setColor(Color.CYAN);
                c = 1;
            }
            else {
                g.setColor(Color.BLACK);
                c = 0;
            }
            g.fillOval(x/2, x/2, 500-x, 500-x);
        }
    }


    /**
     * Create a 8x8 square checkerboard
     *
     * @param g the Graphics object
     */
    public void drawCheckerboard(Graphics g) {

        int rows = 8;
        int cols = 8;
        int cellSize = getWidth() / cols;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = col * cellSize;
                int y = row * cellSize;

                if ((row + col) % 2 == 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x, y, cellSize, cellSize);
            }
        }
    }


    /**
     * Draw at least a grid of 4 x 4 dots, centered properly on the screen.
     *
     * @param g the graphic
     */
    public void drawDots(Graphics g) {
        int rows = 5;
        int cols = 5;
        int dotSize = 40;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = col * getWidth() / (cols - 1);
                int y = row * getHeight() / (rows - 1);

                g.setColor(Color.pink);
                g.fillOval(x, y, dotSize, dotSize);
            }
        }
    }



    /**
     * Draw a proportional 5 point star.
     *
     * @param g the graphic
     */
    public void drawPacMan(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = 500/2;
        int pacManSize = 500;

        g.setColor(Color.YELLOW);
        g.fillArc(centerX - pacManSize / 2, 0, pacManSize, pacManSize, 45, 270);

        int[] xPoints = {centerX, centerX + pacManSize / 2, centerX};
        int[] yPoints = {centerY, centerY + pacManSize / 2, centerY};
        g.fillPolygon(xPoints, yPoints, 3);

        int eyeSize = pacManSize / 10;
        int eyeOffsetX = pacManSize / 15;
        int eyeOffsetY = pacManSize / 3;
        g.setColor(Color.BLACK);
        g.fillOval(centerX - eyeOffsetX, centerY - eyeOffsetY, eyeSize, eyeSize);
    }


    /**
     * Draw an American Flag to scale.  You may use circles for the stars.
     *
     * @param g the graphic
     */
    public void drawAmericanFlag(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        int stripeHeight = getHeight() / 13;
        for (int i = 0; i < 13; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.WHITE);
            }
            g.fillRect(0, i * stripeHeight, getWidth(), stripeHeight);
        }

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth() * 1/2 , stripeHeight * 6);
    }



    /**
     * Draw an alternating pattern that resembles bricks on a wall.
     *
     * @param g the graphic
     */
    public void drawBricks(Graphics g) {
            int rows = 10;
            int cols = 10;
            int brickWidth = getWidth() / cols;
            int brickHeight = getHeight() / rows;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int x = col * brickWidth;
                    int y = row * brickHeight;

                    g.setColor(Color.RED);
                    g.fillRect(x, y, brickWidth, brickHeight);
                    
                    g.setColor(Color.WHITE);
                    g.drawRect(x, y, brickWidth, brickHeight);
                }
            }
        }




    /**
     * Draw a slice of pizza - include crust, cheese,
     * and pepperoni (other toppings optional)
     *
     * @param g the graphic
     */
    public void drawPizza(Graphics g) {


    }


    /**
     * Draw a pencil, include an eraser, the metal thing that attaches
     * the eraser, pencil, and point.
     *
     * @param g the graphic
     */
    public void drawPencil(Graphics g) {


    }


}
