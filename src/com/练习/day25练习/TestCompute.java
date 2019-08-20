package com.练习.day25练习;

/**
 * @author YY
 * @description
 * @date2019/8/2
 */

@Compute(name="神舟战神",price = 3800,factories = {"神舟厂商1","神舟厂商2"})
public class TestCompute {

    @Compute(name="神舟优雅",price = 4200,factories = {"神舟华南厂商","神舟华东厂商"})
    public void buyCompute(){
        System.out.println("买神舟电脑啦。。好开森。。");
    }
}
