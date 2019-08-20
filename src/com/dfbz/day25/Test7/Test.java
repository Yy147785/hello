package com.dfbz.day25.Test7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception{

        Class<Person> c = Person.class;
        Constructor<Person> constructors = c.getConstructor(String.class,int.class);
        Person person =constructors.newInstance("阿萨德",57);
        System.out.println(person);

        Method method = c.getMethod("setAge", int.class);
        Method method2 = c.getMethod("setName", String.class);
        method.invoke(person,26);
        method2.invoke(person,95);
        System.out.println(person);

    }
}
