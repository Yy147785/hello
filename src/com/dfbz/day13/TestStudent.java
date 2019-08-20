package com.dfbz.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

    public static void main(String[] args) {
        Student st1 = new Student("撒播",18,80);
        Student st2 = new Student("撒播1",18,90);
        Student st3 = new Student("撒播2",18,70);
        Student st4 = new Student("撒播3",18,60);
        Student st5 = new Student("撒播4",18,50);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);



        Iterator<Student> it = list.iterator();
        double sum = 0;
        double max = list.get(0).getScore();
        double min = list.get(0).getScore();
        while(it.hasNext()){
           Student st =it.next();
            sum+=st.getScore();
            if(st.getScore()>max){
                max=st.getScore();
            }
            if (st.getScore()<min){
                min=st.getScore();

            }

        }
        System.out.println(sum/list.size());
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);





    }


}
