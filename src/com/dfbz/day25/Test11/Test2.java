package com.dfbz.day25.Test11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */
public class Test2 {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Test> clazz = Test.class;
        Test t = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method m:methods){
            if (m.isAnnotationPresent(MyTest.class));
            m.invoke(t);
        }
    }
}
