package com.练习.day14;

public class Test {

    public static void main(String[] args) {
        int result = sum(1, 1, 3, 5, 2);
        System.out.println(result);
    }

    public static int sum(int ... a) {
        int count = 0;
        for (int num : a) {
            count = count + num;
        }
        return count;
    }
}
