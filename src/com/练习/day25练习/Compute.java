package com.练习.day25练习;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Compute {
     //计算机名
    String name();
    //计算机价格
    double price() default 2000;
    //厂商
    String[] factories();
}
