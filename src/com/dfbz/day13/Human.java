package com.dfbz.day13;

public class Human {

    private  String name;
    private  int age;
    private double heigth;

    public Human() {
    }

    public Human(String name, int age, double heigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}
