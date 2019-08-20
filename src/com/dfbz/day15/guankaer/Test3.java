package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Set;

public class Test3 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "周林");
        Set<Integer> set = map.keySet();
        for (Integer it : set) {
            Integer k = it;
            String v = map.get(k);
            System.out.println(k + " " + v);
        }


    }
}
