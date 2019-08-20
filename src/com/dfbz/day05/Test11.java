package com.dfbz.day05;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] chars = str.toCharArray();
        if (chars[0] >= 97 && chars[0] <= 122) {
            chars[0] -= 32;
        } else if (chars[0] >= 65 && chars[0] <= 90) {
            chars[0] += 32;
        }
        System.out.println(chars[0]);





    }
}
