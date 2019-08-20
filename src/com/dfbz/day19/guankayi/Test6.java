package com.dfbz.day19.guankayi;

import java.io.File;
import java.io.IOException;

public class Test6 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\aaa\\b.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());



    }
}
