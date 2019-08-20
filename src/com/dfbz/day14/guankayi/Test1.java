package com.dfbz.day14.guankayi;


import java.util.LinkedList;

public class Test1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("杨勇");
        list.add(1,"迷迷糊糊");
        list.set(1,"真真假假");
        list.get(1);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
        list.remove(0);
        list.clear();
    }
}
