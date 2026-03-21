package com.itheima.loopfor;

public class fd6 {

    public static void main(String[] args) {

        /*
            案例7:数字规律(牛客)
            有一组特殊的数字,从第三项开始,每一项都是前两项的数字和,请问第10项的数字是多少?
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...
        */

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for(int i=3;i<=10;i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(sum);
    }
}
