package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Celcjusz");
        window.setSize(480,480);
        window.setLayout(new GridLayout(3,1));

        JButton button = new JButton("Sprawdź");
        JTextField textField = new JTextField();
        JLabel label = new JLabel("Farenhajt: ");
        window.add(textField);
        window.add(label);
        window.add(button);
        button.setMaximumSize(new Dimension(50,20));
        label.setMaximumSize(new Dimension(50,20));
        textField.setMaximumSize(new Dimension(50,20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = Integer.parseInt(textField.getText());
                double f = (c*(5.0/9.0)+32);
                label.setText(String.valueOf(f));
            }
        });
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}