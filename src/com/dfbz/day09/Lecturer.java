package com.dfbz.day09;

public class Lecturer extends Teacher2 {

    void work(){
        System.out.println("工号为 "+ " "+getId()+" "+"的讲师"+" "+getName()+" "+"在讲课");
    }

    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
}
