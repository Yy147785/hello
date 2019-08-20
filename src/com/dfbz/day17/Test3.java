package com.dfbz.day17;

public class Test3 {

    public static void main(String[] args) {

        /*Zi zi = new Zi("赵子龙");
       zi.start();*/



       Zi1 zi1 = new Zi1();
       Thread thread = new Thread(zi1,"常山赵子龙");
       thread.start();






    }
}
