package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        HashMap<String,Integer> map = new HashMap<>();
        String[] string=str.split(" ");
        int count=1;
        for (String st : string ){
            if (!map.containsKey(st)){
                map.put(st,1);
            }else{

                map.put(st,++count);
            }
        }
        System.out.println(map);




    }
}
