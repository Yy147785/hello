package com.dfbz.day18.zuoye1;

public class BaoZiPu extends Thread {
    private BaoZi bz;


    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){

            synchronized (bz){
                if (bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            if(count%2==0){
                bz.pier="薄皮";
                bz.xianer="虾蟹";
            }else{
                bz.pier="厚皮";
                bz.xianer="海鲜";
            }
                System.out.println(getName()+"正在做"+bz.pier+bz.xianer+"包");
                count++;
                bz.flag = true;
                bz.notify();

            }

        }


    }
}
