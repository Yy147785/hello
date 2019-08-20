package com.dfbz.day12;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {

        Test11 test11 = new Test11();

        Scanner input = new Scanner(System.in);
        System.out.println("\t"+"欢迎使用超市购物系统");
        System.out.println("请输入你要进行的操作:");
        System.out.println("1:购买商品\t2:结算并打印小票\t3:退出系统");
        int a = input.nextInt();
    }



}
