package com.dfbz.day17;

public class BanChe implements Runnable {

    private int num = 80;
    private int ren = 1;

    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (num > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    num--;
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "上车" + ren + "，还剩" + num);
                    ren++;
                } else {
                    break;
                }
            }
        }

    }
}
