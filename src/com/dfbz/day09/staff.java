package com.dfbz.day09;

public abstract class staff {

    String gongHao;
    String name;
    double money;
    public abstract void work();
    public abstract void eat();



    public staff() {
    }

    public staff(String gongHao, String name, double money) {
        this.gongHao = gongHao;
        this.name = name;
        this.money = money;
    }

    public String getGongHao() {
        return gongHao;
    }

    public void setGongHao(String gongHao) {
        this.gongHao = gongHao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
