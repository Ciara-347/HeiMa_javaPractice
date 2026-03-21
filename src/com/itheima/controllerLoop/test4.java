package com.itheima.controllerLoop;

public class test4 {

    public static void main(String[] args) {
        /*
            案例22-25:打印复杂形状(课堂案例,自己独立完成)
            打印平行四边形
            打印梯形
            打印菱形
            打印空心菱形
        */

        //平行四边形
        for (int i = 1; i <= 3; i++) {
            System.out.print(" ".repeat(3-i));
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.print(" ".repeat(i));
            System.out.println();
        }

        System.out.println();

        //梯形
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                if((4-i)<=j&&j<=(4+i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        //菱形
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p < i*2; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= 7 - i * 2; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //空心菱形
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 1) {
                for (int p = 1; p < (i-1) * 2; p++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != 2) {
                for (int p = 1; p < (2-i) * 2; p++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
