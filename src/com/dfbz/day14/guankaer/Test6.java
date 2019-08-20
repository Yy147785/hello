package com.dfbz.day14.guankaer;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        char[] arr=str.toCharArray();

        for (char str1 : arr){
            linkedHashSet.add(str1);
        }
        for (Character str1 : linkedHashSet){
            System.out.print(str1);

        }


    }
}
