package com.dfbz.day08;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个QQ号码:");
        String qq=input.next();
        boolean isOK =  checkQQ(qq);
        System.out.println("这个QQ号码是否正确:"+isOK);



    }
    public static boolean checkQQ(String qq){
        if (qq.length()<5||qq.length()>12){
            return false;
        }
        if(qq.charAt(0)==0){
            return false;
        }
        for (int i=0;i<qq.length();i++){
            char yy = qq.charAt(i);
            if ( yy<'0'||yy>'9'){
                return false;
            }

        }
        return true;
    }
}
