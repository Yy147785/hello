package com.dfbz.day17;

public class TestShuiBei {

    public static void main(String[] args) {

        ShuiBei s = new ShuiBei();
        Thread t = new Thread(s,"实体店");
        Thread t1= new Thread(s,"官网店");
        t.start();
        t1.start();

    }
}
