package com.itheima.array;

public class test5 {

    public static void main(String[] args) {

        /*
            去除重复元素(力扣算法)
            给定义一个递增有序数组,去除其中重复元素
        */

        //创建数组
        int[] arr = {1,2,2,3,4,5,5,6,7,8,8,9,10};
        //创建快慢指针
        int slow = 0;
        int fast = 1;
        while(fast < arr.length){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        for(int i = 0;i <= slow;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
