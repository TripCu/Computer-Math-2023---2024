package Christmas_Tree_Compettion;

import javax.swing.*;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        try{
            Process p = Runtime.getRuntime().exec("C:\\Users\\FrameUser\\Documents\\GitHub\\Computer-Math-2023---2024\\shells\\Units\\Unit2\\Christmas_Tree_Compettion\\Music.mp3");
            p.waitFor();

        }catch( IOException ex ){
            //Validate the case the file can't be accesed (not enought permissions)

        }catch( InterruptedException ex ){
            //Validate the case the process is being stopped by some external situation

        }
        JFrame frame = new JFrame("Labo00");
        frame.setContentPane(new ChristmassTree());
        frame.setSize(500, 600);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
