package com.dfbz.day06;

public class Coder {

    private String name;
    private String  gongHao;
    private int money;

    public void intro(){
        System.out.println("程序员姓名:"+name+"\n"+"工号:"+gongHao);


    }
    public void showSalary(){
        System.out.println("基本工资:"+money+",奖金无");

    }
    public void work(){
        System.out.println("正在努力写代码......");

    }

    public Coder(){

    }

    public Coder(String name,String  gongHao,int money){
        this.name=name;
        this.gongHao=gongHao;
        this.money=money;
    }

    public String getGongHao() {
        return gongHao;
    }
    public void setGongHao(String gongHao){
        this.gongHao=gongHao;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
