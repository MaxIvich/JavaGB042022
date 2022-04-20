package ru.gb.Ivlev.homework3;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,4,2,6,4,87,521,8,4};
        int max = arr[0];
        int min = arr[0];


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }

}
