package com.dfbz.day20.guankayi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("C:\\6.txt");
        int read = fis.read();
        System.out.println((char)read);
        read = fis.read();
        System.out.println((char)read);
        read = fis.read();
        System.out.println((char)read);
        read = fis.read();
        System.out.println((char)read);
        read = fis.read();
        System.out.println((char)read);
        read = fis.read();
        System.out.println( read);

        fis.close();




    }
}
