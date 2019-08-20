package com.dfbz.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2016-12-18";
        Date date = df.parse(str);
        System.out.println(str);


        df.applyPattern("yyyy年MM月dd日");
        String str2 = df.format(date);

        System.out.println(str2);

    }
}
