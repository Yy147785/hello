package com.dfbz.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test10 {

    public static void main(String[] args) {

        try {
            FileInputStream fis =  new FileInputStream("C:\\a.txt");
            FileOutputStream fos  = new FileOutputStream("D:\\y.txt");
            byte[] b = new byte[1024];
            int len;
            while ((len=fis.read(b))!=-1){
                fos.write(b,0,len);
            }
            FileInputStream fileInputStream  = new FileInputStream("D:\\y.txt");
            byte[] b1 = new byte[1024];
            int leng;
            while(true){
                 leng=fileInputStream.read(b1);
                 if (leng==-1){
                     break;
                 }
                System.out.println(new String(b1,0,leng));

            }
            fis.close();
            fos.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
