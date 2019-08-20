package com.dfbz.day19.guankasan;

import java.io.File;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        File file = new File(str);
        show(file);
    }

    public static void show(File file){
        if (file.exists()){
            if (file.isFile()){
                file.delete();
            }else{
                File[] files = file.listFiles();
                for (File file1 : files){
                    show(file);
                }
            }
            file.delete();
        }else{
            System.out.println("不存在");
        }

    }
}
