package ru.gb.Ivlev.homework3;

public class Task1 {

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < 10; i++) {
            if(a[i]>0){
                a[i]=0;
            }
            else {
                a[i]=1;
            }
            System.out.printf("%2d",a[i]);
        }
    }
}
