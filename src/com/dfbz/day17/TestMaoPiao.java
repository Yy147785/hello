package com.dfbz.day17;

public class TestMaoPiao {

    public static void main(String[] args) {

        MaoPiao m = new MaoPiao();
        Thread t1 = new Thread(m,"窗口1");
        Thread t2 = new Thread(m,"窗口2");
        Thread t3 = new Thread(m,"窗口3");
        Thread t4 = new Thread(m,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
