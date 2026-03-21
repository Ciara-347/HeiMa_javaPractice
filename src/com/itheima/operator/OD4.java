package com.itheima.operator;

public class OD4 {

    public static void main(String[] args){

        // 练习一:
        byte b = 100;
        short s = 200;
        double d = 20.3;

        // 请说出下面代码在计算的时候,类型转换的情况
        double result1 = b + s + d;
        System.out.println(result1);
        // byte -> int -> long -> double
        // short -> int -> long -> double
    }
}
