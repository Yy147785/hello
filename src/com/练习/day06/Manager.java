package com.练习.day06;

public class Manager {

    private  String name;
    private int gonghao;
    private int xinzi;
    private int jiangjin;

    public void intro(){
        System.out.println("经理姓名:"+name+"\n"+"工号:"+gonghao);

    }

    public void showSalary(){
        System.out.println("基本工资为:"+xinzi+"，奖金为:"+jiangjin);

    }

    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码......");

    }

    public Manager() {
    }

    public Manager(String name, int gonghao, int xinzi, int jiangjin) {
        this.name = name;
        this.gonghao = gonghao;
        this.xinzi = xinzi;
        this.jiangjin = jiangjin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGonghao() {
        return gonghao;
    }

    public void setGonghao(int gonghao) {
        this.gonghao = gonghao;
    }

    public int getXinzi() {
        return xinzi;
    }

    public void setXinzi(int xinzi) {
        this.xinzi = xinzi;
    }

    public int getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(int jiangjin) {
        this.jiangjin = jiangjin;
    }
}
