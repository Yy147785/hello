package com.dfbz.day09;

public  class cook  extends staff{

    @Override
    public void eat() {
        System.out.println("工号为:"+gongHao+",姓名为:"+name+",工资为:"+money+"的厨师在吃肉");

    }

    @Override
    public void work() {
        System.out.println("工号为:"+gongHao+",姓名为:"+name+",工资为:"+money+"的厨师在工作，炒菜");

    }

}
