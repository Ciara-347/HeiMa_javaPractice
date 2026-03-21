package com.itheima.controllerLoop;

public class breakd1 {

    public static void main(String[] args) {

        /*
            break关键字:
            不能单独出现的,只能写在switch或者循环当中,表示结束、跳出的意思
        */

        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
