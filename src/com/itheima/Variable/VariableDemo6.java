package com.itheima.Variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);

        //接收键盘录入整数
        int num1 = sc.nextInt();
        System.out.println(num1);
        //接收键盘录入小数
        Double num2 = sc.nextDouble();
        System.out.println(num2);
        //接收键盘录入文本
        String name = sc.next();
        System.out.println(name);


    }
}
