package com.dfbz.day22.Test5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class KeHuDuan {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream os = s.getOutputStream();
            os.write("hello服务器，我是客户端".getBytes());
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
