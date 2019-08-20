package com.dfbz.day02;

public class Test6 {

    public static void main(String[] args) {
        printString();
    }
    public static void printString(){
        int num=70;
        String str=(num%2==0)?"偶数":"奇数";
        System.out.println("num：" + num + "是" + str);
    }
}
