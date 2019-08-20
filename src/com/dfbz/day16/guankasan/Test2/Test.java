package com.dfbz.day16.guankasan.Test2;

import java.util.Random;

public class Test {

    public static void main(String[] args) {


        Random r = new Random();

        int sum=0;
        for (int i=0;i<10;i++){
            int a=r.nextInt(901)+100;
            sum+=a;


            System.out.println(sum);
        }
    }


}
