package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class gra {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(250,250);
        window.setLayout(new BoxLayout(window.getContentPane(),BoxLayout.X_AXIS));

        JTextField liczba = new JTextField();
        liczba.setMinimumSize(new Dimension(100,50));
        JButton button = new JButton("Sprawdź");
        JLabel label = new JLabel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setMinimumSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(100,50));
        panel3.setPreferredSize(new Dimension(100,50));
        Random random = new Random();
        int c = random.nextInt(19)+1;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(liczba.getText())<c){
                    label.setText("Twoja liczba jest za mała");
                }
                else if(Integer.parseInt(liczba.getText())>c){
                    label.setText("Twoja liczba jest za duża");
                }
                else{
                    label.setText("Zgadłeś");
                }
            }
        });
        panel1.add(liczba);
        panel2.add(label);
        panel3.add(button);
        window.add(panel1);
        window.add(panel2);
        window.add(panel3);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
