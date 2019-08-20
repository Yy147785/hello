package com.dfbz.day16.guankayi;

public class Test6 {

    public static void main(String[] args) throws Exception {

        testThrows("asddasdsa",100);
        testTryCatch(" asdassadsa",-1);


    }

    public static char charAt(String  str,int index) throws Exception {

        if(str==null){
            throw new  Exception("字符串不能为null");
        }
        if(str.equals("")){
            throw new  Exception("字符串不能为空");
        }
        if(index!=0||index!=str.length()-1){
            throw new  Exception("索引越界");
        }


        return  str.charAt(index);
    }
    public static void testThrows(String s,int index) throws Exception {
        charAt(s,index);
    }

    public static  void testTryCatch(String s,int index) {

        try {

            charAt(s,index);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
