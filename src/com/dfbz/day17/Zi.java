package com.dfbz.day17;

public class Zi extends Thread  {

    public Zi(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(getName()+i);

        }
        super.run();
    }


}
