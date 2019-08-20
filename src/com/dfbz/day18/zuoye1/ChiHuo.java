package com.dfbz.day18.zuoye1;

public class ChiHuo extends Thread {
    private BaoZi bz;


    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {

        while (true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName()+"正在吃"+bz.pier+bz.xianer);
                bz.flag = false;
                bz.notify();

            }


        }




    }
}
