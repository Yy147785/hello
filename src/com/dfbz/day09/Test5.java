package com.dfbz.day09;

public class Test5 {

    public static void main(String[] args) {

        manager m = new manager();
        m.gongHao="m110";
        m.name="老王";
        m.money=10000;
        m.eat();
        m.work();

        cook c = new cook();
        c.gongHao="c110";
        c.name="小王";
        c.money=6000;
        c.eat();
        c.work();



    }
}
