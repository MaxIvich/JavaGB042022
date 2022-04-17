package ru.gb.Ivlev.homework2;

public class task5 {
    private static boolean leapYear(int a) {
        boolean leap = (a % 400 ==0||a % 4 == 0 && (!( a % 100 ==0) ));
                System.out.println(leap);
                return leap;
      }
      public static void main(String[] args) {
        leapYear(2100);
    }
}
