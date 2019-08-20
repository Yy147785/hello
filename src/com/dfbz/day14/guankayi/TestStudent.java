package com.dfbz.day14.guankayi;

import java.util.HashSet;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("张三",18);
        Student student2 = new Student("李四",18);
        Student student3 = new Student("王五",18);
        Student student4 = new Student("张三",18);
        Student student5 = new Student("李四",18);
        HashSet<Student> list = new HashSet<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        for (Student sd : list){
            System.out.println(sd.getName()+sd.getAge());
        }



    }


}
