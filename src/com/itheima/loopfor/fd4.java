package com.itheima.loopfor;

public class fd4 {

    public static void main(String[] args) {

        /*
            案例5:求偶数和
            需求:在实际开发中,如果要获取一个范围中的每一个数据时,会用到循环。
                但是,如果不想获取所有的数据,而是获取其中符合要求的数据。
                此时就需要循环和其他语句结合使用了。
            比如:求1-100之间的偶数和
        */

        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
