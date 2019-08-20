package com.dfbz.day14.guankayi;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {

    public static void main(String[] args) {


        LinkedHashSet<String> list = new LinkedHashSet<>();

        list.add(new String("王昭君"));
        list.add(new String("王昭君"));
        list.add(new String("西施"));
        list.add(new String("杨玉环"));
        list.add(new String("貂蝉"));

        Iterator<String> it = list.iterator();
        for (String str : list){
            System.out.println(str);
        }




    }
}
