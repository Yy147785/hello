package com.dfbz.day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestStudent {

    public static void main(String[] args) {

        Student[] arr= {
                new Student("张三",75),
                new Student("李四",85),
                new Student("王五",95)
        };

       Arrays.sort(arr,(a,b) ->{
           return (int)(b.getScore() - a.getScore());
       });
        for (Student a:arr){
            System.out.println(a);
        }
       }




    }

