package com.dfbz.day09;

public class Teacher1 extends Person1 {

    private String xueke;

    public void Teaching(){
        System.out.println(getName()+",讲授Java课");


    }

    public String getXueke() {
        return xueke;
    }

    public void setXueke(String xueke) {
        this.xueke = xueke;
    }

    public Teacher1(){

    }

    public Teacher1(String name, int age) {
        super(name, age);
    }
}
