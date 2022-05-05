package ru.gb.Ivlev.Homework6;

public class Dog extends Animal {
    private static int quantity;
    public Dog(String name,int age){
        super(name,age);
        quantity++;
    }
    public static int getQuantity(){
        return quantity;
    }



    @Override
    public void run(int a) {
        if (a > 0) {
            if (a <= 500) {
                System.out.println(getName() + " пробежал " + a + "  метров");
            } else {
                System.out.println(getName() + "  устал на 200 метров ");
            }
        }

    }

    @Override
    public void swim(int b) {
        if (b > 0 && b <= 10) {
            System.out.println(getName() + " проплыл " + b + "  метров");

        }

    }



}
