package com.dfbz.day21;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\d.txt") ;
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.close();
        fos.close();




    }
}
