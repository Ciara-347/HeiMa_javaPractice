package com.itheima.operator;

import java.util.Scanner;

public class OD3 {

    public static void main(String[] args) {
        /*描述
        给定秒数 seconds,将其转换为对应的小时数、分钟数和秒数,使得总时间不变,
        但分钟数和秒数都不超过59。
        输入描述:
        在一行中输入一个整数 seconds,表示要转换的秒数,满足(0≦seconds≤10^8)。
        输出描述:
        一行,包含三个整数,依次为输入整数对应的小时数、分钟数和秒数(可能为零),
        中间用一个空格隔开。
        */

        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int h = seconds / 3600;
        int m = seconds % 3600 / 60;
        int s = seconds % 3600 % 60;
        System.out.println(h + " " + m + " " + s);

    }
}
