package com.dfbz.day16.guankaer.Test1;

public class Father {

        public  void eat() throws ToothPainException {
            System.out.println("吃到一个石子");
            throw new ToothPainException("牙疼");

        }

        public void drink()  {
            System.out.println("喝什么都没有问题");
        }


}
