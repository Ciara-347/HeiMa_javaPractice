package com.itheima.controllerLoop;

import java.util.Scanner;

public class breakd2 {

    public static void main(String[] args) {

        /*
            练习14:游戏人物的血条
            需求:初始最大生命200,受到X点伤害,技能恢复Y点血,X和Y由键盘录入而来
                假设,游戏人物不会死亡,最少1点血
            问:最终游戏人物血量是多少?
        */

        //创建键盘录入数据
        Scanner sc = new Scanner(System.in);
        //录入X
        int x;
        while (true){
            System.out.println("请输入X：");
            x = sc.nextInt();
            if(x>0) break;
            else System.out.println("输入的X不能为负数");
        }
        //录入Y
        int y;
        while (true){
            System.out.println("请输入Y：");
            y = sc.nextInt();
            if(y>0) break;
            else System.out.println("输入的Y不能为负数");
        }



        //创建变量，保存初始血量
        int hp = 200;
        //计算最终血量
        hp = hp - x;
        if (hp <= 0){
            hp=1;
        }
        hp=hp+y;
        if (hp>200){
            hp=200;
        }
        System.out.println("最终血量：" + hp);
    }
}
