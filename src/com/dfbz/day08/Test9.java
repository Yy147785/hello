package com.dfbz.day08;

import java.util.ArrayList;

public class Test9 {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦你干嘛呢");
        list.add("别跑啊");
        System.out.println("原："+list);


        for (int i = 0; i <list.size() ; i++) {
            String str=list.get(i);
            if(str.length()>4){
                list.remove(i);
                i--;
            }

        }
        System.out.println("删除后："+list);
    }
}
