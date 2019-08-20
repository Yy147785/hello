package com.dfbz.day19.guankaer;

import java.io.File;
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        File file = new File(str);


    }

    public static  long calculate(File file){

        File[] files = file.listFiles();
        long size=0;
        for (File file1 : files){
            if (file1.isFile()){
                System.out.println(file1.length());
                size+=file1.length();
            }else{
                    return calculate(file1);
            }
        }
            return size;

    }
}
