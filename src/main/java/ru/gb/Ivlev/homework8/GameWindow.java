package ru.gb.Ivlev.homework8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {


    public GameWindow (){
        setBounds(800, 400, 900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField= new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 90));
        textField.setBackground(Color.gray);

        textField.setForeground(Color.YELLOW);
        textField.setText("           НИЧЬЯ");
        add(textField);






        setVisible(true);

    }

    public static void main(String[] args) {
        new GameWindow();

    }

}

