package com.dfbz.day21;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\e.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str="i love java";
        byte[] b = str.getBytes();
        bos.write(b);
        bos.close();
        fos.close();
    }
}
