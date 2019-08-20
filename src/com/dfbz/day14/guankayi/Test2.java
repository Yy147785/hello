package com.dfbz.day14.guankayi;

import java.util.LinkedList;

public class Test2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("零零七");
        list.addFirst("体谅我");
        list.addLast("酒一杯一杯的干");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());


    }
}
