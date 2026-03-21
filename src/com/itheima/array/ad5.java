package com.itheima.array;

import java.util.Scanner;

public class ad5 {

    public static void main(String[] args) {

        /*
            查找数据
            需求:已知数组元素为{33,5,22,44,55,33}
            键盘录入任意一个数据,查找这个数据在数组中是否存在
            如果数组中要查找的数据出现多次,只要显示第一次的索引即可
            输出要求:
            如果存在打印索引
            如果不存在,提示:
            “该数据不存在”
        */

        //创建数组
        int[] arr = {33,5,22,44,55,33};

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

        //遍历数组 方法1
        int num=0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("该数据在数组中的索引为："+i+" "+arr[i]);
                break;
            }else{
                num++;
            }
        }
        if(num==arr.length){
            System.out.println("该数据不存在");
        }

        //遍历数组 方法2（flag）
        //记录数组中是否存在number false：不存在 true：存在
        boolean flag = false;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("该数据在数组中的索引为："+i+" "+arr[i]);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("该数据不存在");
        }

    }
}
