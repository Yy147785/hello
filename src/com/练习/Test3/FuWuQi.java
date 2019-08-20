package com.练习.Test3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FuWuQi {

    public static void main(String[] args)   {


        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            Scanner input = new Scanner(System.in);
            while (true){
                byte[] b = new byte[1024];
                int len=is.read(b);
                String str = new String(b,0,len);
                System.out.println("收到客户端发来的消息："+str);
                if ("123".equals(str)){
                    break;
                }
                String string = input.next();
                os.write(str.getBytes());
                if ("456".equals(string)){
                    break;
                }
                os.close();
                is.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
