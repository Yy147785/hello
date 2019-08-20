package com.dfbz.day12;

public class Test7 {

    public static void main(String[] args) {

        String str = "26";
        long start = System.currentTimeMillis();

        for (int i = 0; i <10000 ; i++) {

            str = str.concat(i+" ");
            System.out.println(str);

        }
        long end = System.currentTimeMillis();
        long v = (end-start);
        System.out.print("共耗时"+v);
    }
}
