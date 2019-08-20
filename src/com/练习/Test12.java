package com.练习;

import java.io.IOException;

public class Test12 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class c = Class.forName("com.dfbz.day15.zuoye.Test1");

        String name=c.getName();
        String name1=c.getSimpleName();
        String s = (String) c.newInstance();
        System.out.println(name);
        System.out.println(name1);
        System.out.println(s);
    }
}
