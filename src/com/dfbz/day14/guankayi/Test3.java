package com.dfbz.day14.guankayi;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {

    public static void main(String[] args) {


        HashSet<String> list = new HashSet<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str=it.next();

        System.out.println(str);
        }
    }
}
