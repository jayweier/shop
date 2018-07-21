package com.baidu.practice.iotest;


//在设计LOL的时候，进攻类英雄有两种，一种是进行物理系攻击，一种是进行魔法系攻击
//
//这时候，就可以使用接口来实现这个效果。
//
//接口就像是一种约定，我们约定某些英雄是物理系英雄，那么他们就一定能够进行物理攻击。
public interface AD {
    //创建一个物理攻击接口
    //声明一个方法 physicAttack 物理攻击，但是没有方法体，是一个“空”方法
    //物理伤害
    public void physicAttack();

}
