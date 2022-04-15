package ru.gb.Ivlev.homework2;

public class task2 {
    public static void checkIndication(int a){
        if(a >= 0){
            System.out.println("Число положительно");
        }
        else {
            System.out.println("Число отрицательно");
        }
    }
    public static void main(String[] args) {
        checkIndication(-2);
    }
}
