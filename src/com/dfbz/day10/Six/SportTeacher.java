package com.dfbz.day10.Six;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name,age);
    }

    @Override
    public void playBasketball(){
        System.out.println("年龄为:"+this.getAge()+" 岁 "+this.getName()+" 的老师在打篮球");

    }
}
