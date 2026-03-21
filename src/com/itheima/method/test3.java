package com.itheima.method;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {

        /*
            作业3:计算快递邮费
            某快递公司的运费规则如下
            (首重1kg,超出部分按kg计算,不足1kg按1kg算):
            首重1kg:10元;
            超出1-5kg:每kg加2元;
            超出5kg以上:每kg加1.5元。
            键盘录入小数,表示用户快递的重量,计算最终的结果
            要求1:快递重量必须大于0,否则重新输入
            要求2:不同价位的计算,单独定义一个方法
        */
        //录入数据
        Scanner sc = new Scanner(System.in);
        double weight;
        while(true) {
            System.out.println("请输入快递的重量");
            weight = sc.nextDouble();
            if (weight > 0) {
                break;
            } else {
                System.out.println("快递重量必须大于0,请重新输入");
            }
        }
        //获取快递价格
        double price = getPrice(weight);
        //输出价格
        System.out.println("快递价格："+price);
    }

    //定义方法，价格运算
    public static double getPrice(double weight){
        double baseCost=10.0;

        if(weight<=1.0){
            return baseCost;
        }

        //计算超重部分
        double overWeight=weight-1.0;
        int ceilWeight = (int)Math.ceil(overWeight);

        //计算超重部分价格
        double overPrice=calculateOverPrice(ceilWeight);

        //返回总价
        return baseCost+overPrice;
    }

    //计算超出部分价格
    public static double calculateOverPrice(int kg){
        if(kg<=0){
            return 0;
        }

        if(kg<=5){
            return kg*2.0;
        }

        return 10.0+(kg-5)*1.5;
    }
}
