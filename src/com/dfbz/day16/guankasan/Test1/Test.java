package com.dfbz.day16.guankasan.Test1;

public class Test {

    public static void main(String[] args) {

        try {
            DebitCard(1057021924,100);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void DebitCard(int AccountNumber,double money) throws LoginException {
        if (money<0){
            throw  new LoginException("余额不能为负数");
        }else{
            System.out.println("欢迎使用");
        }
    }
}
