package com.dfbz.day10.Four;

public class Test {

    public static void main(String[] args) {

        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sengMessage();

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sengMessage();
        newPhone.playGame();
    }
}
