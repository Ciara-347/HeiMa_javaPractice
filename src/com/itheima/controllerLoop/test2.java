package com.itheima.controllerLoop;

public class test2 {

    public static void main(String[] args) {

        /*
            打印四行五列*
            *****
            *****
            *****
            *****
            每次打一个
        */

        for (int i=1;i<=4;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
