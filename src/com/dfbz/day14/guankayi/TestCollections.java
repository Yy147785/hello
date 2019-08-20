package com.dfbz.day14.guankayi;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {

    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();


        Collections.addAll(list,33,11,77,55);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        for (Integer it : list){
            System.out.println(it);
        }
    }
}
