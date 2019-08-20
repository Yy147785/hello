package com.dfbz.day14.guankasan;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();

        while(set.size()<6){
            int a=r.nextInt(33)+1;
            set.add(a);
        }

        HashSet<Integer> set1 = new HashSet<>();
        Random random = new Random();

        while(set1.size()<1){
            int k=random.nextInt(16)+1;
            set1.add(k);
        }


        System.out.println("双色球号码为:"+set+set1);






    }
}
