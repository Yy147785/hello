package com.dfbz.day18;


import java.util.*;

public class Test6 {

    public static void main(String[] args) {

        List<String> list  =  new ArrayList<>();
        list.add("java");
        list.add("php");
        list.add("c");
        list.forEach((s)-> System.out.println(s));


        Set<String> set  =  new HashSet<>();
        set.add("java");
        set.add("php");
        set.add("c");
        set.forEach((s)-> System.out.println(s));

        Map<String,String> map  =  new HashMap<>();
        map.put("java","06");
        map.put("php","05");
        map.put("c","04");

        map.forEach((k,v)-> {
            System.out.println(k+v);
        });

    }
}
