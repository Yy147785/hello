package com.dfbz.day19.guankaer;

import java.io.File;
import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        String str = input.next();
        File file = new File(str);
        File[] files = file.listFiles();
        for (File file1 : files){
            System.out.println(file1.delete());

        }
        System.out.println(file.delete());


    }
}
