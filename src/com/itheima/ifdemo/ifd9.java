package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd9 {

    public static void main(String[] args) {
        /*
            充1000，赠200
            2000，500
            3000，700
            5000，1300
            10000，2500
            20000，6000
            50000，15000

            忽略次卡规则,请计算充值不同的额度,卡里余额是多少?
        */

        //输入充值金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        int money = sc.nextInt();
        //创建变量保存余额
        int balance = 0;
        //充值
        if(money >0){
            if(money<1000) balance = money;
            else if (money<2000) balance = money + 200;
            else if (money<3000) balance = money + 500;
            else if (money<5000) balance = money + 700;
            else if (money<10000) balance = money + 1300;
            else if (money<20000) balance = money + 2500;
            else if (money<50000) balance = money + 6000;
            else balance = money + 15000;
        }else{
            System.out.println("充值金额输入错误");
        }

        System.out.println("余额为：" + balance);

    }
}
