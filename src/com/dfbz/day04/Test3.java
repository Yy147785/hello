package com.dfbz.day04;

public class Test3 {

    public static void main(String[] args) {

        int zc=getPerimeter( 20, 8);
        System.out.println("长方形的周长：" +zc);
        int mj=getArea(20 ,8);
        System.out.println("长方形的面积：" +mj);




    }
    public static int getPerimeter(int length,int width){
        int zc=(length+width)*2;
        return zc;

    }
    public static int getArea(int length,int width){
        int mj=(length*width);
        return mj;
    }
}
