package com.dfbz.day09;

public  abstract class Poultry {

    String color;
    int age;

    public abstract void  eat();

    public Poultry() {
    }

    public Poultry(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
