package com.dfbz.day09;

public class Tutor extends  Teacher2 {

     void work(){
         System.out.println("工号为 "+ " "+getId()+" "+"的助教"+" "+getName()+" "+"在帮助学生解决问题");

     }

    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }
}
