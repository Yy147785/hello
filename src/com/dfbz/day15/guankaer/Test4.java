package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String str = input.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char f = str.charAt(i);
            if (!map.containsKey(f)){
                map.put(f,1);
            }else{
                Integer count = map.get(f);
                map.put(f,++count);
            }
        }
        System.out.println(map);




    }
}
