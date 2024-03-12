package TemperatureConverterProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame {
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel inputLabel;
    private JTextField inputTextField;
    private JButton cToFButton;
    private JButton fToCButton;
    private JButton cToKButton;
    private JButton kToCButton;
    private JTextField resultArea;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setBounds(300, 90, 350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Temperature Converter");
        title.setSize(300, 30);
        title.setLocation(50, 30);
        c.add(title);

        inputLabel = new JLabel("Input");
        inputLabel.setSize(100, 20);
        inputLabel.setLocation(20, 70);
        c.add(inputLabel);

        inputTextField = new JTextField();
        inputTextField.setSize(100, 20);
        inputTextField.setLocation(120, 70);
        c.add(inputTextField);

        cToFButton = new JButton("C to F");
        cToFButton.setSize(100, 20);
        cToFButton.setLocation(20, 100);
        c.add(cToFButton);

        fToCButton = new JButton("F to C");
        fToCButton.setSize(100, 20);
        fToCButton.setLocation(120, 100);
        c.add(fToCButton);

        cToKButton = new JButton("C to K");
        cToKButton.setSize(100, 20);
        cToKButton.setLocation(20, 130);
        c.add(cToKButton);

        kToCButton = new JButton("K to C");
        kToCButton.setSize(100, 20);
        kToCButton.setLocation(120, 130);
        c.add(kToCButton);

        resultArea = new JTextField();
        resultArea.setSize(200, 50);
        resultArea.setLocation(50, 170);
        resultArea.setEditable(false);
        resultArea.setHorizontalAlignment(JTextField.CENTER); // This centers the text
        resultArea.setFont(new Font(resultArea.getFont().getName(), resultArea.getFont().getStyle() | Font.BOLD, 16));
        c.add(resultArea);;


        cToFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                try {
                    double celsius = Double.parseDouble(input);
                    double fahrenheit = celsius * 9 / 5 + 32;
                    resultArea.setText(String.format("Result: %.2f F", fahrenheit));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input!");
                }
            }
        });

        // Action listener for F to C button
        fToCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                try {
                    double fahrenheit = Double.parseDouble(input);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    resultArea.setText(String.format("Result: %.2f C", celsius));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input!");
                }
            }
        });

        // Action listener for C to K button
        cToKButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                try {
                    double celsius = Double.parseDouble(input);
                    double kelvin = celsius + 273.15;
                    resultArea.setText(String.format("Result: %.2f K", kelvin));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input!");
                }
            }
        });

        // Action listener for K to C button
        kToCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                try {
                    double kelvin = Double.parseDouble(input);
                    double celsius = kelvin - 273.15;
                    resultArea.setText(String.format("Result: %.2f C", celsius));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input!");
                }
            }
        });
    }

}
