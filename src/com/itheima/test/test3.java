package com.itheima.test;

public class test3 {

    public static void main(String[] args) {
        /*
            中位数（二路归并）
            给定两个正序数组arr1和arr2,请先合并数组,
            并找出合并之后数组的中位数。
            举例:
            123456789
            中位数：5
            123456
            中位数:
            (3+4) / 2
        */
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};
        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println(median);

    }

    public static double findMedianSortedArrays(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        // 合并数组（二路归并）
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        // 找出中位数
        if (arr3.length % 2 == 0) {
            return (arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) / 2.0;
        }else{
            return arr3[arr3.length / 2];
        }
    }
}
