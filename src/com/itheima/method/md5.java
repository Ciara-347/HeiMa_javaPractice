package com.itheima.method;

public class md5 {

    public static void main(String[] args) {

        /*
            比较面积大小
            给定两个长方形,判断哪个长方形的面积更大?
            如何定义方法?

            小诀窍:
                1. 观察在大段的代码当中,
                反复使用的独立功能是什么?
                反复使用+独立功能  求长方形的面积
                2. 这个独立功能,需要什么才能完成 ?
                --- 形参 长宽
                3. 方法的调用处,是否需要这个独立功能的结果
                继续做其他事情?
                必须要把面积返回
        */

        double area1 = getArea(10.1, 5.1);
        double area2 = getArea(20.1, 3.2);
        if (area1 > area2) {
            System.out.println("第一个长方形面积更大");
        } else if (area1 < area2) {
            System.out.println("第二个长方形面积更大");
        } else {
            System.out.println("两个长方形面积一样大");
        }
    }

    // 定义方法,求长方形的面积
    public static double getArea(double len, double width) {
        double area = len * width;
        return area;
    }
    // 定义方法,比较两个长方形的面积大小

}
