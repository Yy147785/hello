package com.dfbz.day03;

public class Test6 {

    public static void main(String[] args) {

        for(int i =100;i<999;i++){
            int bai=i/100;
            int shi=i/10%10;
            int ge=i%10;
            if((bai*bai*bai+shi*shi*shi+ge*ge*ge)==i){
                System.out.println(i);

            }
        }
    }
}
