package ru.gb.Ivlev.homework2;

public class task3 {
    private static boolean newCheckIndication (int a){
        boolean check = a < 0;
        System.out.println(check);
        return check;
    }
    public static void main(String[] args) {
        newCheckIndication(-22);

    }
}
