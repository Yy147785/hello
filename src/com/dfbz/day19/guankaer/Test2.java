package com.dfbz.day19.guankaer;

import java.io.File;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

       File file = new File(str);
       File[] dir =file.listFiles();
       long sum=0L;
       for (File file1 : dir){
           if (file1.isFile()){
               System.out.println(file.getAbsolutePath()+" "+file.length());
           }else{
               System.out.println(file.getAbsolutePath());
               sum+=file.length();

           }
       }
        System.out.println(sum);



    }
}
