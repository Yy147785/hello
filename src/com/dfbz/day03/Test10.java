package com.dfbz.day03;

public class Test10 {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 9) {
            int n = 1;
            while (n <= i) {
                System.out.print(n + "*" + i + "=" + (n * i) + "\t");
                n++;
            }
            System.out.println();
            i++;
        }
    }
}
