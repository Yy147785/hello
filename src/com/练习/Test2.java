package com.练习;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {

    public static void main(String[] args)throws  Exception {


        try {
            FileInputStream fis = new FileInputStream("C:\\a.txt");
            FileOutputStream fos = new FileOutputStream("D:\\test2");
            int len;
            while(true){
                len=fis.read();
                if (len==-1){
                    break;
                }
                fos.write(len);
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
