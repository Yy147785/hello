package com.dfbz.day25.Test5;

import com.dfbz.day25.Test5.A;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestA {

    public static void main(String[] args) throws Exception {



        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = input.next();
        Class<?> c=Class.forName(s);
        A a = (A)c.newInstance();
        Method method =c.getMethod("showString");
        Object i = method.invoke(a);
        System.out.println(i);
    }
}
