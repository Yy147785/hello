package com.dfbz.day05;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请输入:");
        System.out.print("请输入第一条边:");
        int i=input.nextInt();
        System.out.println("请输入第二条边:");
        int o=input.nextInt();
        System.out.println("请输入第三条边");
        int p=input.nextInt();


        if((i+o>=p)||(p-i<=o)){
            System.out.println("是三角形");

        }else{
            System.out.println("不是三角形");
        }




    }
}
