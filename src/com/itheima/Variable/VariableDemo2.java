package com.itheima.Variable;

public class VariableDemo2 {

    public static void main(String[] args) {
        /*
            我方：叉子       对方：长手
            攻击：220       攻击：210
            防御：85        防御：80
            血量：1012.5    血量：1223.3
            技能加成：1.2    技能加成：1.3

            技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
            普攻造成伤害的公式：攻击力 - 对方防御力

            计算：
            我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
            我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？

        */

        //1.定义变量
        int myAttack = 220;
        int myDefense = 85;
        double mySkillAdd = 1.2;
        double myHp = 1012.5;
        int enemyAttack = 210;
        int enemyDefense = 80;
        double enemyHp = 1223.3;
        double enemySkillAdd = 1.3;
        //2.计算
        double ADamage1=myAttack - enemyDefense;
        double ememyHp=enemyHp-ADamage1;
        System.out.println("我方第一次普通攻击，造成"+ADamage1+"伤害，对方还剩余"+ememyHp+"血量");

        double SDamage1=myAttack * mySkillAdd - enemyDefense;
        ememyHp=enemyHp-SDamage1;
        System.out.println("我方第二次技能攻击，造成"+SDamage1+"伤害，对方还剩余"+ememyHp+"血量");

    }
}
