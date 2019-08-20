package com.dfbz.day09;

public class manager extends staff {

    @Override
    public void eat() {
        System.out.println("工号为:"+gongHao+",姓名为:"+name+",工资为:"+money+"的经理在吃鱼");

    }

    @Override
    public void work() {
        System.out.println("工号为:"+gongHao+",姓名为:"+name+",工资为:"+money+"的经理在工作，管理其他人");

    }

}
