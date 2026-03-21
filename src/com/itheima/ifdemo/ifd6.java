package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd6 {

    public static void main(String[] args) {
        /*卡拉兹函数(Collatz function)定义如下:
            给定正整数 n,
            若n为奇数, 则f(n) = 3 n + 1
            若n为偶数, 则f(n) = n / 2
            示例1:
            输入:1
            说明:奇数, 3 * 1 + 1 = 4
            输出:4

            示例2:
            输入:2
            说明:偶数, 2 * / 2 = 1
            输出:1
        */

        //1.创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入正整数：");
        int n = sc.nextInt();
        //2.判断并输出
        if(n%2==0){
            System.out.println(n/2);
        }else{
            System.out.println(3*n+1);
        }

    }
}
