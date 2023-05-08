package com.jascisak.app;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceApp {
    static int z = 3;
    static Color colorBg = new Color(58, 26, 26);
    static Color colorLight = new Color(130, 134, 134);
    static Color colorDark = new Color(35, 30, 30);
    static Random rnd = new Random();

    public static void btnSet(JButton jb, JPanel jp, JTextField tf, int max) {
        jb.setFont(new Font("Monaco", Font.BOLD, 5 * z));
        jb.setBackground(colorLight);
        jb.setForeground(colorDark);
        jb.setOpaque(true);
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int rngOut = rnd.nextInt(max) + 1;
                tf.setText(String.valueOf(rngOut));
            }
        });
    }

    public static void main(String[] args) {

        JFrame fr = new JFrame("RPG Dice");
        fr.setMinimumSize(new Dimension(110 * z, 120 * z));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setResizable(false);
        JPanel pan = new JPanel();
        pan.setLayout(null);
        pan.setBackground(colorBg);
        fr.setContentPane(pan);

        JTextField textField = new JTextField();
        textField.setBounds(10 * z, 10 * z, 85 * z, 20 * z);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        textField.setFont(new Font("Monaco", Font.BOLD, 20 * z));
        textField.setBackground(colorDark);
        textField.setForeground(colorLight);
        pan.add(textField);

        JButton btnD4 = new JButton("D4");
        btnD4.setBounds(10 * z, 40 * z, 25 * z, 15 * z);
        btnSet(btnD4, pan, textField, 4);

        JButton btnD6 = new JButton("D6");
        btnD6.setBounds(40 * z, 40 * z, 25 * z, 15 * z);
        btnSet(btnD6, pan, textField, 6);

        JButton btnD8 = new JButton("D8");
        btnD8.setBounds(70 * z, 40 * z, 25 * z, 15 * z);
        btnSet(btnD8, pan, textField, 8);

        JButton btnD10 = new JButton("D10");
        btnD10.setBounds(10 * z, 60 * z, 25 * z, 15 * z);
        btnSet(btnD10, pan, textField, 10);

        JButton btnD20 = new JButton("D20");
        btnD20.setBounds(40 * z, 60 * z, 25 * z, 15 * z);
        btnSet(btnD20, pan, textField, 20);

        JButton btnD100 = new JButton("D100");
        btnD100.setBounds(70 * z, 60 * z, 25 * z, 15 * z);
        btnSet(btnD100, pan, textField, 100);

        JButton btnReset = new JButton("ERASE");
        btnReset.setBounds(10 * z, 80 * z, 85 * z, 15 * z);
        btnReset.setFont(new Font("Monaco", Font.BOLD, 8 * z));
        btnReset.setBackground(colorLight);
        btnReset.setForeground(colorDark);
        btnReset.setOpaque(true);
        pan.add(btnReset);
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        fr.pack();
        fr.setVisible(true);
    }
}
