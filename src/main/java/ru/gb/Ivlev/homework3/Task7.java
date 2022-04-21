package ru.gb.Ivlev.homework3;

public class Task7 {
    public static boolean methodMass (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        boolean check = (sum%2==0);
        System.out.println(check);
        return check;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{2,2,2,1,2,9,1};
        methodMass(arr);
    }
}
