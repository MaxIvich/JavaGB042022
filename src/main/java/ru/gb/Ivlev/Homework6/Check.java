package ru.gb.Ivlev.Homework6;

public class Check {


    public static void main(String[] args) {


        Animal[] animals= new Animal[]{
       new Cat("Барсик", 4),
       new Cat("Рыжий", 5),
       new Dog("Палкан",6)};


        for (Animal animal:animals) {
            animal.run(50);
        }
        for (Animal animal:animals) {
            animal.swim(5);
        }

        System.out.println("Всего котов : "+Cat.getQuantity());
        System.out.println("Всего собак : " + Dog.getQuantity());
        System.out.println("Всего животных :"+ Animal.getQuantity());


    }
}
