package com.itheima.operator;

import java.util.Scanner;

public class OD10 {
    public static void main(String[] args){
        /*
        练习1:键盘录入一个整数,判断这个数字是否在1~10之间
        练习2:键盘录入一个整数,判断这个数字是否不在1~10之间
         */

        Scanner sc = new Scanner(System.in);
        //练习1
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean result = num >=1 & num <= 10;
        System.out.println(result);

        //练习2
        System.out.println("请输入一个整数：");
        int num2 = sc.nextInt();
        boolean result2 = num <1 | num >10;
        System.out.println(result2);


    }
}
