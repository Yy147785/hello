package com.练习.day14.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ListTest {

    public static void main(String[] args) {
//        ArrayList<Person> list = new ArrayList<>();
//        Person person1 = new Person("马云", 55);
//        Person person2 = new Person("雷军", 50);
//        Person person3 = new Person("扫地僧", 150);
//        list.add(person1);
//        list.add(person2);
//        list.add(person3);
//
//        for (int i = 0; i < list.size(); i++) {
//            Person person = list.get(i);
//            System.out.println("person======:" + person);
//        }

//        testSet();
//        test();
        linkSet();
    }

    public static void testSet() {
        HashSet<Person> set = new HashSet<>();
        Person person1 = new Person("马云", 55);
        Person person2 = new Person("马云", 55);
        Person person3 = new Person("扫地僧", 150);
        set.add(person1);
        set.add(person2);
        set.add(person3);

        Iterator<Person> it = set.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            System.out.println("====:" + person.getName());
        }

    }

    public static void test() {
        Person person = new Person("奥巴马", 60);
        Person person2 = new Person("奥巴马", 60);

//        com.dfbz.day14.obj.Person@2cfb4a64
//        com.dfbz.day14.obj.Person@5474c6c
//                ==:false
//        equals:false

        //  == 和equals
        System.out.println(person);
        System.out.println(person2);
        System.out.println("==:" + (person == person2));
        System.out.println("equals:" + person.equals(person2));

    }

    public static void linkSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("鸠摩智");
        set.add("马云");

        for (String name : set) {
            System.out.println(name);
        }
    }

    //    public void test2(int a,int b,int c,int d){
    public void test2(int... a) {

    }
}
