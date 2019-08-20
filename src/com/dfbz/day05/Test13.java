package com.dfbz.day05;

import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入:");
        int i = input.nextInt();


        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println(i+"是闰年");

        }else{
            System.out.println(i+"不是闰年");
        }

    }


}
