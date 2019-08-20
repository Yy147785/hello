package com.dfbz.zuoye;

import java.util.Scanner;

/**
 * @author YY
 * @description
 * @date2019/8/3
 */


public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day,month,year,dayNum=0;
        while (true){
            System.out.println("请输入年：");
            year= input.nextInt();
            System.out.println("请输入月：");
            month= input.nextInt();
            System.out.println("请输入日：");
            day= input.nextInt();
            if (month<1 || month>12 || day<1 || day>31){
                continue;
            }else{
                break;
            }

        }
        for (int i =1;i<month;i++){
            int days=0;
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days=31;
                    break;
                case 2:
                    if (year %400 ==0 ||(year%4==0 &&year%100!=0)){
                        days=29;
                    }else{
                        days=28;
                    }
                    break;
            }
            dayNum+=days;

        }
        System.out.println("这是本年的第"+(dayNum+day)+"天");
    }
}
