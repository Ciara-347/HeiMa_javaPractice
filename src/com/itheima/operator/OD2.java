package com.itheima.operator;

import java.util.Scanner;

public class OD2 {

    public static void main(String[] args) {
        /*
        输入3位数，拆分成个位、十位、百位
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3位数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);


    }
}
