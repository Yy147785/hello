package com.dfbz.day04;

public class Test4 {

    public static void main(String[] args) {

        char aChar=getChar(50);
        System.out.println("字符" + aChar);

    }

    public static char getChar(int num) {
        char ch = (char) num;
        if (ch >= 97 && ch <= 122 || ch>=65 && ch<=90 || ch>=48 && ch<=57) {
            return ch;
        }
        return 0;
    }
}
