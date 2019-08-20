package com.dfbz.day05;

public class Test12 {

    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=200){
            i++;
            if(i%3==0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
