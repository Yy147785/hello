package com.dfbz.day10.Eight;

import java.util.ArrayList;

public class GouWuChe {

    ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods){
        System.out.println("加入 "+goods.getName()+" 成功");
        list.add(goods);

    }

    public void showGoods(){
        for (int i = 0; i <list.size() ; i++) {
            Goods a=list.get(i);

        System.out.println("     "+a.getId()+a.getName()+a.getPrive());
        }

    }

    public void total(){
        double off = 0;
        double sum = 0;

        for (int i = 0; i <list.size() ; i++) {
            Goods b=list.get(i);
            double price=b.getPrive();
            sum+=price;
            if(b instanceof EGoods){
                price=price*0.88;
            }
            off+=price;
        }
        System.out.println("------------------------");
        System.out.println("原  价为:"+sum+"元");
        System.out.println("折后价为:"+off+"元");

    }
}
