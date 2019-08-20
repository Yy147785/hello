package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        while (map.size() < 5) {
            System.out.println("请输入对象:");
            String line = new Scanner(System.in).nextLine();
           String[] strs =  line.split(",");
            map.put(strs[0],strs[1]);
        }
        System.out.println(map);


    }
}
