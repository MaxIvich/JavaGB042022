package ru.gb.Ivlev.homework8;

import javax.swing.*;
import java.awt.*;

public class HumanWindow extends JFrame {
    public HumanWindow (){
    setBounds(800, 400, 900, 600);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JTextField textField= new JTextField();
    textField.setFont(new Font("Arial", Font.BOLD, 80));
    add(textField);
    textField.setText("   ПОБЕДИЛ ЧЕЛОВЕК");






    setVisible(true);

}
}
