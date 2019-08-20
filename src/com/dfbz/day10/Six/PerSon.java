package com.dfbz.day10.Six;

public abstract class PerSon {

    private String name;
    private int age;

    public abstract void eat();

    public PerSon() {
    }

    public PerSon(String name, int age) {
        this.name = name;
        this.age = age;
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
}
