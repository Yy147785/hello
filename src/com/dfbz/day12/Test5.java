package com.dfbz.day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test5 {

    public static void main(String[] args) {


        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int dayofmonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayofmonth+"日");

        cal.add(Calendar.DAY_OF_MONTH,500);
         Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String str=dateFormat.format(date);


        System.out.println(str);


    }
}
