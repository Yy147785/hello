package com.练习;

import org.junit.*;

public class Test1 {

    @BeforeClass
    public  static  void init(){
        System.out.println("类加载时，只能运行一次");
    }

    @Before
    public void myBefore(){
        System.out.println("方法前");
    }

    @Test
    public void method(){
        System.out.println("我是测试方法method");

    }

    @Test
    public void show(){
        System.out.println("我是测试方法show");
    }

    @After
    public void myAfter(){
        System.out.println("方法后");
    }

    @AfterClass
    public static  void destory(){
        System.out.println("类结束前，只能运行一次");
    }






}
