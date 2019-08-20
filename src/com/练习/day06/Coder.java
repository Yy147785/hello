package com.练习.day06;

public class Coder {

    private String name;
    private String gonghao;
    private int xinzi;

    public void intro(){
        System.out.println("程序员姓名:"+name+"\n"+"工号:"+gonghao);

    }

    public void showSalary(){
        System.out.println("基本工资为:"+xinzi+"，奖金无");

    }

    public void work(){
        System.out.println("正在努力写代码......");

    }

    public Coder() {
    }

    public Coder(String name, String gonghao, int xinzi) {
        this.name = name;
        this.gonghao = gonghao;
        this.xinzi = xinzi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public int getXinzi() {
        return xinzi;
    }

    public void setXinzi(int xinzi) {
        this.xinzi = xinzi;
    }
}
