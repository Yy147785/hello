package com.dfbz.day21;

import java.io.*;

public class Test3 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\c.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:\\c.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] b= new byte[2];
        int len;
        while (true){
            len=bis.read(b);
            if (len==-1){
                break;
            }
            bos.write(b,0,len);

        }
        bos.close();
        fos.close();
        bis.close();
        fis.close();


    }
}
