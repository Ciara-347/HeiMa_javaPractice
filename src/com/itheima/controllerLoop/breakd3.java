package com.itheima.controllerLoop;

import java.util.Scanner;

public class breakd3 {

    public static void main(String[] args) {

        /*
            练习15:找质数(牛客)
            键盘录入一个大于等于2的整数,判断是否为质数
        */

        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("请输入一个大于等于2的整数：");
            n = sc.nextInt();
            if (n >= 2) break;
        }

        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                System.out.println("非质数");
                break;
            }
        }

        if (count == 0) System.out.println("质数");
    }
}
