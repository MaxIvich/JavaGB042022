package ru.gb.Ivlev.homework1;

public class Task4 {
    public static void printColor(){
        int value = 100;
        if(value <= 0){
            System.out.println("Красный");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }
    public static void main(String[] args) {
        printColor();
    }
}
