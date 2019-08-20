package com.dfbz.day15.guankaer;

import java.util.HashMap;
import java.util.Scanner;


public class Test5 {

    public static void main(String[] args) {

        System.out.println("键盘输入字符;");
        String str = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (c < 123 && c > 64) {
                countingKey(map, "字母");
            } else if (c == 32) {
                countingKey(map, "空格");
            } else if (c > 47 && c < 58) {
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }



    }

    private static void countingKey(HashMap map, String key) {

        int count = 0;

        if (map.get(key) != null) {
            map.put(key, 1);
        } else {

            map.put(key, ++count);
        }
        System.out.print(+count);
    }


}
