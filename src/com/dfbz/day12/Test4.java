package com.dfbz.day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {

    public static void main(String[] args) throws ParseException {


        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
         String str = "1992年10月20日";
        Date date = df.parse(str);
        System.out.println(date);


    }
}
