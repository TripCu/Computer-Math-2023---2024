package Lab04;

import edu.fcps.Bucket;
import javax.swing.JFrame;

public class Driver4b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(1);
        Bucket.useTotal(false);
        Bucket three  = new Bucket(3);
        Bucket four = new Bucket(4);
        Bucket five = new Bucket(5);
        five.fill();
        five.pourInto(three);
        three.spill();
        five.pourInto(three);
        five.fill();
        five.pourInto(three);
        five.pourInto(four);
        three.spill();
        five.pourInto(three);
        five.fill();
        five.pourInto(three);
        four.pourInto(three);
        five.fill();
        five.pourInto(four);
        four.pourInto(three);
        three.spill();
        five.pourInto(four);
        four.pourInto(three);
        three.spill();
    }
}
