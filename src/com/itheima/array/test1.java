package com.itheima.array;

public class test1 {

    public static void main(String[] args) {

        /*
            求最值
            需求:已知数组元素为{33,5,22,44,55}
            请找出数组中最大值并打印在控制台
            请找出数组中最小值并打印在控制台
        */
        
        //创建数组
        int[] arr = {33,5,22,44,55};
        //创建变量保存最大值
        int max = arr[0];
        //遍历数组
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);

        //创建变量保存最小值
        int min = arr[0];
        //遍历数组
        for(int i = 1;i<arr.length;i++){
            if (min > arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}