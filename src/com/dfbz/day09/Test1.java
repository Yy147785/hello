package com.dfbz.day09;

public class Test1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name="旺财";
        dog.color="黄色";
        dog.money=200;
        dog.eat();
        dog.lookHome();
        System.out.println("-------------------------");

        Cat cat = new Cat();
        cat.name="波斯猫";
        cat.color="白色";
        cat.money=300;
        cat.eat();
        cat.catchMouse();


    }
}
