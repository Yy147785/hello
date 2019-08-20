package com.dfbz.day10.Eight;

public class Goods {

    private int id;
    private String name;
    private double prive;

    public Goods() {
    }

    public Goods(int id, String name, double prive) {
        this.id = id;
        this.name = name;
        this.prive = prive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }
}
