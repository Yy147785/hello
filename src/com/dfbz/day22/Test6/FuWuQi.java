package com.dfbz.day22.Test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FuWuQi {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        Scanner input = new Scanner(System.in);
        while (true){
        byte[] b = new byte[1024];
        int len=is.read(b);
        String result = new String(b,0,len);
        System.out.println("服务器收到客户端发送的消息："+result);
        if("over_client".equals(result)){
            break;
        }
        String str = input.next();
        os.write(str.getBytes());
        if("over_server".equals(str)){
            break;
        }
        }

        is.close();
        os.close();
        s.close();
    }
}
