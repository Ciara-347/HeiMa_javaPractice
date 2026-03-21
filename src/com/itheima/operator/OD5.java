package com.itheima.operator;

public class OD5 {

    public static void main(String[] args) {
        /* 练习二:
        检查下面代码,程序运行的时候是否会报错,如果会,请说明错误原因*/
        short s1 = 100;
        short s2 = 200;
        // byte result2 = s1 + s2;
        // System.out.println(result2);
        //会报错，因为s1和s2都是short类型，结果是int类型，不能赋给byte类型变量

        //修改1：
        //300：二进制 00000001 00101100
        //强制转换byte：00101100（44）
        byte result2 = (byte)(s1 + s2);
        System.out.println(result2);//44

        //修改2：
        int result3 = s1 + s2;
        System.out.println(result3);//300
    }
}
