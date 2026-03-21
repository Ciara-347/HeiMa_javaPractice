package com.itheima.loopfor;

import java.util.Scanner;

public class fd5 {

    public static void main(String[] args) {

        /*
            案例6:统计满足条件的数字
            需求:键盘录入两个数字,表示一个范围。
            统计这个范围中。
            既能被6整除,又能被8整除数字有多少个?
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();

        int start = num1 < num2 ? num1 : num2;
        int end = num1 > num2 ? num1 : num2;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 6 == 0 && i % 8 == 0) sum++;
        }

        System.out.println("结果为：" + sum);
    }
}
