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
        int M;
        int N;
        while(true){
            System.out.println("请输入红包总额(单位：分)：");
            M = sc.nextInt();
            System.out.println("请输入红包个数：");
            N = sc.nextInt();
            if(M<0 || N<=0){
                System.out.println("输入数据需>0，请重新输入");
            }else if(M<N){
                System.out.println("红包个数不能大于红包总额，请重新输入");
            }else{
                break;
            }
        }

        //随机分配红包
        getRedPacket(M,N);

    }

    //随机红包
    public static void getRedPacket(int M,int N){
        Random r = new Random();
        int money;
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println("第" + i + "个人：" + M);
            } else {
                money = r.nextInt(M- (N - i)) + 1;//随机红包金额(0.1,总钱数-0.1剩余人数)
                System.out.println("第" + i + "个人：" + money);
                M -= money;
            }
        }
    }
}
