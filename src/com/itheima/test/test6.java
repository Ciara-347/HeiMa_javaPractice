package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class test6 {

    // 静态常量：整个类共享一个Random对象
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        //ctrl+p 查看方法
        /*
            彩票规则:
            前区:1~35选5个号码(唯一)
            后区:1~12选2个号码(唯一)
            跨区可重复

            中奖规则:
            一等奖:5+2
            二等奖:5+1
            三等奖:5+0/4+2
            四等奖:4+1/3+2
            五等奖:4+0/3+1/2+2
            六等奖:3+0/1+2/2+1/0+2
        */

        //创建数组保存前区
        int[] front = new int[5];
        randomArray(front, 35);
        //创建数组保存后区
        int[] back = new int[2];
        randomArray(back, 12);

        //创建数组保存用户选的号码
        int[] userFront = new int[5];
        System.out.println("请输入前区5个数字：");
        inputArray(userFront, 35);
        int[] userBack = new int[2];
        System.out.println("请输入后区2个数字：");
        inputArray(userBack, 12);

        //输出自选号码与中奖号码
        System.out.println("------------------");
        System.out.print("中奖号码：");
        printArray(front);
        System.out.print("\t");
        printArray(back);
        System.out.println();
        System.out.print("自选号码：");
        printArray(userFront);
        System.out.print("\t");
        printArray(userBack);
        System.out.println();
        System.out.println("------------------");

        //计算重合
        int frontCount = countSame(front, userFront);
        int backCount = countSame(back, userBack);
        //判断中奖
        if (frontCount == 5 && backCount == 2) {
            System.out.println("恭喜中奖一等奖");
        } else if (frontCount == 5 && backCount == 1) {
            System.out.println("恭喜中奖二等奖");
        } else if ((frontCount == 5 && backCount == 0) || (frontCount == 4 && backCount == 2)) {
            System.out.println("恭喜中奖三等奖");
        } else if ((frontCount == 4 && backCount == 1) || (frontCount == 3 && backCount == 2)) {
            System.out.println("恭喜中奖四等奖");
        } else if ((frontCount == 4 && backCount == 0) || (frontCount == 3 && backCount == 1) || (frontCount == 2 && backCount == 2)) {
            System.out.println("恭喜中奖五等奖");
        } else if ((frontCount == 3 && backCount == 0) || (frontCount == 1 && backCount == 2) || (frontCount == 2 && backCount == 1) || (frontCount == 0 && backCount == 2)) {
            System.out.println("恭喜中奖六等奖");
        } else {
            System.out.println("未中奖");
        }


    }

    //判断重复数
    public static boolean isRepeat(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

    //随机生成不重复数字构成数组
    public static void randomArray(int[] arr, int size) {
        for (int i = 0; i < arr.length; ) {
            int randex = RANDOM.nextInt(size) + 1;
            boolean flag = isRepeat(arr, randex);
            if (!flag) {
                arr[i] = randex;
                i++;
            }
        }
    }

    //输入不重复的数字构成数组
    public static void inputArray(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int input = sc.nextInt();
            if (input > size || input < 1) {
                System.out.println("输入的数字超出范围");
                continue;
            }
            boolean flag = isRepeat(arr, input);
            if (flag) {
                System.out.println("输入的数字重复");
                continue;
            }
            arr[i] = input;
            i++;
        }
    }

    //输出数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }

    //判断重合
    public static int countSame(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = isRepeat(arr2, arr1[i]);
            if (flag) {
                count++;
            }
        }
        return count;
    }

}
