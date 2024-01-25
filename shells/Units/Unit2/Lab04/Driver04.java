package Lab04;

import edu.fcps.Bucket;
import javax.swing.JFrame;

public class Driver04 {
    public Driver04() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(3);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(1);
        Bucket.useTotal(false);
        Bucket five = new Bucket(5);
        Bucket three = new Bucket(3);
        five.fill();
        five.pourInto(three);
        three.spill();
        five.pourInto(three);
        five.fill();
        five.pourInto(three);
    }
}
