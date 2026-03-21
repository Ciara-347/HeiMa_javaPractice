package com.itheima.method;

import java.util.Random;

public class md2 {

    public static void main(String[] args) {

        /*
            去除重复元素(力扣算法)
            获取10个1-100之间的随机数并存入到数组当中,
            要求保证数据是唯一的
        */

        //创建随机数
        Random r = new Random();
        //array
        int [] arr = new int[10];
        for(int i = 0;i< arr.length;){
            int randex = r.nextInt(100)+1;
            //判断index
            if(!contains(arr,randex)){
                arr[i]=randex;
                i++;
            }

        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }



    }

    // 定义方法,判断数组中是否存在某个元素
    public static boolean contains(int[]arr,int randex){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==randex){
                return true;
            }
        }
        return false;
    }
}
