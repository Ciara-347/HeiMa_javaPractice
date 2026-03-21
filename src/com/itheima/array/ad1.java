package com.itheima.array;

public class ad1 {

    public static void main(String[] args) {

        /*
            数组定义的练习
            按照要求定义数组,数组中的数据任意书写
            1.定义数组存储3位同学的年龄
            2. 定义数组存储5位同学的身高
            3. 定义数组存储3位同学的名字
        */

        int[] ages = {18,19,20};
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages.length);
        System.out.println("------------------");

        int[] heights = new int[5];
        heights[0] = 180;
        heights[1] = 170;
        heights[2] = 160;
        heights[3] = 190;
        heights[4] = 165;
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);
        System.out.println(heights[3]);
        System.out.println(heights[4]);
        System.out.println(heights.length);
        System.out.println("------------------");

        String[] names = {"张三","李四","王五"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names.length);
        System.out.println("------------------");
    }
}
