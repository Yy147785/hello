package com.dfbz.day22.Test6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class KeHuDuan {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1",6666);
        OutputStream os = s.getOutputStream();
        InputStream is = s.getInputStream();
        Scanner input = new Scanner(System.in);
        while (true){
            String str = input.next();
            os.write(str.getBytes());
            os.flush();
            if("over_client".equals(str)){
                break;
            }
            byte[] b =new byte[1024];
            int len=is.read(b);
            String result = new String(b,0,len);
            System.out.println("客户端收到服务器端发送过来的消息："+result);
            if("over_server".equals(result)){
                break;
            }
        }
        is.close();
        os.close();
        s.close();



    }
}
