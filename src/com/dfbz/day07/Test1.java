package com.dfbz.day07;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = input.nextInt();
        System.out.println("请输入第二个数据:");
        int b = input.nextInt();
        System.out.println("请输入第三个数据:");
        int c = input.nextInt();

        int temp=0;
        int max=0;


        if(a<b){
            temp=b;
        }
        if(temp<c){
            temp=c;
        }
        System.out.println("三个数的最大值是："+temp);

    }
}
