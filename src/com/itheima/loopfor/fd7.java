package com.itheima.loopfor;

import java.util.Scanner;

public class fd7 {

    public static void main(String[] args) {
        /*
            练习8:数列之和(牛客)

            描述
            牛牛开始学习数列啦。现在他想计算以下数列前n项的和:
            S(n) = 1 - 2 + 3 - 4 + ...

            示例1:
            输入:4
            说明:S(4)=1-2+3-4 =- 2
            输出 :- 2
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1;i<=n;i++){
            sum += i * Math.pow(-1,i+1);
        }
        System.out.println(sum);
    }
}
