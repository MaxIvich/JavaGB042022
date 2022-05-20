package ru.gb.Ivlev.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class GameUi extends JFrame {
    private final int SIZE = 3;
    private JButton[][] btn ;
    private  final Random rand = new Random();
    int DOTS_TO_WIN = 3;
    public final char DOT_EMPTY = '•';
    public final char DOT_X = 'X';
    public final char DOT_O = 'O';



    public GameUi() {
        initMap();
        setTitle(" Крестики Нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800, 400, 600, 600);
        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                btn[i][j]=new JButton(String.valueOf(DOT_EMPTY)) ;
                btn[i][j].setFont(new Font("Arial", Font.BOLD, 50));
                add(btn[i][j]);
                int J = j;
                int I = i;
                btn[i][j].addActionListener(new ActionListener() {
                @Override
                public void  actionPerformed(ActionEvent e) {
                    humanTern(I,J);




                }
            });
        }
        }


        setVisible(true);

    }


    public  boolean checkWin(String symb) {
        int checkdiagleft = 0;
        int checkdiagright = 0;

        for (int j = 0; j < SIZE; j++) {
            int checkline = 0;
            int checkcolumn = 0;


            if (Objects.equals(btn[j][j].getText(), symb)) {
                checkdiagleft = checkdiagleft + 1;
                if (checkdiagleft == DOTS_TO_WIN) return true;

            }
            if (Objects.equals(btn[(SIZE - 1) - j][j].getText(), symb)) {
                checkdiagright = checkdiagright + 1;
                if (checkdiagright == DOTS_TO_WIN) return true;

            }
            for (int i = 0; i < SIZE; i++) {

                if (Objects.equals(btn[j][i].getText(), symb)) {
                    checkline = checkline + 1;
                    if (checkline == DOTS_TO_WIN) return true;

                }
                if (Objects.equals(btn[i][j].getText(), symb)) {
                    checkcolumn = checkcolumn + 1;
                    if (checkcolumn == DOTS_TO_WIN) return true;

                }

            }
        }
        return false;
    }





    public void aiTurn (){
        if(isMapFull()){
            End();

            return;

        }



        int X,Y;
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if (btn[i][j].getText().equals(String.valueOf(DOT_EMPTY))) {
                    btn[i][j].setText(String.valueOf(DOT_X));
                    if (checkWin(btn[i][j].getText())) {

                        X = i;
                        Y = j;
                        btn[i][j].setText(String.valueOf(DOT_O));

                        return;
                    }
                    else btn[i][j].setText( String.valueOf(DOT_EMPTY));
                }
                if (btn[i][j].getText().equals(String.valueOf(DOT_EMPTY))){
                    btn[i][j].setText(String.valueOf(DOT_O));
                    if (checkWin(btn[i][j].getText())) {
                        End();
                        X = i;
                        Y = j;
                        btn[i][j].setText(String.valueOf(DOT_O));

                        return;

                    } else btn[i][j].setText( String.valueOf(DOT_EMPTY));
                }

            }
        }


              Y = rand.nextInt(SIZE);
              X = rand.nextInt(SIZE);

       if(isCellValid(X,Y)) {

           btn[X][Y].setText(String.valueOf(DOT_O));
           System.out.println(String.valueOf(X) + " " + String.valueOf(Y));


           if(checkWin(String.valueOf(DOT_O))){

               System.out.println("Вин AИ");

           }

           }


       else aiTurn();




    }
    public  boolean isCellValid(int x, int y) {
      if (btn[x][y].getText().equals(String.valueOf(DOT_X))||btn[x][y].getText().equals(String.valueOf(DOT_O))) return false;
        return btn[x][y].getText().equals(String.valueOf(DOT_EMPTY));
    }
        public void humanTern(int X , int Y){
           if (btn[X][Y].getText().equals(String.valueOf(DOT_EMPTY))) {

               btn[X][Y].setText(String.valueOf(DOT_X));

           }



            System.out.println(String.valueOf(X) + " "+ String.valueOf(Y));
           if( checkWin(String.valueOf(DOT_X))){
               End();
               System.out.println("Победа человека");

               }

           else aiTurn();






        }
    public  void initMap() {
        btn = new JButton[SIZE][SIZE];

    }
    public  boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (btn[i][j].getText().equals(String.valueOf(DOT_EMPTY))) return false;
            }
        }
        return true;
    }
    public void End(){
        //setVisible(false);
        if(checkWin(String.valueOf(DOT_O))){
            AIWindow aiWindow=new AIWindow();
        }
        if(checkWin(String.valueOf(DOT_X))){
            HumanWindow humanWindow=new HumanWindow();
        }
        if(isMapFull()&&!checkWin(String.valueOf(DOT_O))&&!checkWin(String.valueOf(DOT_X))){
        GameWindow gameWindow = new GameWindow();}





    }


        public static void main (String[]args){
            new GameUi();


        }

}



