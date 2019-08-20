package com.dfbz.day17;

import java.util.Random;

public class TestShanDong {

    public static void main(String[] args) {

      shandong shandong1 = new shandong();
      Thread t = new Thread(shandong1,"张三");
      t.start();



    }


}
