package com.dfbz.day14.guankaer;

import java.util.HashSet;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            System.out.println("请输入数字：");
            Integer a = input.nextInt();
            if (a == -1) {
                System.out.println("退出循环");
                break;
            } else {
                set.add(a);
            }
        }
        int sum = 0;
        for (Integer it : set) {
            sum += it;
        }
        double avg = sum / set.size();
        System.out.println("总和：" + sum);
        System.out.println("平均值" + avg);


    }
}
