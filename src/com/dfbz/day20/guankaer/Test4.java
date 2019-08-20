package com.dfbz.day20.guankaer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test4 {

    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        /*p.setProperty("张三","90");
        p.setProperty("lisi","80");
        p.setProperty("王五","85");*/
        p.load(new FileInputStream("C:\\score.txt"));

        Set<String> set = p.stringPropertyNames();
        for (String str : set){
            if (str.equals("lisi")){
                p.setProperty(str,"100");
            }

            System.out.println(str+p.getProperty(str));
        }

    }
}
