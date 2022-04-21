package ru.gb.Ivlev.homework3;

import java.util.Arrays;

public class task8 {
    public static void methodShift(int[] arr,int n){
        if (n > arr.length) {
            n = n- arr.length;}
        for (int i = 0; i < arr.length-n; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int g = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = g;
                }
            }
        String a = Arrays.toString(arr);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        methodShift(arr,7);
    }
}
