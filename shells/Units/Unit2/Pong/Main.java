package Pong;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    static JFrame f = new JFrame("Pong");
    public static void main(String[] args) {
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(655,510);
        PongGame game = new PongGame();
        f.add(game);

        f.setVisible(true);
        Timer timer = new Timer(11, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.gameLogic();
                game.repaint();


            }
        });

        timer.start();

    }
}