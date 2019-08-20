package com.练习.day15;

import com.练习.day15.Test1;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestTest1 {

    public void main(String[] args) throws Exception {

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();

    }

    static  Class<Test1> clazz;

    @BeforeClass
    public static  void before(){
        clazz= Test1.class;
    }

    @Test
    public void test1(){       //反射所有public 修饰的构造方法
        System.out.println("获取所有public 修饰的构造方法");

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println("-----------------------");
    }

    @Test
    public void test2(){       //反射所有的构造方法
        System.out.println("获取所有的构造方法");

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println("-------------------------");

    }

    @Test
    public void test3() throws Exception{         //反射私有构造方法

        //获取任何修饰符修饰的构造方法
        Constructor<Test1> dc = clazz.getDeclaredConstructor(String.class,String.class);

        //暴力反射
        dc.setAccessible(true);
        //根据指定的构造器创建对象
        Test1 student = dc.newInstance("张三","男");

        System.out.println(student);
        System.out.println("---------------------");

    }

    @Test
    public void test4() throws  Exception{           //反射protected修饰的构造方法

        //获取任何修饰符修饰的构造方法
        Constructor<Test1> dc = clazz.getDeclaredConstructor(String.class,String.class);

        //暴力反射
        dc.setAccessible(true);
        //根据指定的构造器创建对象
        Test1 student = dc.newInstance("张三","男");

        System.out.println(student);
        System.out.println("--------------------------");


    }


    @Test
    public  void test5() throws  Exception{      //反射protected修饰的构造方法

        //获取任何修饰符修饰的构造方法(注意：getConstructor只能获取public修饰的构造)
        //Constructor<Test1> dc = clazz.getConstructor(String.class,String.class);

        Constructor<Test1> dc = clazz.getDeclaredConstructor(String.class,int.class);

        //暴力反射（只要不是public修饰的都需要暴力反射）
        dc.setAccessible(true);
        //根据指定的构造器创建对象
        Test1 student = dc.newInstance("张三",20);
        System.out.println(student);
        System.out.println("-------------------");

    }

    @Test
    public void test6() throws Exception{       //反射public修饰的构造方法

        //获取构造器对象
        Constructor<Test1> dc = clazz.getConstructor(String.class,String.class,int.class);

        //根据指定的构造器创建对象
        Test1 student = dc.newInstance("张三",20);

        System.out.println(student);
        System.out.println("--------------------");

    }
}
