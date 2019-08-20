package com.dfbz.day16.guankaer.Test3;

public class Test {

    public static void main(String[] args) {

        try {
            //login("admn","sfd");
            //login("admin","asd");
            login("admin","admin");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void login(String name,String pwd) throws LoginException {

        if (name!="admin" ){
            throw new LoginException("用户不存在");
        }else if ( pwd!="admin"){
            throw new LoginException("密码错误");
        }else {
            System.out.println("登入成功！");
        }
    }
}
