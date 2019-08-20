package com.dfbz.day19.guankayi;

import java.io.File;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\bbb");
        System.out.println(file.exists());
        System.out.println(file.mkdir());
        System.out.println(file.exists());


    }
}
