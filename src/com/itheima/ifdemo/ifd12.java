package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd12 {

    public static void main(String[] args) {
        /*
        练习5:是否构成三角形
        键盘录入任意三个大于0的小数,判断这三个数值构成什么类型的三角形?
        需要判断的类型如下:等边、等腰、直角、普通、无效
        条件:两边之和>第三边
        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个边长：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个边长：");
        double b = sc.nextDouble();
        System.out.println("请输入第三个边长：");
        double c = sc.nextDouble();
        //调整顺序
        double temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        //判断类型
        if (a > 0 && b > 0 && c > 0) {
            if (b + c > a) {
                if (a == b && b == c) System.out.println("等边");
                else if (a == b || b == c) System.out.println("等腰");
                else System.out.println("普通");

                if (b * b + c * c == a * a) System.out.println("直角");
            } else {
                System.out.println("无效");
            }
        } else {
            System.out.println("无效");
        }
    }
}
