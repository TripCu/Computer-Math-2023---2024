package Lab00;
   import javax.swing.JFrame;
    public class Driver00
    {
        public static void main(String[] args)
        {
            JFrame frame = new JFrame("Unit2, Lab17");
            frame.setSize(408, 438);    //makes the mouse location correct
            frame.setLocation(0, 0);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Panel00 p = new Panel00();
            frame.setContentPane(p);
            p.requestFocus();
            frame.setVisible(true);

        }
    }

