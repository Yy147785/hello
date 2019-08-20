package com.dfbz.day19.guankayi;

import static com.dfbz.day04.Test2.getSum;

public class Test9 {

    public static void main(String[] args) {

        int num=150;
        int sum=getSum(num);
        System.out.println(sum);
    }

    public static  int show(int num){
        if (num==1){
            return 1;
        }
        return num+show(num-1);
    }
}
