package com.itheima.method;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args){

        /*
            作业1:评委打分
            跳水比赛有五个评委打分,分数在0~100之间。
            最终得分会去掉一个最高分,去掉一个最低分,
            剩余的分数再求平均数,改平均数为选手最终得分。
            要求1:利用键盘录入5个整数存入数组当中,
             如果分数超出范围需要重新录入
            要求2:定义方法分别求数组的最大值和最小值
            要求3:计算五名评委的总分
            要求4:总分-最大值-最小值,求选手最终平均分
        */

        //创建数组储存分数
        int[] arr1=new int[5];
        //获取分数
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5;){
            System.out.println("请输入第"+i+"个得分");
            int score =sc.nextInt();
            if(0<=score&&score<=100){
                arr1[i-1]=score;
                i++;
            }else{
                System.out.println("请重新输入");
            }
        }
        //max min
        int max=getMax(arr1);
        System.out.println("最大值："+getMax(arr1));
        int min=getMin(arr1);
        System.out.println("最小值："+getMin(arr1));
        //sum
        int sum=getSum(arr1);
        System.out.println("总分："+getSum(arr1));
        //averageScore
        int averageScore;
        averageScore=(sum-max-min)/3;
        System.out.println("平均分："+averageScore);
    }

    //max
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    //min
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    //sum
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
