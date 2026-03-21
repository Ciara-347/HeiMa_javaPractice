package com.itheima.method;

public class md6 {

    public static void main(String[] args) {

        /*
            方法重载小练习
            定义方法完成下面的代码:
            需求:
            求两个整数的和
            求三个整数的和
            求四个整数的和

            //方法重载:
                1.同一个类中,定义了多个同名的方法,
                  这些方法具有类似的功能
                2.每个方法具有不同的参数类型和参数个数,
                  这些同名的方法,就构成了重载关系
                简单理解:同一个类,方法名相同,参数不同的方法,
                无需看返回值。
                个数不同 方法一:int/ 方法二:int int
                类型不同 方法一:int/ 方法二:double
                顺序不同 方法一:int double/ 方法二:double int

           //优先调用实参、形参一一对应的方法
           //方法重载一般不写成顺序不同的方式，避免程序混乱
        */

        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
    public static double getSum(int a, double b) {
        return a + b;
    }
    /*public static int getSum(double a, int b) {
        return a + b;
    }*/
    public static double getSum(double a, double b) {
        return a + b;
    }
}
