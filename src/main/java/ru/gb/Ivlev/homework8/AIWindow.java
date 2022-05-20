package ru.gb.Ivlev.homework8;

import javax.swing.*;
import java.awt.*;

public class AIWindow extends JFrame {
    public AIWindow (){
        setBounds(800, 400, 900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField= new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 90));
        textField.setForeground(Color.RED);
        textField.setBackground(Color.gray);
        add(textField);
        textField.setText("     ПОБЕДИЛ ИИ");






        setVisible(true);

    }

    public static void main(String[] args) {
       new AIWindow();
    }
}
