package com.itheima.test;

import java.util.Random;

public class test4 {

    public static void main(String[] args) {

        /*
            统计个数（多数据统计）（利用数组）
            学校选举学生会主席,有5个候选人
            全校1000名同学参与投票
            (每人一票,可以弃权,或者选1-5号)。
            投票使用Random模拟。
            0:弃权,1~5:给对应的候选人投票
            要求1:
            统计每个候选人的得票数和得票率,找出得票最多的候选人?
            要求2:
            统计弃票数和弃票率是多少?
        */
        Random r = new Random();
        //创建一个长度为6的数组，数组的索引0表示弃权，1-5表示候选人
        int[] votes = new int[6];
        //循环1000次，模拟投票
        for (int i = 0; i < 1000; i++) {
            int vote = r.nextInt(6);
            //计数
            votes[vote]++;
        }
        //统计每个候选人的得票数和得票率
        for (int i = 1; i < votes.length; i++) {
            System.out.println("第" + i + "个候选人的得票数是：" + votes[i] + ",得票率是：" + getRate(votes[i], 1000)+"%");
        }
        //找出最多的候选人
        int maxIndex = getMaxIndex(votes);
        System.out.println("第" + maxIndex + "个候选人得票最多,得票："+votes[maxIndex]);
        //统计弃票数和弃票率
        System.out.println("弃票数是：" + votes[0]+",弃票率是：" + getRate(votes[0], 1000)+"%");
    }

    public static Double getRate(int count, int total){
        return count * 1.0 / total*100;
    }

    public static int getMaxIndex(int[] arr){
        int maxIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
