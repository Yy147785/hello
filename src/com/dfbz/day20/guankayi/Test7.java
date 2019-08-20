package com.dfbz.day20.guankayi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\a.png");
        FileOutputStream fos = new FileOutputStream("D:\\a.png");

        byte[] b = new byte[2];
        int len;
        while (true) {

            len=fis.read(b);
            if (len==-1){
                break;
            }
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
