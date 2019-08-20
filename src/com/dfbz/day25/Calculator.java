package com.dfbz.day25;

import org.junit.Before;
import org.junit.Test;

public class Calculator {

    public  void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
    }


    @Before
    public void test() {



    }

    @Test
    public void test1() {
        System.out.println("加");

    }

    @Test
    public void test2() {
        System.out.println("减");

    }

    @Test
    public void test3() {
        System.out.println("乘");

    }

    @Test
    public void test4() {

        System.out.println("除");

    }
}