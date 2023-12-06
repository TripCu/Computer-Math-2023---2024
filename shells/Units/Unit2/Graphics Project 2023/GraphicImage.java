import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;


@SuppressWarnings("serial")
public class GraphicImage extends JPanel {

    public static final int SCREEN_SIZE = 500;
    public static final int WIDTH = SCREEN_SIZE;
    public static final int HEIGHT = SCREEN_SIZE;

    public static final int CLEAR_SCREEN = -1;
    public static final int VERTICAL_LINES = 0;
    public static final int HORIZTONAL_LINES = 1;
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


    private Color screenColor;
    private int pictureName = CLEAR_SCREEN;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPicture(g, pictureName);
        repaint();
    }


    public void setColor(Color color) {
        screenColor = color;
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

            case HORIZTONAL_LINES:
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
        g.setColor(Color.GREEN);
        for (int x = 0; x <= 500; x += 50)
            g.drawRect(x, 0, 50, 500);


    }


    /**
     * Draws 7 - 15 horizontal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawHorizontalLines(Graphics g) {
        g.setColor(Color.GREEN);
        for (int x = 0; x <= 500; x += 50)
            g.drawLine(500, x, 0, x);

    }


    /**
     * Draw 15 - 30 diagonal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawDiagonalLines(Graphics g) {
        g.setColor(Color.YELLOW);
        int x;
        for (x = 0; x <= 500; x += 50)
            g.drawLine(0, x, x, 0);
        g.drawLine(500, x, x, 500);


    }


    /**
     * Draw at least 15 lines all converging to the top-left corner
     *
     * @param g the graphic
     */
    public void drawCornerLines(Graphics g) {

    }


    /**
     * Draw the webbing pattern that appears in the top-right corner.
     *
     * @param g the graphic
     */
    public void drawWebTopRight(Graphics g) {


    }


    /**
     * Draw the webbing pattern that appears in the top-left corner.
     *
     * @param g the graphic
     */
    public void drawWebTopLeft(Graphics g) {


    }


    /**
     * Draw the webbing pattern that appears in the center of the screen.
     *
     * @param g the graphic
     */
    public void drawWebCenter(Graphics g) {


    }


    /**
     * Draw a starburst of lines that appear to come from the center of the screen.
     *
     * @param g the graphic
     */
    public void drawStarburst(Graphics g) {


    }


    /**
     * Draw at least 5 vertical bars of the same width across the screen.
     *
     * @param g the graphic
     */
    public void drawVerticalBars(Graphics g) {


    }


    /**
     * Draw the triangle pattern (similar to Triforce from Zelda games).
     *
     * @param g the graphic
     */
    public void drawTriangles(Graphics g) {
        g.setColor(Color.yellow);
        g.drawPolygon(new int[]{10, 20, 30}, new int[]{100, 20, 100}, 3);


    }


    /**
     * Draw a bullseye with at least 5 circles.
     *
     * @param g the graphic
     */
    public void drawBullseye(Graphics g) {


    }


    /**
     * Create an 8x8 square checkerboard
     *
     * @param g the Graphics object
     */
    public void drawCheckerboard(Graphics g) {


    }


    /**
     * Draw at least a grid of 4 x 4 dots, centered properly on the screen.
     *
     * @param g the graphic
     */
    public void drawDots(Graphics g) {


    }


    /**
     * Draw a proportional 5 point star.
     *
     * @param g the graphic
     */
    public void drawPacMan(Graphics g) {


    }


    /**
     * Draw an American Flag to scale.  You may use circles for the stars.
     *
     * @param g the graphic
     */
    public void drawAmericanFlag(Graphics g) {


    }


    /**
     * Draw an alternating pattern that resembles bricks on a wall.
     *
     * @param g the graphic
     */
    public void drawBricks(Graphics g) {


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
