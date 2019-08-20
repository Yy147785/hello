package com.练习.day15;

public class Test1 {

    private String name;
    public  String sex;
    private int age;

    public Test1(String name, String sex, int age) {
        System.out.println("有参构造方法");
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Test1(String name, String sex) {
        System.out.println("私有构造");
        this.name = name;
        this.sex = sex;
    }

    public Test1(){
        System.out.println("无参构造");
    }

    Test1(String name){
        System.out.println("我是默认修饰符");
        this.name=name;
    }

    protected  Test1(String name,int age){
        System.out.println("我是protected修饰符");
        this.name=name;
        this.age=age;
    }

    //共有方法
    public void eat(){
        System.out.println("吃饭");
    }

    //有参方法
    public void sleep(int hour){
        System.out.println("我每天睡"+hour+"小时");
    }

    //私有方法
    private void show(){
        System.out.println("表演");
    }

    //静态方法
    public static  void study(){
        System.out.println("学习JavaSE");
    }

    //静态私有方法
    private static void studyX(){
        System.out.println("学习JavaEE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
