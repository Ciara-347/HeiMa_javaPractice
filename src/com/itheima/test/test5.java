package com.itheima.test;

public class test5 {

    public static void main(String[] args) {

        /*
            接雨水
            给定n个非负整数表示每个宽度为1的柱子的高度图,
            计算按此排列的柱子,下雨之后能接多少雨水
            输入:height =[0,1,0,2,1,0,1,3,2,1,2,1]
            输出:6
            解释:下面是由数组[0,1,0,2,1,0,1,3,2,1,2,1]
            表示的高度图,在这种情况下
            可以接6个单位的雨水(蓝色部分表示雨水)
        */

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int max = getMax(height);
        int trap = getTrap(height, max);
        System.out.println(trap);

    }

    //找到数组中最大的数
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    //创建方法，得出被困的雨水
    public static int getTrap(int[] arr,int max){
        //创建变量保存被困的雨水
        int trap = 0;
        //从最大值反向循环
        for (int i = max; i >= 1; i--) {
            //创建变量保存当前柱子的索引
            int index1 = arr.length;
            //遍历数组
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=i){
                    if(index1==arr.length){
                        index1=j;
                    }else{
                        trap += (j - index1 - 1);
                        index1 = j;
                    }
                }
            }
        }
        return trap;
    }
}
