package com.itheima.controllerLoop;

public class test3 {

    public static void main(String[] args) {
        /*
            案例20-21:打印形状
            打印正三角形和倒三角形
            *       *****
            **      ****
            ***     ***
            ****    **
            *****   *
        */



        for (int j = 1; j <=5; j++) {
            for (int i = 1 ;i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <=5; j++) {
            for (int i = j ;i <=5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
