package com.dfbz.day21;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test9 {

    public static  void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("text1.txt"));
        List<String> list = new ArrayList<>();
        String str=null;
        while ((str=br.readLine())!=null){
            list.add(str);

        }
        Collections.reverse(list);
        for (String string : list){
            bw.write(string+"\r\n");
        }
        bw.close();
        br.close();

    }
}
