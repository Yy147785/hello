package com.dfbz.day15.guankaer;

import java.util.*;

public class Test8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        HashMap<String, Double> map = new HashMap<>();
        while (map.size()<5){
            System.out.println("请输入一个同学的姓名");
            String name = input.next();
            double score = r.nextInt(101);
            map.put(name,score);
        }
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        double max = 0;
        double min = 0;
        double sum = 0;
        for(int i = 0;it.hasNext();i++){
            String key = it.next();
            double score = map.get(key);
            if(i == 0){
                max = score;
                min = score;
            }
            if(max<score){
                max = score;
            }
            if(min>score){
                min = score;
            }
            sum+=score;
            System.out.println("学生姓名:"+key+"，分数:"+score);
        }
            System.out.println("总分=" + sum + "最高分=" + max + "最低分=" + min + "平均分=" + sum / map.size());

    }
}

