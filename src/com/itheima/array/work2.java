package com.itheima.array;

public class work2 {

    public static void main(String[] args) {

        /*
            作业2:合并有序数组(力扣算法)
            给你两个有序数组arr1 和 arr2
            将两个数组中的数据合并到一个大数组中。
            要求:合并之后的大数组也是有序的
            举例1:
            arr1: 13579
            arr2: 246810
            arr3 : 12345678910
        */

        // 创建两个有序数组
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        // 创建一个新数组,用于存放合并之后的数据
        int[] arr3 = new int[arr1.length + arr2.length];
        // 定义两个指针,分别指向两个有序数组的起始位置
        int p1 = 0;
        int p2 = 0;
        while(p1 < arr1.length && p2 < arr2.length){
            // 比较两个数组的元素
            if(arr1[p1] < arr2[p2]){
                // 将arr1的元素放到arr3中
                arr3[p1 + p2] = arr1[p1];
                // p1后移
                p1++;
            }else{
                // 将arr2的元素放到arr3中
                arr3[p1 + p2] = arr2[p2];
                // p2后移
                p2++;
            }
        }
        while(p1 < arr1.length){
            // 将arr1剩余的元素放到arr3中
            arr3[p1 + p2] = arr1[p1];
            // p1后移
            p1++;
        }

        while(p2 < arr2.length){
            // 将arr2剩余的元素放到arr3中
            arr3[p1 + p2] = arr2[p2];
            // p2后移
            p2++;
        }

        for(int i = 0;i < arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
