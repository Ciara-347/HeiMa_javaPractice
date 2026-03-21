package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd7 {

    public static void main(String[] args) {
        /*
            需求:很多App都有不同的优惠券
            假设,现在有以下优惠券
                全场商品满10减8
                全场商品满50減30
                全场商品满100減50
                全场商品满200减90

                会员卡:全场8折
            请问:会员卡和优惠券不能同时使用,最优惠的价格是多少?
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        Double price = sc.nextDouble();

        Double vip = price * 0.8;
        Double coupon = 0.0;

        if (price > 0) {
            if (price >= 200) {
                coupon = price - 90;
            } else if (price >= 100) {
                coupon = price - 50;
            } else if (price >= 50) {
                coupon = price - 30;
            } else if (price >= 10) {
                coupon = price - 8;
            } else {
                coupon = price;
            }
        } else {
            System.out.println("价格输入错误");
        }

        if (vip < coupon) {
            System.out.println("会员价更优惠：" + vip);
        } else {
            System.out.println("优惠券更优惠：" + coupon);
        }



    }
}
