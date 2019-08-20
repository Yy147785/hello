package com.dfbz.day10.Seven;

public class Test {

    public static void main(String[] args) {

        Manager manager = new Manager("张小强",9000);

        Coder coder = new Coder("李小亮",5000);

        Company company = new Company(1000000);

        company.paySalary(manager);
        company.paySalary(coder);

    }
}
