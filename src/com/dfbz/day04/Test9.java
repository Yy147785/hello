package com.dfbz.day04;

public class Test9 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(n + "*" + i + "=" + n * i + "\t");
            }
            System.out.println();
        }
    }
}
