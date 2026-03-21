package com.itheima.operator;

import java.util.Scanner;

public class OD9 {

    public static void main(String[] args) {
        //练习2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个3位数：");
        int num = sc.nextInt();

        boolean result2 = num % 3 == 0;
        System.out.println("是否能被3整除：" + result2);
    }
}
