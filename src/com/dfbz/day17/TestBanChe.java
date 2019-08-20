package com.dfbz.day17;

public class TestBanChe {

    public static void main(String[] args) {

        BanChe b = new BanChe();
        Thread t1 = new Thread(b,"前门");
        Thread t2 = new Thread(b,"中门");
        Thread t3 = new Thread(b,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
