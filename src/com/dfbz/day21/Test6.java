package com.dfbz.day21;

import java.io.*;

public class Test6 {

    public static void main(String[] args) throws IOException {



        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        char[] ch = new char[6];
        int len;
        while (true){
            len=isr.read(ch);
            if (len==-1){
                break;
            }
            System.out.print(new String(ch,0,len));
        }
        isr.close();
    }
}
