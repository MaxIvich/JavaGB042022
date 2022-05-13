package ru.gb.Ivlev.Homework6;

public abstract class Animal {
    private String name;
    private int age;
    private static int quantity;

   public Animal(String name, int age){
       this.name= name;
       this.age = age;
       quantity ++;
       }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static int getQuantity(){
        return quantity;
    }
    public abstract  void run(int a);

    public abstract  void swim(int b);




}
