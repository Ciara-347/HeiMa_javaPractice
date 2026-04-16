package com.itheima.array;

import java.util.Random;

public class test3 {

    public static void main(String[] args){

        /*
            去除重复元素(力扣算法)
            需求:获取10个1-100之间的随机数并存入到数组当中,
            要求保证数据是唯一的
        */

        //创建随机数
        Random r = new Random();
        //array
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            int randex = r.nextInt(100)+1;
            for(int j = 0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arr[i] = randex;
            }else{
                i--;
            }
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}