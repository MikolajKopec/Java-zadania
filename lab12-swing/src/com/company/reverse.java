package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reverse {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(250,250);
        window.setLayout(new BorderLayout(5,5));

        JTextField tekst = new JTextField();
        tekst.setPreferredSize(new Dimension(100,50));
        JButton button = new JButton("Sprawdź");
        JLabel label = new JLabel();
        window.add(tekst,BorderLayout.WEST);
        window.add(label,BorderLayout.CENTER);
        window.add(button,BorderLayout.EAST);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder(tekst.getText());
                sb.reverse();
                label.setText(sb.toString());
            }
        });
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
