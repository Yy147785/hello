package com.dfbz.day15.guankayi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStudent {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("日本","西游降魔");
        map.put("上饶","弹弹堂");
        map.put("美国","斗神诀");

        Set<String> set = map.keySet();
        for (String str : set){
            String k = str;
            String V = map.get(k);
            System.out.println(k+" "+V);
        }

        Set<Map.Entry<String,String>> keyValue = map.entrySet();

        for (Map.Entry<String,String> kv : keyValue){
            String k = kv.getKey();
            String v =kv.getValue();
            System.out.println(k+" "+v);
        }



    }
}
