package com.dfbz.day15.guankayi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("栗子1","离子1");
        map.put("栗子2","离子2");
        map.put("栗子3","离子3");

        Set<String> keys = map.keySet();
        for(String key:keys){
            String k = key;
            String v = map.get(k);
            System.out.println(k+" "+v);
        }

        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+" "+value);
        }

    }
}
