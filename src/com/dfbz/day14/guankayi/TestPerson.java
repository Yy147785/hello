package com.dfbz.day14.guankayi;

import com.dfbz.day14.guankayi.Person;

import java.util.HashSet;

public class TestPerson {

    public static void main(String[] args) {


        HashSet<Person> list = new HashSet<>();
        list.add(new Person("张三",18));
        list.add(new Person("张三",20));
        list.add(new Person("李四",22));
        list.add(new Person("李四",24));

        for (Person person : list) {
            System.out.println(person.getName()+person.getAge());

            
        }
           
        

    }
}
