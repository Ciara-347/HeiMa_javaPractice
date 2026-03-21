package com.itheima.operator;

import java.util.Scanner;

public class OD12 {

    public static void main(String[] args) {
        // 利用三元运算符,求两个整数的较大值

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        System.out.println(a > b ? a : b);

    }
}
