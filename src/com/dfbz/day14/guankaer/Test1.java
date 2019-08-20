package com.dfbz.day14.guankaer;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");

        HashSet<String> hashSet = new HashSet<>();

        hashSet.addAll(list);
        System.out.println(hashSet);

        list.clear();
        System.out.println(list);

        list.addAll(hashSet);
        System.out.println(list);



    }
}
