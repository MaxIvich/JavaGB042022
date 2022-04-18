package ru.gb.Ivlev.homework2;

public class task1 {
    public static boolean checkSum(int a,int b) {
    boolean check = (10 < a +b && a + b <= 20);
        System.out.println(check);
        return check;
    }

    public static void main(String[] args) {
        checkSum(15,1);
    }
}
