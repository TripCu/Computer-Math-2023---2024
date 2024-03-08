package Lab03;    //Name______________________________ Date_____________
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel03 extends JPanel {
   private JLabel label1;
   private JLabel label2;
   private JTextField box;
   private int number;
   private int count;

   public Panel03() {
      this.setLayout(new FlowLayout());
      this.number = 37;
      this.count = 0;
      this.label1 = new JLabel("37");
      this.label1.setFont(new Font("Serif", 1, 100));
      this.label1.setForeground(Color.blue);
      this.add(this.label1);
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      this.add(panel);
      this.box = new JTextField("37", 5);
      this.box.setHorizontalAlignment(4);
      panel.add(this.box);
      JButton button1 = new JButton("Set");
      button1.addActionListener(new Listener1());
      panel.add(button1);
      JButton button2 = new JButton("Next");
      button2.addActionListener(new Listener2());
      panel.add(button2);
      JButton button3 = new JButton("Quit");
      button3.addActionListener(new Listener3());
      panel.add(button3);
      this.label2 = new JLabel("Iterations: 0");
      this.add(this.label2);
   }

   private class Listener3 implements ActionListener {
      private Listener3() {
      }

      public void actionPerformed(ActionEvent e) {
         System.exit(0);
      }
   }

   private class Listener2 implements ActionListener {
      private Listener2() {
      }

      public void actionPerformed(ActionEvent e) {
         if (Panel03.this.number % 2 == 0) {
            Panel03.this.number = Panel03.this.number / 2;
         } else {
            Panel03.this.number = 3 * Panel03.this.number + 1;
         }

         Panel03.this.count++;
         Panel03.this.label1.setText("" + Panel03.this.number);
         Panel03.this.label2.setText("Iterations: " + Panel03.this.count);
      }
   }

   private class Listener1 implements ActionListener {
      private Listener1() {
      }

      public void actionPerformed(ActionEvent e) {
         Panel03.this.number = Integer.parseInt(Panel03.this.box.getText());
         Panel03.this.count = 0;
         Panel03.this.label1.setText("" + Panel03.this.number);
         Panel03.this.label2.setText("Iterations: " + Panel03.this.count);
      }
   }
}
