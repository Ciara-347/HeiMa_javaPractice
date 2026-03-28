package com.itheima.test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        /*
            移除元素
            给你一个数组nums和一个值val,
            你需要删除所有数值等于val的元素
            举例1:
            输入:nums=[3,2,2,3] val=3
            输出:nums=[2,2] 剩余2个元素
            举例1:
            输入:nums=[0,1,2,2,3,0,4,2] val=2
            输出: nums = [0,1,4,0,3] 剩余5个元素
        */

        //创建数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数：");
        int length = sc.nextInt();
        int[] nums = new int[length];
        getArray(nums);
        System.out.println("原数组：");
        printArray(nums);
        //获取值
        System.out.println("请输入要删除的值：");
        int val = sc.nextInt();
        //删除元素
        int[] newArr = removeElement(nums, val);
        //输出新数组
        System.out.println("新数组：");
        printArray(newArr);
        System.out.println("剩余"+newArr.length+"个元素");
    }

    //录入数据
    public static void getArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素：");
            arr[i] = sc.nextInt();
        }
    }

    //计算新数组长度
    public static int getNewLength(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                count++;
            }
        }
        return count;
    }

    //删除元素
    public static int[] removeElement(int[] arr, int val) {
        int[] newArr = new int[getNewLength(arr, val)];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    //打印数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }

}
