package com.dfbz.day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) throws ParseException {

        System.out.println("请输入出生日期：");
       String birthdayString = new Scanner(System.in).next();
        DateFormat slf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = slf.parse(birthdayString);
        Date date = new Date();
        long b =birthday.getTime();
        long d =date.getTime();
        long yy =(d-b);
        if (yy<0){
            System.out.println("你还没有出生");
        }else {
            System.out.println(yy/1000/60/60/24);
        }

    }
}
