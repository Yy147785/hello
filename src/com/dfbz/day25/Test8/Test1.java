package com.dfbz.day25.Test8;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Student student = (Student) createObject();
        System.out.println(student);


    }
    public static  Object createObject(){


        try{
        Properties pro = new Properties();
        pro.load(Test1.class.getResourceAsStream("Student"));
        String className = pro.getProperty("class");
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        Set<String> names = pro.stringPropertyNames();
        for (String name : names){
            if (name.equals("class"));
            String value = pro.getProperty(name);
            Field f = c.getDeclaredField(name);
            f.setAccessible(true);
            Class c1 = f.getType();
            if (c1 == int.class){
                f.setInt(obj,Integer.parseInt(value));
            }else{
                f.set(obj,value);
            }
        }
        return  obj;
        }catch (Exception e){
          throw new RuntimeException(e);
        }
    }
}
