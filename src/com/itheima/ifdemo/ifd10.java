package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd10 {

    public static void main(String[] args) {
        /*计算BMI*/

        //输入身高，体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        //计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI：" + bmi);
        //判断
        if (bmi < 18.5) System.out.println("身体状态：消瘦，健康风险：增加");
        else if (bmi < 24) System.out.println("身体状态：正常，健康风险：正常");
        else if (bmi < 27) System.out.println("身体状态：偏胖，健康风险：增加");
        else if (bmi < 30) System.out.println("身体状态：肥胖，健康风险：中度增加");
        else System.out.println("身体状态：严重肥胖，健康风险：严重增加");
    }
}
