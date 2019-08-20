package com.dfbz.day14.guankaer;

import java.util.ArrayList;
import java.util.HashSet;

public class Test8 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("a");
        list1.add("c");
        list1.add("d");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("e");
        list2.add("f");
        list2.add("a");
        list2.add("d");
        list2.add("g");

        HashSet<String> set = new HashSet<>();

        for (String str : list1){
            set.add(str);
        }
        for (String string : list2){
            set.add(string);
        }
        for (String s : set){
            System.out.println(s);
        }
    }
}
