package com.dfbz.day13;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {

    public static void main(String[] args) {


        Collection<String> list = new ArrayList<>();
        list.add("10");
        list.remove(0);
        System.out.println(list.size());
        list.clear();
        for (int i = 0; i <list.size() ; i++) {

        System.out.println("集合中内容为："+((ArrayList<String>) list).get(i));
        }


    }
}
