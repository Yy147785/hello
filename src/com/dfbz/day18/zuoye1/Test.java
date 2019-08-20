package com.dfbz.day18.zuoye1;

public class Test {

    public static void main(String[] args) {

        BaoZi bz = new BaoZi();
        BaoZiPu baoZiPu = new BaoZiPu("包子铺",bz);
        ChiHuo chiHuo = new ChiHuo("吃货",bz);
        baoZiPu.start();
        chiHuo.start();


    }

}
