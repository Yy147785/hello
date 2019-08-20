package com.dfbz.day19.guankayi;

import java.io.File;

public class Test8 {

    public static void main(String[] args) {


        File dir = new File("C:\\ccc");

        String[] names = dir.list();
        for (String s : names){
            System.out.println(s);
        }



    }
}
