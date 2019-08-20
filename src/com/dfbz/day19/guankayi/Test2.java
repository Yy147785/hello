package com.dfbz.day19.guankayi;

import java.io.File;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {

            File file = new File("C:\\a.txt");
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        System.out.println(file.isFile());

    }
}
