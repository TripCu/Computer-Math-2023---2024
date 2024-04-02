package Lab08;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel08 extends JPanel {
   private Display08 display;

   public Panel08() {
      // Set the layout of the panel to BorderLayout
      this.setLayout(new BorderLayout());
      // Initialize display and add it to the center of the panel
      this.display = new Display08();
      this.add(this.display, "Center");
      // Create a new subpanel, set its layout, and add it to the south of the panel
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      this.add(panel, "South");
      // Create a new button, add an action listener to it, and add it to the subpanel
      JButton button1 = new JButton("Finite");
      button1.addActionListener(new Listener1());
      panel.add(button1);
      // Create another button, add an action listener to it, and add it to the subpanel
      JButton button2 = new JButton("Infinite");
      button2.addActionListener(new Listener2());
      panel.add(button2);
   }

   // Listener2: Calls the sumInfinite method of display when the "Infinite" button is clicked
   private class Listener2 implements ActionListener {
      private Listener2() {
      }

      public void actionPerformed(ActionEvent e) {
         Panel08.this.display.sumInfinite();
      }
   }

   // Listener1: Calls the sumFinite method of display when the "Finite" button is clicked
   private class Listener1 implements ActionListener {
      private Listener1() {
      }

      public void actionPerformed(ActionEvent e) {
         Panel08.this.display.sumFinite();
      }
   }
}