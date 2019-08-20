package com.dfbz.day10.Seven;

public class Company implements Money {

    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Company(double money) {
        this.money = money;
    }

    public Company() {
    }

    @Override
    public void paySalary(Employee emp) {

        money-=emp.getMoney();

        System.out.println("给"+emp.getName()+"发工资"+emp.getMoney()+"元，公司剩余"+ money+"元");
    }
}
