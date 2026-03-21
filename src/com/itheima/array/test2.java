package com.itheima.array;

import java.util.Random;

public class test2 {

    public static void main(String[] args) {

        /*
            打乱数组中的数据
            需求:已知数组元素为{1,2,3,4,5,6,7,8,9,10}
            要求:打乱数组中的数据
        */

        // 创建数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Random r = new Random();
        for(int i = 0;i < arr.length;i++){
            // 获取随机索引
            int randex = r.nextInt(arr.length);
            //交换数组中i和随机索引位置的元素
            int temp = arr[i];
            arr[i] = arr[randex];
            arr[randex] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
