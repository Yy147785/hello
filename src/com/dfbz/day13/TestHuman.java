package com.dfbz.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class TestHuman {

    public static void main(String[] args) {


        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("李四1",18,180));
        list.add(new Human("李四2",20,178));
        list.add(new Human("李四3",22,175));
        list.add(new Human("李四4",24,173));
        list.add(new Human("李四5",26,171));

        Iterator<Human> it = list.iterator();
        while(it.hasNext()){
            Human human=it.next();
            human.setAge(human.getAge()+2);
        }
        for(Human hm : list){
        System.out.println(hm.getName()+" "+hm.getAge()+" "+hm.getHeigth());
        }


    }
}
