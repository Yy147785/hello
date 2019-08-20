package com.dfbz.day10.Eight;

public class Test {

    public static void main(String[] args) {
        GouWuChe g = new GouWuChe();


        Laptop l = new Laptop(20000,",笔记本,",10000);

        Phone p = new Phone(25000,",手机,",5000);

        Fruit f = new Fruit(30000,",苹果,",50);

        System.out.println("-----------------添加商品-------------------");
        g.addGoods(l);
        g.addGoods(p);
        g.addGoods(f);

        System.out.println("-------------打印商品------------");
        System.out.println("您选购的商品为:");
        g.showGoods();
        g.total();
    }
}
