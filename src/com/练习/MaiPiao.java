package com.练习;

public class MaiPiao extends Thread {

    private int sum = 99;
    private int shen = 1;
    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (sum > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String naeme = Thread.currentThread().getName();
                    System.out.println("当前窗口为：" + naeme + "，卖了" + sum + "，还剩" + shen);
                    sum--;
                    shen++;
                } else {
                    break;
                }
            }
        }
    }
}
