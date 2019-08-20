package com.dfbz.day15.guankaer;

import java.util.ArrayList;
import java.util.HashMap;

public class Test6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        HashMap<Character,Integer> map = new HashMap<>();

        for (String str : list){
            char[] arr=str.toCharArray();
            for (char ch : arr){
                if (!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    Integer count = map.get(ch);
                    map.put(ch,++count);
                }
            }
        }
        System.out.println(map);
    }
}
