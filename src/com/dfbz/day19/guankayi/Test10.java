package com.dfbz.day19.guankayi;

public class Test10 {

    public static void main(String[] args) {


        int num=5;
        int sum =show(num);
        System.out.println(sum);
    }

    public static int show(int num){
        if (num==1){
            return 1;
        }
        return num*show(num-1);

    }
}
