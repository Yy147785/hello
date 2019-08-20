package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();
        while (map.size() < 5) {
            System.out.println("请输入信息:");
            String str = input.next();
            String[] s = str.split(",");
            map.put(s[0], Double.valueOf(s[1]));
        }
        map.remove("C++");
        map.put("Java", 38.5);
        Set<String> set = map.keySet();
        Set<Map.Entry<String, Double>> KeyValue = map.entrySet();
        for (String string : set) {
            String k = string;
            Double v = map.get(k);
            System.out.println("书名:" + k + "，价格:" + v);
        }

        for (Map.Entry<String, Double> kv : KeyValue){
            String k= kv.getKey();
            Double v=kv.getValue();
            System.out.println("书名:" + k + "，价格:" + v);
        }


    }
}
