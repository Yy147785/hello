package com.dfbz.day03;

public class Test9 {

    public static void main(String[] agrs) {

        for (int i = 1; i <=7 ; i++) {
            for (int n = 1; n <=7 ; n++) {
                if (i == n || i + n == 8) {
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
