package ru.gb.Ivlev.homework3;

public class task8 {
    public static void methodShift(int[] arr,int n){
        for (int i = 0; i < arr.length-n; i++) {
            int g = arr[i+n];

                arr[i + n] = arr[i];
                arr[i] = g;


            System.out.println(arr[i]);

        }





    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        methodShift(arr,2);

    }
}
