package com.itheima.array;

import java.util.Random;

public class test4 {

    public static void main(String[] args) {

        /*
            去除重复元素(力扣算法 课堂练习 独立完成)
            需求:先获取10个0-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        */

        //创建随机数
        Random r = new Random();
        //array
        int [] arr = new int[10];
        for(int i = 0;i< arr.length;i++){
            int randex = r.nextInt(100);
            for(int j=0;j<i;j++){
                if(arr[j]==randex){
                    i--;
                    break;
                }else{
                    arr[i]=randex;
                }
            }
            arr[i]=randex;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
