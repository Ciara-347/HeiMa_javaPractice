package com.itheima.method;

public class md3 {

    public static void main(String[] args) {

        /*
            方法练习:遍历数组
            定义一个方法遍历数组
            遍历格式如下:
            [1, 2, 3, 4, 5]
        */

        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }

    // 定义方法
    //没有返回值，不需要把结果返回调用处，此时返回值类型void
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
