package com.练习.day25练习;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */


public class DemoAnnotation {

    @Test
    public void test1() throws NoSuchMethodException {
        System.out.println("类上注解信息：");
        //获取字节码对象
        Class<TestCompute> clazz = TestCompute.class;
        //获取注解对象
        Compute c = clazz.getAnnotation(Compute.class);
        //通过注解对象获取注解上的值
        String name = c.name();
        double price = c.price();
        String[] factories = c.factories();
        System.out.println(name);
        System.out.println(price);
        System.out.println(Arrays.toString(factories));
        System.out.println("--------------------------");

    }

    @Test
    public void test2() throws NoSuchMethodException {
        System.out.println("方法上注解信息：");
        //获取字节码对象
        Class<TestCompute> clazz1 = TestCompute.class;
        //通过类字节码对象获取方法对象
        Method method = clazz1.getMethod("buyCompute");
        //通过方法对象获取该方法上的注解
        Compute c1 = method.getAnnotation(Compute.class);
        //通过注解对象获取注解上的值
        String name1 = c1.name();
        double price1 = c1.price();
        String[] factories1 = c1.factories();
        System.out.println(name1);
        System.out.println(price1);
        System.out.println(Arrays.toString(factories1));

    }
}
