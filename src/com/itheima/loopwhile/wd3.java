package com.itheima.loopwhile;

public class wd3 {

    public static void main(String[] args) {

        /*
            练习11:折叠纸张(经典算法小题)
            需求:世界最高山峰珠穆朗玛峰高度是:8848.86米=8848860毫米,
                假如我有一张足够大的纸,它的厚度是0.1毫米。
            请问:该纸张折叠多少次,可以折成珠穆朗玛峰的高度?
        */

        int i = 0;
        double height = 0.1;
        while(height<8848860){
            height *= 2;
            i++;
        }
        System.out.println(i);
    }
}
