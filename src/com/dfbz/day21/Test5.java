package com.dfbz.day21;

import sun.nio.cs.ext.GBK;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test5 {

    public static void main(String[] args)throws IOException {

        FileOutputStream fos = new FileOutputStream("a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        String str = "我爱java";
        osw.write(str);
        osw.close();

    }
}
