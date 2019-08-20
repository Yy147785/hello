package com.dfbz.day18;

import com.dfbz.day10.Six.PerSon;

public class Person extends Thread {

    private Person person;

    private String name;
    private String sex;
    boolean flag = false;


    public Person(String name, Person person, String name1, String sex, boolean flag) {

        this.person = person;
        this.name = name1;
        this.sex = sex;
        this.flag = flag;
    }

    public  Person() {

    }



    Object object = new Object();
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (object) {
                if (person.flag == false) {
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (count % 2 == 0) {
                        person.name = "李磊";
                        person.sex = "男";
                    } else {
                        person.name = "人妖";
                        person.sex = "人妖";
                    }
                    count++;
                    person.flag = false;
                    person.notify();

                }
            }
        }
    }
}
