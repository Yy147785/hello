package com.练习.day06;

public class Book {

    private String tushubianhao;
    private String shuming;
    private String ISBN编码;
    private double jiage;
    private int chubanriqi;

    public void showBook(){

    }


    public Book() {
    }

    public Book(String tushubianhao, String shuming, String ISBN编码, double jiage, int chubanriqi) {
        this.tushubianhao = tushubianhao;
        this.shuming = shuming;
        this.ISBN编码 = ISBN编码;
        this.jiage = jiage;
        this.chubanriqi = chubanriqi;
    }

    public String getTushubianhao() {
        return tushubianhao;
    }

    public void setTushubianhao(String tushubianhao) {
        this.tushubianhao = tushubianhao;
    }

    public String getShuming() {
        return shuming;
    }

    public void setShuming(String shuming) {
        this.shuming = shuming;
    }

    public String getISBN编码() {
        return ISBN编码;
    }

    public void setISBN编码(String ISBN编码) {
        this.ISBN编码 = ISBN编码;
    }

    public double getJiage() {
        return jiage;
    }

    public void setJiage(double jiage) {
        this.jiage = jiage;
    }

    public int getChubanriqi() {
        return chubanriqi;
    }

    public void setChubanriqi(int chubanriqi) {
        this.chubanriqi = chubanriqi;
    }
}
