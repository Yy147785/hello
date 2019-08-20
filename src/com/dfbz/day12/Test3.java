package com.dfbz.day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

    public static void main(String[] args) {


        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=df.format (date);
        System.out.println(str);



    }
}
