package com.dfbz.day04;

public class Test6 {

    public static void main(String[] args) {

         abc(10);
    }
    public static void abc(int m){
        for(int i =1;i<=m;i++){
            for(int n=1;n<=m;n++){
                if(i==n || i+n==m+1){
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }

            }
                System.out.println();
        }
    }
}
