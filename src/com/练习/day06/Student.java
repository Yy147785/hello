package com.练习.day06;

public class Student {

    private String name;
    private int age;
    private String content;


    public void eat(){

        System.out.println("年龄为："+age+"的"+name+"正在吃饭.......");

    }

    public void study(){

        System.out.println("年龄为："+age+"的"+name+"正在专心致志的听着"+content+"......");

    }

    public Student() {
    }

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
