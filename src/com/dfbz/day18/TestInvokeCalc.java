package com.dfbz.day18;

public class TestInvokeCalc {

    public static void main(String[] args) {


        invokeCalc(120,130,(a,b)->b-a);


        invokeCalc(120,130,(a,b)->{
            return b-a;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {

        int result = calculator.calc(a, b);
        System.out.println("结果是:" + result);
    }
}
