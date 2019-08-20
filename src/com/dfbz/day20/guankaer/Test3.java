package com.dfbz.day20.guankaer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) throws IOException {


        System.out.println(show('a'));


    }


    public static int show(char ch) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\test.txt");
        int len;
        int num = 0;
        while ((len = fis.read()) != -1) {
            if (ch == (char) len) {
                num++;
            }

        }
        return num;


    }
}
