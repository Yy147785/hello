package com.dfbz.day08;


public class Test4 {

    public static void main(String[] args) {

        String str = "HelloWorld";
        char[] a = str.toCharArray();
        for (int i = 0; i <a.length;i++){
            System.out.println(a[i]);
        }
        String b=str.toLowerCase();
        System.out.println("将str字符串转换为小写:"+b);
        String c=str.toUpperCase();
        System.out.println("将str字符串转换为大写:"+c);
        String l=str.replace("o","6");
        System.out.println("将str字符串中的字符'o'替换成'6':"+l);
        String k=str.replace("ll","LL");
        System.out.println("将str字符串中的字符ll替换成LL:"+k);




    }
}
