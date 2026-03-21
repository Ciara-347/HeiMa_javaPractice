package com.itheima.operator;

import java.util.Scanner;

public class OD8 {

    public static void main(String[] args){
        /*
        练习1:键盘录入你和你好基友的身高,比一比谁更高?
        练习2:键盘录入一个3位数,判断是否能被3整除
        */

        Scanner sc = new Scanner(System.in);
        //练习1
        System.out.println("请输入你的身高：");
        double myHeight = sc.nextDouble();
        System.out.println("请输入你的好友的身高：");
        double friHeight = sc.nextDouble();

        boolean result = myHeight > friHeight;
        System.out.println("你比你的好友高：" + result);

    }
}
