package Lab00;

import javax.swing.*;
import net.miginfocom.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * Created by JFormDesigner on Wed Feb 28 10:22:30 EST 2024
 */



/**
 * @author FrameUser
 */
public class Panel00V1<Panel00$1> extends JPanel {
    private JLabel label;

    public Panel00V1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Trip Cubbison
        Goooood = new JTextField();
        checkBox1 = new JCheckBox();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
        new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
        ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
        ,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12)
        ,java.awt.Color.red), getBorder())); addPropertyChangeListener(
        new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException()
        ;}});
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- Goooood ----
        Goooood.setText("yes");
        add(Goooood, "cell 0 3");

        //---- checkBox1 ----
        checkBox1.setText("text");
        add(checkBox1, "cell 0 6");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        //Trips code 
        this.setLayout(new FlowLayout());
        this.label = new JLabel("0.0000000000000000");
        this.label.setFont(new Font("Serif", 1, 20));
        this.label.setForeground(Color.blue);
        this.add(this.label);
        JButton button = new JButton("Random");
        this.add(button);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Trip Cubbison
    private JTextField Goooood;
    private JCheckBox checkBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
