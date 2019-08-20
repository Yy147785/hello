package com.练习.day06;

import java.util.Scanner;

public class MyDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("日期：");

        String str = input.next();
        String str1 = str.substring(0,4);
        int year = Integer.valueOf(str1);
        showDate(year);

    }



    public  static void showDate(int year){


            if (year%100!=0 && year%4==0 || year%100==0 && year%400==0){
                System.out.println(year+"是闰年:");

            }else{
                System.out.println(year+"不是闰年");
            }
    }




    public MyDay() {
    }


}
