package com.练习.Test3;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class KeHuDuan {

    public static void main(String[] args)throws  Exception {


            Socket s = new Socket("localhost",6666);
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();
            Scanner input = new Scanner(System.in);
            while (true){
                String string = input.next();
                os.write(string.getBytes());
                os.flush();
                if ("789".equals(string)){
                    break;
                }

                byte[] b = new byte[1024];
                int len=is.read(b);
                String stirng1 = new String(b,0,len);
                System.out.println("收到服务器发来的消息："+stirng1);
                if ("111".equals(stirng1)){
                    break;
                }
                is.close();
                os.close();
                s.close();
            }



    }
}
