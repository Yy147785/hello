package com.dfbz.day09;

public  class YaZi extends Poultry {
    public YaZi() {
    }

    public YaZi(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {

        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");

    }

    public void  Swimming(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");

    }
}
