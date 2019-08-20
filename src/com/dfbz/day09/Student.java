package com.dfbz.day09;

public class Student extends Person1 {

    private int score;


    public void kaoshi(){
        System.out.println(getName()+",考试得了:"+score);

    }

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
