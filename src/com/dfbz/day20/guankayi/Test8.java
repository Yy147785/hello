package com.dfbz.day20.guankayi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) throws IOException {

        Scanner input  = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:\\6.txt");

        while (true){
            String str = input.next();
            if(str.equals("886")){
                break;
            }
            char[] chars =str.toCharArray();
            fw.write(chars);
            fw.write("\r\n");
        }
        fw.close();




    }
}
