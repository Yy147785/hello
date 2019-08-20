package com.dfbz.day15.guankasan;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {

        //写不来

        HashSet<String> set = new HashSet<>();
        set.add("苹果");
        set.add("香蕉");
        set.add("西瓜");
        set.add("橘子");
        HashMap<String, String> map = new HashMap<>();
        Random r = new Random();
        for (String s : set) {
            String str = "";
            for (int i = 0; i < 8; i++) {
                str += r.nextInt(10);
            }
            map.put(str, s);
        }
        Set<Map.Entry<String,String>> keyValue = map.entrySet();
        for (Map.Entry<String,String> ky:keyValue){
            String key = ky.getKey();
            String value = ky.getValue();
            System.out.println(key+" "+value);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查询的商品号:");
        String string = input.next();
        for (Map.Entry<String,String> ky:keyValue){
            if(!ky.equals(string)){
                System.out.println("查无此商品");
            }else {
                System.out.println( map.get(string));
            }

        }

    }
}
