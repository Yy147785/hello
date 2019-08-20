package com.练习;

public class TestMaoPiao {

    public static void main(String[] args) {

        MaiPiao m = new MaiPiao();
        Thread t1 = new Thread(m, "窗口1");
        Thread t2 = new Thread(m, "窗口2");
        Thread t3 = new Thread(m, "窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
