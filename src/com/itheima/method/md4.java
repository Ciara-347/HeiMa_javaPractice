package com.itheima.method;

public class md4 {

    public static void main(String[] args) {

        /*打印九九乘法表*/
        printMulTable();

    }

    // 定义方法
    //没有参数的方法，调用时不需要带参数，实参为空
    public static void printMulTable(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
