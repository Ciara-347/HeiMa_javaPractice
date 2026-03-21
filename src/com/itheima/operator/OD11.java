package com.itheima.operator;

import java.util.Scanner;

public class OD11 {

    public static void main(String[] args) {
        /*
        需求1:
        键盘录入一个四位整数,判断这个数字是否为回文数。
        需求2:
        寻找7的有缘数,定义一个两位整数,只要该数字包含7或者是7的倍数,就是7的有缘数
        */

        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;
        System.out.println(ge == qian && shi == bai);

        //2
        int num2 = 0;
        for (int i = 10; i <= 99; i++){
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
                num2 = i;
                System.out.println(num2);
            }
        }

    }
}
