package com.dfbz.day20.guankayi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("C:\\aaa\\b.txt");
        byte[] f ="东方标准".getBytes();
        fos.write(f);
    }
}
