package com.dfbz.day07;

import java.util.Random;

public class Test2 {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int n = random.nextInt(10) + 1;
            System.out.println(n);

        }
    }
}
