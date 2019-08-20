package com.dfbz.day14.guankaer;

import java.util.HashSet;
import java.util.Iterator;

public class TestStudent {

    public static void main(String[] args) {




        HashSet<Student> set = new HashSet<>();
        set.add(new Student("张三1",18,"男"));
        set.add(new Student("张三2",18,"男"));
        set.add(new Student("张三3",18,"男"));
        set.add(new Student("张三4",18,"男"));
        set.add(new Student("张三5",18,"男"));
        set.add(new Student("张三6",18,"男"));
        set.add(new Student("张三7",18,"男"));
        set.add(new Student("张三8",18,"男"));
        set.add(new Student("张三9",18,"男"));
        set.add(new Student("张三10",18,"男"));


        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student.getName()+" "+student.getAge()+student.getSex());
        }

        for (Student student : set){
            System.out.println(student.getName()+" "+student.getAge()+student.getSex());
        }



    }
}
