package com.dfbz.day22.Test4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FuWuQi {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            byte[] b = new byte[1024];
            int len=is.read(b);
            String s1 = new String(b,0,len);
            System.out.println(s1);
            is.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
