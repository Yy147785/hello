package com.练习;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */


public @interface asd {

    String value();
    double price()default 100;
    String[] authors();


}
