package com.dfbz.day02;

public class Test5 {

    public static void main(String[] args) {

        printNum();
    }
         public static void printNum(){
             float f1=12345.01F;
             float f2=12345.00F;
             float var1=(f1>=f2)?12456:12456.02F;
             float var2=var1+1024;
            System.out.println("var1的值是:" + var1 + ",var2的值是:" + var2);
        }





}
