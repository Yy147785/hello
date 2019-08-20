package com.dfbz.day04;

public class Test2 {

    public static void main(String[] agrs) {
        int a = getSum(20);
        System.out.println("总和为" + a);
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
