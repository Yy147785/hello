package com.dfbz.day16.guankayi;

public class Student {

    private String name;
    private  double score;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {

        if (score<0){
            throw new NoScoreException("分数不能为负数");
        }else{

            this.score = score;
        }

    }

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        if (score<0){
            throw new NoScoreException("分数是负的 你考你没啊");
        }
        this.score = score;
    }
}
