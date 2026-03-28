package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        /*
            红包问题
            给你两个整数M和N,M表示红包的总额,N表示红包的个数
            现在又N个人来抽红包,每个人都是随机的,
            打印每个人领的红包金额

            注1:每个人最少1分钱
            注2:每个人领完红包之后,至少预留1*N分钱
            注3:最后一个人是拿剩余的总额
        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包总额：");
        double M = sc.nextDouble();
        System.out.println("请输入红包个数：");
        double N = sc.nextDouble();
        //随机分配红包
        getRedPacket(M,N);

    }

    //随机红包
    public static void getRedPacket(double M,double N){
        Random r = new Random();
        double money;

        if(M==0.01* N){
            for (int i = 1; i <= N; i++) {
                System.out.println("第" + i + "个人：" + 0.01);
            }
        }else{
            for (int i = 1; i <= N; i++) {
                if (i == N) {
                    System.out.println("第" + i + "个人：" + M);
                } else {
                    money = r.nextDouble(M-(0.01 * (N - i))) + 0.01;//随机红包金额(0.1,总钱数-0.1剩余人数)
                    System.out.println("第" + i + "个人：" + money);
                    M -= money;
                }
            }
        }
    }
}
