package ru.gb.Ivlev.homework3;

public class Task4 {
    public static void main(String[] args) {
        int c = 9;
        int[][]arr = new int[10][10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i]=1;
            arr[i][c-i] =1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println();

        }

    }
}
