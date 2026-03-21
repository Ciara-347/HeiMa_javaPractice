package com.itheima.array;

public class ad2 {

    public static void main(String[] args) {

        /*
            数组中元素的访问:
            1. 获取数据
            2. 修改数据
        */

        int[] arr = {10,20,30,40,50};

        //1. 获取数据
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("----------");

        //2. 修改数据
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
