package com.练习.day06;

public class Card {

    private String  huase;
    private int dianshu;

    public void showCard(){
        System.out.println("黑桃A");

    }

    public Card() {
    }

    public Card(String huase, int dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }

    public String getHuase() {
        return huase;
    }

    public void setHuase(String huase) {
        this.huase = huase;
    }

    public int getDianshu() {
        return dianshu;
    }

    public void setDianshu(int dianshu) {
        this.dianshu = dianshu;
    }
}
