package com.dfbz.day14.guankasan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",18));
        list.add(new Student("李四",20));
        list.add(new Student("王五",22));

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("丁三",24));
        list1.add(new Student("狗蛋",26));
        list1.add(new Student("狗子",28));

        HashSet<Student> set = new HashSet<>();
        set.addAll(list);
        set.addAll(list1);


        for (Student str :set){
            System.out.println(str.getName()+" "+str.getAge());
        }

        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student student=it.next();
            System.out.println(student.getName()+" "+student.getAge());
        }



    }
}
