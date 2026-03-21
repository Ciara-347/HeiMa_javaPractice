package com.itheima.array;

public class work1 {

    public static void main(String[] args) {

        /*
            作业1:两数之和(力扣算法)
            给定一个整数数组nums和一个整数目标值target,
            请你在该数组中找出和为目标值target 的那两个
            整数,并输出它们的数组索引。
            提示:先不用考虑效率问题,两层循环即可完成
            要求1:只要输出第一对满足要求的情况
            要求2:输出所有满足要求的情况
        */

        //1
        //创建数组
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        //创建变量
        int target = 9;
        //创建flag
        boolean flag = false;
        //创建循环
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }

        System.out.println("------------------");
        
        //2
        //创建循环
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                }
            }
        }
        
        
    }
}
