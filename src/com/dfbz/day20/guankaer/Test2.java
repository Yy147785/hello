package com.dfbz.day20.guankaer;

import java.io.*;

public class Test2 {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\d1");
        File newdir = new File("C:\\d2");
        
        if (!newdir.exists()){
            newdir.mkdirs();
        }
        File[] files = file.listFiles();
        for (File file1:files){

            String str = file1.getAbsolutePath();//c:\\d1\\a.txt
            String str1=file1.getName();//a.txt
            String newstr=newdir.getAbsolutePath()+"\\\\"+str1;//C:\d2
            copyFile(str,newstr);

        }

    }

    private static void copyFile(String oldPath, String newPath) throws IOException {

        File oldFile = new File(oldPath);
        File file = new File(newPath);
        FileInputStream fis = new FileInputStream(oldFile);
        FileOutputStream fos = new FileOutputStream(file);

        byte[] b = new byte[1024];
        while ((fis.read(b))!=-1){
            fos.write(b);

        }
        fos.close();
        fis.close();


    }
}
