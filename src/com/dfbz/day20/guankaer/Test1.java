package com.dfbz.day20.guankaer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("C:\\stu.txt");
        while (true){
            String str = input.next();
            if (str.equals("end")){
                break;
            }
                fos.write(str.getBytes());
                fos.flush();
        }
        fos.close();

    }
}
