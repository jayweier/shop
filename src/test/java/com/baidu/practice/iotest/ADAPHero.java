package com.baidu.practice.iotest;

public class ADAPHero extends Hero implements AD,AP{
    //设计一类英雄，既能进行物理攻击，又能进行魔法攻击
    //一种英雄，能够同时进行物理攻击和魔法攻击
    //比如伊泽瑞尔，皮城女警凯特琳
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
