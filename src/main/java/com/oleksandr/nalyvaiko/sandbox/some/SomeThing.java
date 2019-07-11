package com.oleksandr.nalyvaiko.sandbox.some;

import javax.swing.*;
import java.awt.*;

public class SomeThing {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame(":-)");
        JPanel panel = new JPanel();
        jFrame.add(panel);
        JLabel label = new JLabel("hello!");
        label.setFont(new Font("Arial", Font.BOLD, 400));
        panel.add(label);
        panel.setBackground(new Color(57, 255, 143));


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(1920, 1080);
    }
}
