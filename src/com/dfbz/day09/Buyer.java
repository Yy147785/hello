package com.dfbz.day09;

public   class Buyer extends AdminStaff {

     void work(){
         System.out.println("工号为 "+ " "+getId()+" "+"的采购专员"+" "+getName()+" "+"在采购音响设备");
     }

    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }
}
