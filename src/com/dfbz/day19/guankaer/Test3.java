package com.dfbz.day19.guankaer;

import java.io.File;

public class Test3 {

    public static void main(String[] args) {
        File file  = new File("C:\\Users\\Administrator\\Desktop\\01_JavaSE【1-25】学生版");
        show(file);
    }


    public static void show(File f){

        File[] files = f.listFiles();
        for (File file1 : files){
            if (file1.isFile()){
                System.out.println(file1.getAbsolutePath());
            }else{
                show(file1);
            }
        }

    }
}
