package com.dfbz.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class TestPeople {

    public static void main(String[] args) {




        ArrayList<People> list = new ArrayList<>();
        list.add(new People("张三1",18,180));
        list.add(new People("张三2",18,178));
        list.add(new People("张三3",18,175));
        list.add(new People("张三4",18,173));
        list.add(new People("张三5",18,171));

        Iterator<People> it = list.iterator();
        double max=list.get(0).getHeight();
        double min=list.get(0).getHeight();
        while(it.hasNext()){
            People pp=it.next();
            if(pp.getHeight()>max){
               max= pp.getHeight();
            }
            if(pp.getHeight()<min){
                min=pp.getHeight();
            }
        }
        System.out.println("最高的人是"+max);
        System.out.println("最低的人是"+min);
    }
}
