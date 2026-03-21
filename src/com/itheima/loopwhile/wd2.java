package com.itheima.loopwhile;

public class wd2 {

    public static void main(String[] args) {

        /*
            练习10:复利计算器
            假设你在银行投资了100000元,银行给出的复利是1.7%,
            问多少年后能实现本金翻倍?
            请问:用什么循环呢?代码如何实现?
        */

        double money = 100000;
        int year = 0;
        while(money < 200000){
            year+=1;
            money *= 1.017;
        }
        System.out.println(year);
    }
}
