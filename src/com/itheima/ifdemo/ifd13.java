package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd13 {

    public static void main(String[] args) {
        /*
            练习6:直角坐标系位置判断(课堂练习,自己独立完成)
            规则:
            输入变量x,y,判断点所在区域:
            情况1:原点(x=0且y=0)
            情况2:第1象限、第2象限、第3象限、第4象限
            情况3:在y轴上(x=0且y=0)
            情况4:在x轴上(y=0且x=0)
        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x：");
        double x = sc.nextDouble();
        System.out.println("请输入y：");
        double y = sc.nextDouble();
        //判断
        if (x == 0 && y == 0) System.out.println("原点");
        else if(x==0) System.out.println("在y轴上");
        else if(y==0) System.out.println("在x轴上");
        else {
            if (x > 0 && y > 0) System.out.println("第1象限");
            else if (x < 0 && y > 0) System.out.println("第2象限");
            else if (x < 0 && y < 0) System.out.println("第3象限");
            else System.out.println("第4象限");
        }
    }
}
