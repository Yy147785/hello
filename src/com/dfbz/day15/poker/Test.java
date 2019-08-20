package com.dfbz.day15.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String>  pokerBox  = new ArrayList<>();

        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        pokerBox.add("大王");
        pokerBox.add("小王");

        for (int i = 2;  i<=10 ; i++) {
            number.add(i+"");

        }

        for(String str : number){


            for (String str1 : color){

                String card=str+str1;
                pokerBox.add(card);

            }

        }

        Collections.shuffle(pokerBox);


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i=0;i<pokerBox.size();i++){
            String str=pokerBox.get(i);
            if (i>=51){
                dipai.add(str);
            }else{
                if (i%3==0){
                    list1.add(str);
                }else if (i%3==1){
                    list2.add(str);
                }else{
                    list3.add(str);
                }
            }
        }

        System.out.println("张三:"+list1);
        System.out.println("李四:"+list2);
        System.out.println("王五:"+list3);
        System.out.println("底牌:"+dipai);


    }
}
