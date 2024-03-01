package Lab01;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Panel01 extends JPanel{
    private JLabel label;
    private JTextField box;
    public Panel01()
    {
        setLayout(new FlowLayout());

        box = new JTextField();
        box.setHorizontalAlignment(SwingConstants.RIGHT);
        add(box);

        JButton button = new JButton("SQRT");
        button.addActionListener(new Listener());
        add(button);

        label
    }
}
