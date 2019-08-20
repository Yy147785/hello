package com.dfbz.day15.guankayi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestStudent1 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("斗神诀","中国");
        map.put("弹弹堂","日本");

        Set<String> set = map.keySet();
        for (String s : set){
            String k = s;
            String v = map.get(k);
            System.out.println(k+" "+v);
        }

        Set<Map.Entry<String,String>> KeyValue = map.entrySet();

        for (Map.Entry<String,String> kv : KeyValue){
            String k = kv.getKey();
            String v = kv.getValue();
            System.out.println(k+" "+v);
        }

    }
}
