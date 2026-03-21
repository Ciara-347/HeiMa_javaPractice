package com.itheima.controllerLoop;

import java.util.Scanner;

public class continueD2 {

    public static void main(String[] args) {

        /*
            案例17:牛牛数数(课堂练习,算法小题,学生自己独立完成)

            牛牛在酒桌上玩一个小游戏,第一个人从1开始数数,
            如果遇到数字中含有数字4或数字是4的倍数,则跳过这个数字报下一个,
            谁数错了就要罚酒一杯。
            牛牛为了作弊,它想将所有符合规则的数字预先生成出来。
            请你帮助牛牛列出1到n之间所有既不包含数字4
            又不是4的倍数的整数,按升序输出。
            输入描述:
            在一行中输入一个正整数n,满足1≤n≦105。
            输出描述:
            按升序输出所有满足条件的整数,每个数字占一行。
            示例1
            输入:9
            输出:1
            2
            3
            5
            6
            7
            9
            说明:在1到9中,数字 4 含有数字 4且4,8 为4的倍数,应跳过,剩余数字按升序输出。
        */

        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("请输入一个正整数（1~100000）：");
            n = sc.nextInt();
            if (n >= 1 && n <= 100000) break;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 || i % 10 == 4 || (i / 10) % 10 == 4 || (i / 100) % 10 == 4 || (i / 1000) % 10 == 4 || (i / 10000) % 10 == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
