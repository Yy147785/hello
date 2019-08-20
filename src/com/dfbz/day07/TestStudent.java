package com.dfbz.day07;


import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {

        Student s = new Student();
        Student s1 = new Student("001,", "黄渤,", 1.72);
        Student s2 = new Student("002,", "孙红雷,", 1.78);
        Student s3 = new Student("003,", "章子怡,", 1.64);
        Student s4 = new Student("004,", "杨颖,", 1.68);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("集合大小:"+list.size());
        for(int i =0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getId()+stu.getName()+stu.getHeight());
        }
        System.out.println("-------------------------------");
        for (int i = 0; i <list.size() ; i++) {
            Student stu=list.get(i);
            if(stu.getHeight()>1.70){
                System.out.println("身高170以上的学员:"+stu.getId()+stu.getName()+stu.getHeight());
            }


        }


    }
}
