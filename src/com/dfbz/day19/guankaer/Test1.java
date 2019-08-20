package com.dfbz.day19.guankaer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        String str=input.next();

        File file = new File(str);
        if (!file.exists()){
            System.out.println(file.createNewFile()+"创好了");
            System.out.println(file.length()+"字节");

        }else{
            System.out.println(file.getAbsolutePath()+"存在");
        }


    }
}
