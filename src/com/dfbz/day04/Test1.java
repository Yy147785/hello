package com.dfbz.day04;

public class Test1 {

    public static void main(String[] args) {

        printEven(20);
    }
    public static void printEven(int n ){
        for(int i =2;i<=20;i++){
            if(i%2==0){

                System.out.println(i);
            }
        }

    }
}
