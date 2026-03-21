package com.itheima.loopfor;

public class fd2 {

    public static void main(String[] args) {
        /*
            基础案例2-3:正向/反向输出数字
            需求:在实际开发中,如果要获取一个范围中的每一个数据时,就会用到循环。
            要求1:打印1-5
            要求2:打印5-1
        */

        // 1.正向输出
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        // 2.反向输出
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
}
