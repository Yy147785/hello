package com.练习;

import com.dfbz.day15.zuoye.Student;

public class Person {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Student.class;
        System.out.println(c);


        Class c2 = Class.forName("com.dfbz.day15.zuoye.Student");
        System.out.println(c2);





        Student student = new Student();
        Class c1 = student.getClass();
        System.out.println(c);

    }
}
