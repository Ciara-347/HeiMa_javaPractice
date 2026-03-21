package com.itheima.Variable;

public class VariableDemo1 {
    public static void main(String[] args){
        /*微信余额:0元
        支付宝余额:10元
        银行卡余额:20元
        问题一:请问现在一共有多少钱?
                问题二:微信收了10元红包,又发了2元红包,余额多少 ?*/

        //1.定义一个变量记录微信余额
        double weixin = 0;
        //2.定义一个变量记录支付宝余额
        double zhifubao = 10;
        //3.定义一个变量记录银行卡余额
        double bank = 20;
        //4.求总金额
        double total = weixin + zhifubao + bank;
        System.out.println("现在一共有"+total+"元");
        //5.微信收了10元红包,又发了2元红包,余额多少 ?
        weixin = weixin + 10 - 2;
        System.out.println("微信余额为"+weixin+"元");

    }
}
