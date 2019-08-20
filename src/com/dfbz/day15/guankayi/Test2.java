package com.dfbz.day15.guankayi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("张三","李四");
        map.put("王五","黄河");
        map.put("狗蛋","狗子");

        Set<String> set = map.keySet();
        for (String ste : set){
            String k =ste;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(key);

        }


    }
}
