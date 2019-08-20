package com.dfbz.day25;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) throws  Exception {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Class c = list.getClass();
        Method method = c.getMethod("张三",Object.class);
        method.invoke(list,"admin");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
