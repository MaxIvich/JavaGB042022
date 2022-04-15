package ru.gb.Ivlev.homework2;

public class task4 {
    public static void stringPrint (String b,int a){
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        stringPrint("Вроде бы верно",7);
    }
}
