package com.itheima.controllerLoop;

import java.util.Random;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        /*
            案例18:猜数字小游戏(经典算法题)
            生成一个1~100之间的随机数,利用键盘录入模拟猜的动作,一直猜,直到猜中为止
            //抽卡的时候,有保底机制
            //小保底:只要三次没有猜中,提示用户猜测的范围 ±5
            //大保底:只要10次没有猜中,猜中了
        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        //生成随机数
        Random r = new Random();
        int n = r.nextInt(1,101);
        System.out.println("随机数："+n);

        //循环
        int count = 0;
        while(true){
            System.out.println("请输入数字：");
            int x = sc.nextInt();

            if(x > n) System.out.println("猜大了");
            else if(x < n) System.out.println("猜小了");
            else{
                System.out.println("猜对了");
                break;
            }

            count+=1;

            if(count==7){
                System.out.println("大保底，算你猜中了，答案是："+n);
                break;
            }

            if(count%3==0){
                System.out.println("小保底，数字范围在："+(n-5)+"~"+(n+5));
            }

        }
    }
}
