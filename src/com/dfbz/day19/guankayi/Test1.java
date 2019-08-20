package com.dfbz.day19.guankayi;

import java.io.File;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\1\\2.txt");
        System.out.println(file.exists());


        String str = "D\\1";
        String str1 = "\\2.txt";
        File file1 = new File(str+str1);
        System.out.println(file1);

    }
}
