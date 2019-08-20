package com.dfbz.day19.guankayi;

import java.io.File;

public class Test4 {

    public static void main(String[] args) {

        File file = new File("C:\\ccc\\bbb\\aaa");
        file.mkdirs();
        System.out.println(file.exists());
    }
}
