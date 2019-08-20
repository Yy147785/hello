package com.dfbz.day15.guankasan;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(001,"李晨");
        map.put(002,"范冰冰");
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(001,"马云");
        map1.put(002,"马化腾");

        Set<Integer> set = map.keySet();
        for (Integer it : set){
            System.out.println(it +" "+map.get(it));
        }

        Set<Map.Entry<Integer,String>> KeyValue = map1.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = KeyValue.iterator();
        while(iterator.hasNext()){
             Map.Entry<Integer,String> keyValue= iterator.next();
            Integer key = keyValue.getKey();
            String value = keyValue.getValue();
            System.out.println(key+" "+value);
        }








    }
}
