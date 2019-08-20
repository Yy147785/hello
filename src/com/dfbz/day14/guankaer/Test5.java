package com.dfbz.day14.guankaer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test5 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        Random r = new Random();

        while(set.size() < 10){
             int a=r.nextInt(20)+1;
             set.add(a);
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer h=it.next();
            System.out.println(h);
        }



    }
}
