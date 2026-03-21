package com.itheima.array;

import java.util.Scanner;

public class ad4 {

    public static void main(String[] args) {

        /*
            数组动态初始化
            需求:键盘录入5个的整数,存入数组当中,并进行遍历
        */

        // 创建数组
        int[] arr = new int[5];

        // 录入数据
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数据：");
            arr[i] = sc.nextInt();
        }

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
