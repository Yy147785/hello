package com.dfbz.day21;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        try {
            PrintStream ps = new PrintStream("d.txt");
            String str = input.next();
            ps.println(str);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
