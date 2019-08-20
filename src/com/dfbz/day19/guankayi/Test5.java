package com.dfbz.day19.guankayi;

import java.io.File;
import java.io.IOException;

public class Test5 {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\a.txt");
        System.out.println(file.delete());

        File file1 = new File("C:\\ccc\\bbb\\aaa");
        System.out.println(file1.delete());
    }
}
