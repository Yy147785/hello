package com.dfbz.day19.guankasan;

import java.io.File;

public class Test1 {

    public static void main(String[] args) {

        File file = new File("C:\\aaa");
        printDir(file);
    }

    public static  void printDir(File file){
        File[] files=file.listFiles();
        for (File file1 : files){
            if (file1.isFile()){
                if (file1.length()<200){
                    System.out.println("文件名:"+file1.getName()+file1.length());
                }
            }else{
                printDir(file);
            }
        }

    }
}
