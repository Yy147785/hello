package com.dfbz.day15.guankayi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","刘岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");

        Set<String> key = map.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String k=it.next();
            String v=map.get(k);
            System.out.println(k+" "+v);
        }
    }
}
