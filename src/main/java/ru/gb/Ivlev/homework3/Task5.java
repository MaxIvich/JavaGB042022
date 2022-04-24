package ru.gb.Ivlev.homework3;

public class Task5 {
    public static int[] method(int len,int initialValue){
        int[] mass =new int[len];
        for (int i = 0; i < mass.length; i++) {
            mass[i]=initialValue;
            System.out.printf("%3d",mass[i]);
        }
        return mass;
    }
    public static void main(String[] args) {
        method(10,12);
    }
}
