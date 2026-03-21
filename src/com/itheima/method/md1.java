package com.itheima.method;

public class md1 {

    public static void main(String[] args) {

        /*
            练习:定义一个方法,求两个数的和


            定义格式:
                public static 返回值类型 方法名(参数1,参数2 .. ){
                方法体;
                return 返回值;
                }

            调用格式:
                方法名(参数1,参数2 ... );

            注意点:
                1. 方法跟方法之间是平级关系,不能互相嵌套
                2. 方法不会主动运行的,需要被调用才可以
                3. 小括号中的参数需要一一对应(个数,类型)

            // 小诀窍:
                1. 观察在大段的代码当中,反复使用的独立功能是什么?
                2. 这个独立功能,需要什么才能完成 ?
                3. 方法的调用处,是否需要这个独立功能的结果继续做其他事情?

            //方法的注意点
            1 方法不调用就不执行
            2 方法与方法之间是平级关系,不能嵌套定义
            3 调用方法会优先调用形参和实参一一对应的,如果没有才会进行隐式转换
            4 return:1.结束方法 2.将结果返回给调用者
            5 void: 没有返回值,可以省略return不写
              如果不省略,return后面不能写具体数据,
              仅表示结束方法
        */

        // 调用方法
        //实参 10,20
        int add = getSum(10,20);
        System.out.println(add);

        System.out.println(getSum(10,20));


    }

    // 定义方法
    //形参 a,b
    public static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }

}
