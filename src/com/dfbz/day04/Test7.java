package com.dfbz.day04;

public class Test7 {

    public static void main(String[] args) {

        double x = round(10.3);
        System.out.println(x);

    }

    public static double round(double d) {
        int i = (int) (d + 0.5);
        return i;

    }


}
