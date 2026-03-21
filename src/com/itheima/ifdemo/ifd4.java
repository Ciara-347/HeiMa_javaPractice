package com.itheima.ifdemo;

public class ifd4 {

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

        //1
        Double cost = 50.0;
        Double bao = cost * 0.9;
        Double mei = cost - 10;
        if(bao < mei){
            System.out.println("小明在饱了么App下单更划算");
        }else{
            System.out.println("小明在美单App下单更划算");
    }


    }
}
