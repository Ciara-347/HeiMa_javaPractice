package com.itheima.Variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args){
        /*
            BMI身体质量指数计算公式：BMI=体重÷身高²（体重单位：千克，身高单位：米）
            | BMI 数值(kg/m²) | 身体状态 | 健康风险 |
            | <18.5 | 消瘦 | 部分增加 |
            | 18.5-23.9 | 正常 | 正常 |
            | 24.0-26.9 | 偏胖 | 增加 |
            | 27.0-29.9 | 肥胖 | 中度增加 |
            | ≥30 | 严重肥胖 | 严重增加 |
        */

        //计算BMI
        //1.录入身高体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        Double height = sc.nextDouble();
        System.out.println("请输入体重：");
        Double weight = sc.nextDouble();
        Double bmi = weight / (height * height);
        System.out.println(bmi);

        //扩展
        //计算出你当前身高在标准bmi范围内,体重最多多少kg
        Double maxweight=23.9*(height*height);
        System.out.println("你当前身高在标准bmi范围内,体重最多"+maxweight+"kg");
    }
}
