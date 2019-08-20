package com.dfbz.day03;

public class Test7 {

    public static void main(String[] args) {

        int count=0;
        for(int i =2;i<=60;i+=2){
            System.out.print(i+" ");
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
