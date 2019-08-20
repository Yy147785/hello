package com.dfbz.day03;

public class Test11 {

    public static void main(String[] args) {
        int i = 1;

        do {
            int n = 1;

            do {

                System.out.print(n + "*" + i + "=" + (n * i) + "\t");
                n++;


            } while (n <= i);

            System.out.println();
            i++;
        } while (i <= 9);
    }
}
