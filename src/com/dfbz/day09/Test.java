package com.dfbz.day09;

public class Test {

    public static void main(String[] args) {

        Coder coder = new Coder();
        coder.name="马化腾";
        coder.age=45;
        coder.eat();
        coder.sleep();
        coder.work();
        System.out.println("---------------");

        Teacher teacher = new Teacher();
        teacher.name="马云";
        teacher.age=55;
        teacher.eat();
        teacher.sleep();
        teacher.shangke();
    }
}
