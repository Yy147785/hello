package com.dfbz.day19.guankaer;

import java.io.File;
import java.io.FileFilter;

public class Test4 {

    public static void main(String[] args) {
        File dir = new File("C:\\aaa");
        printDir(dir);



    }

    public static  void printDir(File dir){
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return
                pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
        for (File file : files){
            if (file.isFile()){
                System.out.println("文件名:"+file.getAbsolutePath());
            }else{
                printDir(file);
            }
        }

    }
}
