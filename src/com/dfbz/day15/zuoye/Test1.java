package com.dfbz.day15.zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 20));
        list.add(new Student("李四", 22));
        list.add(new Student("王五", 24));

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("斗神诀", 30));
        list1.add(new Student("爱仕达", 35));
        list1.add(new Student("绿巨人", 37));

        HashMap<String, ArrayList<Student>> map = new HashMap<>();
        map.put("混子班", list);
        HashMap<String, ArrayList<Student>> map1 = new HashMap<>();
        map1.put("浪子班", list1);

        Set<Map.Entry<String, ArrayList<Student>>> set = map.entrySet();
        Set<Map.Entry<String, ArrayList<Student>>> set1 = map1.entrySet();

        for (Map.Entry<String, ArrayList<Student>> KeyValue : set){
            String key = KeyValue.getKey();
            ArrayList<Student> students = KeyValue.getValue();
            for(Student s:students){
                Student stu = s;
                System.out.println(key+ " "+s.getName()+" "+s.getAge());
            }

        }
        for (Map.Entry<String, ArrayList<Student>> KeyValue : set1){
            String key = KeyValue.getKey();
            ArrayList<Student> students = KeyValue.getValue();
            for(Student s:students){
                Student stu = s;
                System.out.println(key+ " "+s.getName()+" "+s.getAge());
            }

        }




    }
}
