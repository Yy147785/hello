package com.练习.day14.cellection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestList {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(23);
//        list.add(1);
//        list.add(15);
//        list.add(16);
//        Collections.addAll(list, 2, 23, 1, 15, 16);

//        Integer temp;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < i; j++) {
//                if (list.get(i) > list.get(j)) {
//                    temp = list.get(j);
//                    list.set(j, list.get(i));
//                    list.set(i, temp);
//                }
//            }
//        }
//        Collections.sort(list);
//        Comparator<Integer> comparator=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        };

//        ComparatorIml comparator = new ComparatorIml();

//        Collections.sort(list, comparator);
//        for (Integer i : list) {
//            System.out.println("i:" + i);
//        }

//        testString();

        TestList testList = new TestList();
        testList.testPerson();
    }

    public static void testString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("Acc");
        list.add("bac");

        Collections.sort(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        for (String str : list) {
            System.out.println("str:" + str);
        }
    }

    public void testPerson() {
        ArrayList<Person> list = new ArrayList<>();
        Person person = new Person("a", 50);
        Person person2 = new Person("c", 50);
        Person person3 = new Person("b", 55);
        Person person4 = new Person("d", 55);
        Person person5 = new Person("b", 50);
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);


        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //按照年龄降序
                // 按照姓名首字母升序
                int result = o2.getAge() - o1.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }

                return result;
            }
        });

//        Collections.sort(list);

        for (Person p : list) {
            System.out.println(p.getAge() + p.getName());
        }

    }
}
