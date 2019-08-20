package com.dfbz.day09;

public  class GongJi extends Poultry {

    public GongJi() {
    }

    public GongJi(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");

    }
    public void daming(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");

    }
}
