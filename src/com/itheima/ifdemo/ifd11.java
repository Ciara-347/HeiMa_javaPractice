package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd11 {

    public static void main(String[] args) {
        /*
            计算电费(课堂练习,自己独立完成)
            用电量计算采取阶梯计费原则,规则如下:
            [0 ~100]度,按0.5元/度计费
            (100~200]度,按0.8元/度计费
            (超过200]度,按1.2元/度计费
            输入变量usage表示实际用电量,
            输出总电费cost。
            示例输入:usage=150
            示例输出:cost=100*0.5+50*0.8=90

        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入实际用电量：");
        Double usage = sc.nextDouble();
        //创建变量保存总电费
        Double cost = 0.0;
        //计费
        if (usage >= 0) {
            if (usage <= 100) cost = usage * 0.5;
            else if (usage <= 200) cost = 100 * 0.5 + (usage - 100) * 0.8;
            else cost = 100 * 0.5 + 100 * 0.8 + (usage - 200) * 1.2;
        } else {
            System.out.println("输入的用电量有误");
        }

        System.out.println("总电费：" + cost);
    }
}
