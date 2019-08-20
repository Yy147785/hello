package com.dfbz.day20.guankayi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\6.txt");
        byte[] bytes = new byte[2];
        int len;
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();


    }
}
