package com.itheima.array;

import java.util.Scanner;

public class work3 {

    public static void main(String[] args) {

        /*
            作业3:查找元素(力扣算法)
            给定一个递增的有序数组和一个目标值,在数组中找到目标值,打印其索引。
            如果目标值不存在于数组中,打印应插入的位置
            举例1:
            数据:nums=[1,3,5,6];
            输出:2
            举例2:
            数据:nums=[1,3,5,6], target=2
            输出:1
            举例3:
            数据:nums=[1,3,5,6], target=7
            输出:4
            target = 5
        */

        //创建数组
        int[] nums = {1,3,5,6};
        //创建目标值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标值:");
        int target = sc.nextInt();
        //创建flag
        boolean flag = false;
        //循环查找
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("目标值所在位置是："+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            boolean flag2 = false;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]>target){
                    System.out.println("目标值应插入的位置是："+i);
                    flag2 = true;
                    break;
                }
            }
            if(!flag2){
                System.out.println("目标值应插入的位置是："+nums.length);
            }
        }
    }
}
