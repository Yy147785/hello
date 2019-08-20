package com.dfbz.day08;

public class Test3 {

    public static void main(String[] args) {


        String str = "123456789456456";
        System.out.println("str字符串的长度:"+str.length());
        System.out.println("str字符串索引为2的char值:"+str.charAt(2));
        System.out.println("字符串5第一次出现在str字符串中的索引:"+str.indexOf("5"));
        System.out.println("截取字符串str从索引6开始到结束:"+str.substring(6));
        System.out.println("截取字符串str,从索引2开始到索引7:"+str.substring(2,7));


    }
}
