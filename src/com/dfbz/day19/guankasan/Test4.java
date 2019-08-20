package com.dfbz.day19.guankasan;

import java.io.File;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        File dir = new File(str);
        print(dir);


    }
    public static void print(File dir){
        File[] files = dir.listFiles();
        for (File file :files){
            if (file.isFile()){
                System.out.println(file.getName());
            }else {
                print(file);
            }


        }



    }
}
