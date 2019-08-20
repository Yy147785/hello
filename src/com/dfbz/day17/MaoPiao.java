package com.dfbz.day17;

public class MaoPiao extends Thread {

    private  int sum=19;
    private int shen=1;

    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (sum > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println("当前窗口为:"+name+"卖出:"+shen+++"还剩"+sum--);

                }else{
                    break;
                }
            }
        }

    }
}
