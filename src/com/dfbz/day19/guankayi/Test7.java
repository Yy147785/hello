package com.dfbz.day19.guankayi;

import java.io.File;

public class Test7 {

    public static void main(String[] args) {

        File file = new File("C:\\a.txt");
        File file1 = new File("C:\\aaa");
        if (file.isFile()){
            System.out.println(file.getAbsolutePath()+"是个文件夹");
        }else{
            System.out.println(file.getAbsolutePath()+"是个文件");
        }

        if (file1.isFile()){
            System.out.println(file1.getAbsolutePath()+"是个文件");
        }else{
            System.out.println(file1.getAbsolutePath()+"是个文件夹");
        }

    }
}
