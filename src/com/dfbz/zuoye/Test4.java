package com.dfbz.zuoye;

/**
 * @author YY
 * @description
 * @date2019/8/3
 */


public class Test4 {

    public static void main(String[] args) {

        int count=0;
        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                for (int z=1;z<5;z++){
                    if (i!=j && i!=z && j!=z){
                        count++;
                        System.out.println(i*100+j*10+z);
                    }
                }
            }
        }
        System.out.println("共有"+count+"个这样的数！");
    }
}
