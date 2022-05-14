package ru.gb.Ivlev.Homework7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int amount) {
       addFood(amount);
        if(amount>food){
            return false;
        }
        else food -= amount;
        return true;

    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
    public void addFood(int a) {
        if(a>this.food){
            this.food=this.food+(a-this.food);
        }

    }

}
