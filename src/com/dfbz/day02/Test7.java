package com.dfbz.day02;

public class Test7 {

    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
        remain();
    }
    public static void add(){
        int x=100;
        int y=200;
        System.out.println("x,y的和为：" + (x+y));

    }
    public static void sub(){
        int x=200;
        int y=100;
        System.out.println("x,y的差为：" + (x-y));

    }
    public static void mul(){
        int x=100;
        int y=200;
        System.out.println("x,y的积为：" + (x*y));

    }
    public static void div(){
        int x=0;
        int y=0;
        System.out.println("x,y的积为：" + (x*y));

    }
    public static void remain(){
        int x=100;
        int y=200;
        System.out.println("x,y的积为：" + (x%y));

    }
}
