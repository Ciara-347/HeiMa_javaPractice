package com.itheima.loopfor;

public class fd3 {

    public static void main(String[] args) {
        /*
            案例4:求和
            需求:在实际开发中,如果要获取一个范围中的每一个数据时,也会用到循环。
            要求:求1-5之间的和
        */

        int sum = 0;
        for(int i =1; i<=5; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
