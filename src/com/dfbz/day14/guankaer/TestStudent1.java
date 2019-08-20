package com.dfbz.day14.guankaer;

import java.util.HashSet;
import java.util.Iterator;

public class TestStudent1 {

    public static void main(String[] args) {

        HashSet<Student1> set = new HashSet<>();
        set.add(new Student1("张三1", 18, 80));
        set.add(new Student1("张三2", 20, 85));
        set.add(new Student1("张三3", 22, 90));
        set.add(new Student1("张三4", 24, 95));
        set.add(new Student1("张三5", 26, 100));


        Iterator<Student1> it = set.iterator();
        double max = it.next().getScore();
        double min = it.next().getScore();
        int sum = 0;
        for (Student1 student1 : set) {
            sum  += student1.getScore();
            if (max<student1.getScore()){
                max=student1.getScore();
            }
            if (min>student1.getScore()){
                min=student1.getScore();
            }
        }
        System.out.println("平均值："+sum/set.size());
        System.out.println("最高分："+max);
        System.out.println("最低分:"+min);
        System.out.println("总分："+sum);

    }
}
