package com.itheima.switchDemo;

public class swd2 {

    public static void main(String[] args) {
        /*
            switch的注意点:
            1. 表达式:结果(字符/整数byte short int/枚举/字符串)---跳转表,索引不支持小数,也不支持大的整数long
            2. case:被匹配的值,只能是真实的数据---不能写变量
            3. case:值不允许重复
            4. break:表示中断,结束的意思,结束switch语句--- break关键字,作用结束switch语句
            5. default:所有情况都不匹配,执行该处的内容---与if语句的else类似
        */

        /*
            1. default的位置和省略
                位置:case和default是没有标准的上下之分,位置可以任意的书写
                    为了观看比较方便,提高代码的阅读性
                    一般来讲,case从小到大依次书写的,default是写在最下面的
                省略:default是可以省略不写的,在此时如果所有的case都不匹配,则没有任何的输出结果

            2. case穿透
                    在我们写代码的时候,如果break没有写,此时就会触发case穿透现象
               执行流程:
                    1. 拿着小括号中表达式的值跟下面的case进行匹配
                    2. 如果匹配上了,就会执行case里面的语句体,遇到break结束整个的switch(正常情况)
                    3. 如果在执行语句体的时候没有看到break,那么程序会继续执行下一个case的语句体,直到遇到break或者运行完整个的switch为止
               应用场景:
                    当多个case的语句体重复的时候,利用case穿透节省代码

            3. switch新特性: JDK12预览版 JDK14正式版
                一、箭头标签
                二、case后面可以写多个值
                三、switch可以有运行结果
                四、yield关键字
                //如果要继续使用switch的结果，需要用特性三四的结构写法

        */

        //特性一二
        int num = 10;
        switch (num) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3  ->{
                System.out.println("三");
            }
            default ->{
                System.out.println("没有");
            }

            case 4,5 -> System.out.println("四");
        }

        //特性三四
        String name = switch ( num){
            case 6,7 -> {
                yield "六七";
            }
            case 8,9 -> {
                yield "八";
            }
            default -> {
                yield "没有";
            }

            //代码只有一个语句的时候，可以省略{}和yield
            // case 10 -> "十";
        };

        System.out.println(name);
    }
}
