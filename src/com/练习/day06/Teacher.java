package com.练习.day06;

public class Teacher {

    private String name;
    private int age;
    private String content;

    public void eat(){

        System.out.println("年龄为："+age+"的"+name+"正在吃饭.......");

    }

    public  void teach(){
        System.out.println("年龄为："+age+"的"+name+"正在亢奋的讲着"+content+"......");

    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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
}
