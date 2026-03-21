package com.itheima.ifdemo;

import java.util.Scanner;

public class ifd5 {

    public static void main(String[] args) {
        /*
        外卖优惠卷
            需求:小明在每次订外卖都会在多家平台对比,看谁的优惠力度更大
            已知:
                饱了么App:全场9折优惠
                美单App:满30减10元
            请问1:
                小明买了一吨烧烤50元,在哪家下单更划算
            请问2:
                如果价格不确定,数据由键盘录入而来呢?
       */

        //2

        //录入价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        Double price = sc.nextDouble();
        //算折扣价
        Double bao = price * 0.9;
        Double mei;
        if(price>=30){
            mei = price - 10;
        }else{
            mei = price;
        }
        if (bao < mei){
            System.out.println("请选择饱了吗");
        }else if(mei < bao){
            System.out.println("请选择美单");
        }else {
            System.out.println("请选择任意一家");
        }
    }
}
