package com.dfbz.day20.guankayi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\aaa\\b.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();

    }
}
