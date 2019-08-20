package com.dfbz.day06;

public class Manager {

    private String name;
    private int gongHao;
    private int money;
    private int jiangJin;

    public  void intro(){

        System.out.println("经理姓名:"+name+"\n"+"工号:"+gongHao);
    }
    public  void showSalary(){

        System.out.println("基本工资:"+money+",奖金为:"+jiangJin);

    }
    public void work(){

        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码......");

    }

    public Manager(){

    }
    public Manager(String name,int gongHao,int money,int jiangJin){
        this.name=name;
        this. gongHao=gongHao;
        this. money=money;
        this. jiangJin=jiangJin;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getGongHao() {
        return gongHao;
    }

    public void setGongHao(int gongHao) {
        this.gongHao = gongHao;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getJiangJin() {
        return jiangJin;
    }

    public void setJiangJin(int jiangJin) {
        this.jiangJin = jiangJin;
    }
}
