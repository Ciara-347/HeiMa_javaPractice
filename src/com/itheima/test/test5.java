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
//        //解法1（分层计算）
//        int max = getMax(height);
//        int trap = getTrap(height, max);
//        System.out.println(trap);

        //解法2（动态规划）
        int trap = getTrap2(height);
        System.out.println(trap);


    }

    //创建方法，找到数组中 trap
    public static int getTrap2(int[] arr){
        //创建变量保存雨水
        int trap = 0;

        //1 从左往右遍历，记录雨水+柱子面积总和
        //1.1 定义数组记录从左往右的数据
        int[] left = new int[arr.length];
        //1.2 定义第三方变量temp 保存当前柱子高度
        int temp1 = arr[0];
        //1.3 遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(temp1>arr[i]){
                left[i] = temp1;
            }else{
                left[i] = arr[i];
                temp1 = arr[i];
            }
        }

        //2 从右往左遍历，记录雨水+柱子面积总和
        //2.1 创建数组记录从右往左的数据
        int[] right = new int[arr.length];
        //2.2 定义第三方变量temp2 保存当前柱子高度
        int temp2 = arr[arr.length-1];
        //2.3 遍历数组
        for (int i = arr.length-1; i >= 0; i--) {
            if(temp2>arr[i]){
                right[i] = temp2;
            }else {
                right[i] = arr[i];
                temp2 = arr[i];
            }
        }

        //3 遍历数组，计算雨水
        //3.1 创建数组保存雨水数据
        int[] trapArr = new int[arr.length];
        //3.2 遍历数组
        for (int i = 0; i < arr.length; i++) {
            trap += Math.min(left[i],right[i])-arr[i];
        }
        return trap;
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
