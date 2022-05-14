package ru.gb.Ivlev.Homework7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Барсик", 15, false),
                new Cat("Барсик1", 15, false),
                new Cat("Барсик2", 15, false),
                new Cat("Барсик3", 60, false),
        };
        Plate plate = new Plate(50);
        for (Cat cat:cats) {
            cat.eat(plate);
            System.out.println(cat.toString());
        }
            plate.info();
    }

}
