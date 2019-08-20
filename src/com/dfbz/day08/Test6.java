package com.dfbz.day08;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        String mgc="奥巴马";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = input.next() ;
        str=str.replace(mgc,"*");
        System.out.println(str);

    }
}
