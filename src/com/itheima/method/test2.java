package com.itheima.method;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        /*
            作业2:计算班级分数
            班主任需要统计10名学生的数学成绩(0-100分),
            计算及格率,平均分,并找出最高分。
            要求1:键盘录入10名学生的成绩,存入数组。
             超出范围,提示“成绩无效,请重新输入”。
            要求2:定义方法,求及格人数,根据及格人数,求及格率。
            要求3:定义方法求总分,根据总分求平均分
            要求4:定义方法求最大值。
        */

        //创建数组
        int[] scores = new int[10];
        //录入数据
        getArray(scores,0,100);
        //求及格人数
        int count = getCount(scores);
        System.out.println("及格人数："+count);
        //求及格率
        double rate = getRate(scores.length, count);
        System.out.println("及格率："+rate);
        //求总分
        int sum = getSum(scores);
        System.out.println("总分："+sum);
        //求平均分
        double average = getAverage(scores);
        System.out.println("平均分："+average);
        //求最大值
        int max = getMax(scores);
        System.out.println("最大值："+max);
    }

    //arr
    /*
        数组是引用传递，方法内部修改会影响原数组，
        所以不需要返回。可以改为 void，
        主方法中直接调用即可
    */
    public static void getArray(int[] arr, int min, int max) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= arr.length; ) {
            System.out.println("请输入第" + i + "个得分");
            int score = sc.nextInt();
            if (min <= score && score <= max) {
                arr[i - 1] = score;
                i++;
            } else {
                System.out.println("成绩无效,请重新输入");
            }
        }
    }
    //及格人数
    public static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }
    //及格率
    public static double getRate(int length, int count) {
        return count * 1.0 / length;
    }
    //总分
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //平均分
    public static double getAverage(int[] arr) {
        return getSum(arr) * 1.0 / arr.length;
    }
    //最高分
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}
